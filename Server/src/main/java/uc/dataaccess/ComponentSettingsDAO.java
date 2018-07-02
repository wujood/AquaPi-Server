package uc.dataaccess;

import uc.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComponentSettingsDAO extends DAOBase {

    public List<ComponentSettings> getComponentSettings(String piid) throws SQLException {
        return getComponentSettingsBase(piid);
    }

    public List<ComponentSettings> getComponentSettings() throws SQLException {
        return getComponentSettingsBase(null);
    }

    private List<ComponentSettings> getComponentSettingsBase(String piid) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<ComponentSettings> result = new ArrayList<>();

        try {
            connection = getConnection();
            if(piid == null || piid == "")
                statement = connection.prepareStatement("SELECT * FROM SIGNALS ORDER BY TIMESTAMP DESC LIMIT 60");
            else {
                statement = connection.prepareStatement("SELECT * FROM SIGNALS WHERE PI_ID = ? ORDER BY TIMESTAMP DESC LIMIT 60");
                statement.setString(1, piid);
            }
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                ComponentSettings componentSetting = new ComponentSettings();
                WaterFlowSensor waterFlowSensor = new WaterFlowSensor();
                LightSensor lightSensor = new LightSensor();
                WaterLevelSensor waterLevelSensor = new WaterLevelSensor();
                Thermometer waterThermometer = new Thermometer();
                Thermometer airThermometer = new Thermometer();
                Lamp lamp = new Lamp();
                Feeder feeder = new Feeder();
                Pump pump = new Pump();

                // PIID
                componentSetting.setPiId(resultSet.getString("PI_ID"));
                // TIMESTAMP
                componentSetting.setTimestamp(new java.util.Date(resultSet.getTimestamp("TIMESTAMP").getTime()));
                // WATERFLOW SENSOR
                waterFlowSensor.setValue(resultSet.getFloat("WATERFLOWSENSOR"));
                componentSetting.setWaterFlowSensor(waterFlowSensor);
                // LIGHT SENSOR
                lightSensor.setValue(resultSet.getFloat("LIGHTSENSOR"));
                componentSetting.setLightSensor(lightSensor);
                // WATER LEVEL SENSOR
                waterLevelSensor.setValue(resultSet.getFloat("WATERLEVELSENSOR"));
                componentSetting.setWaterLevelSensor(waterLevelSensor);
                // WATER THERMOMETER
                waterThermometer.setValue(resultSet.getFloat("WATER_THERMOMETER"));
                if(waterThermometer.getValue() > 30)
                    waterThermometer.setMessage("Warning! Water temperature is over 30°");
                componentSetting.setWaterThermometer(waterThermometer);
                // AIR THERMOMETER
                airThermometer.setValue(resultSet.getFloat("AIR_THERMOMETER"));
                if(airThermometer.getValue() > 30)
                    airThermometer.setMessage("Warning! Air temperature is over 30°");
                componentSetting.setAirThermometer(airThermometer);
                // LAMP
                lamp.setValue(resultSet.getFloat("LAMP"));
                componentSetting.setLamp(lamp);
                // FEEDER
                feeder.setValue(resultSet.getFloat("FEEDER"));
                componentSetting.setFeeder(feeder);
                // PUMP
                pump.setValue(resultSet.getFloat("PUMP"));
                componentSetting.setPump(pump);

                result.add(componentSetting);
            }

        } finally {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }

        return result;
    }



    public ComponentSettings putComponentSettings(ComponentSettings componentSettings) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet generatedKeys = null;

        try {
            connection = getConnection();

            statement = connection.prepareStatement("INSERT INTO SIGNALS (" +
                    "pi_id, " +             // 1
                    "waterflowsensor, " +   // 2
                    "lightsensor, " +       // 3
                    "waterlevelsensor, " +  // 4
                    "water_thermometer, " + // 5
                    "air_thermometer, " +   // 6
                    "lamp, " +              // 7
                    "feeder, " +            // 8
                    "pump" +                // 9
                    ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, componentSettings.getPiId());
            statement.setFloat(2, (componentSettings.getWaterFlowSensor() != null) ? componentSettings.getWaterFlowSensor().getValue() : 0);
            statement.setFloat(3, (componentSettings.getLightSensor() != null) ? componentSettings.getLightSensor().getValue() : 0);
            statement.setFloat(4, (componentSettings.getWaterLevelSensor() != null) ? componentSettings.getWaterLevelSensor().getValue() : 0) ;
            statement.setFloat(5, (componentSettings.getWaterThermometer() != null) ? componentSettings.getWaterThermometer().getValue() : 0) ;
            statement.setFloat(6, (componentSettings.getAirThermometer() != null) ? componentSettings.getAirThermometer().getValue() : 0);
            statement.setFloat(7, (componentSettings.getLamp() != null) ? componentSettings.getLamp().getValue() : 0);
            statement.setFloat(8, (componentSettings.getFeeder() != null) ? componentSettings.getFeeder().getValue() : 0);
            statement.setFloat(9, (componentSettings.getPump() != null) ? componentSettings.getPump().getValue() : 0);
            statement.execute();

            return componentSettings;
        } finally {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }
}
