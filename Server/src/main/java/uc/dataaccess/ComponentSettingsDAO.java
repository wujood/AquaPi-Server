package uc.dataaccess;

import uc.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComponentSettingsDAO extends DAOBase {

    public List<ComponentSettings> getComponentSettings() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<ComponentSettings> result = new ArrayList<>();

        try {
            connection = getConnection();
            statement = connection.prepareStatement("SELECT * FROM SIGNALS ");
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

                componentSetting.setPiId(resultSet.getString("PI_ID"));
                componentSetting.setTimestamp(new java.util.Date(resultSet.getTimestamp("TIMESTAMP").getTime()));
                waterFlowSensor.setValue(resultSet.getFloat("WATERFLOWSENSOR"));
                componentSetting.setWaterFlowSensor(waterFlowSensor);
                lightSensor.setValue(resultSet.getFloat("LIGHTSENSOR"));
                componentSetting.setLightSensor(lightSensor);
                waterLevelSensor.setValue(resultSet.getFloat("WATERLEVELSENSOR"));
                componentSetting.setWaterLevelSensor(waterLevelSensor);
                waterThermometer.setValue(resultSet.getFloat("WATER_THERMOMETER"));
                componentSetting.setWaterThermometer(waterThermometer);
                airThermometer.setValue(resultSet.getFloat("AIR_THERMOMETER"));
                componentSetting.setAirThermometer(airThermometer);
                lamp.setValue(resultSet.getFloat("LAMP"));
                componentSetting.setLamp(lamp);
                feeder.setValue(resultSet.getFloat("FEEDER"));
                componentSetting.setFeeder(feeder);
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
                    "pi_id, " +                // 1
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
            statement.setFloat(2, componentSettings.getWaterFlowSensor().getValue());
            statement.setFloat(3, componentSettings.getLightSensor().getValue());
            statement.setFloat(4, componentSettings.getWaterLevelSensor().getValue());
            statement.setFloat(5, componentSettings.getWaterThermometer().getValue());
            statement.setFloat(6, componentSettings.getAirThermometer().getValue());
            statement.setFloat(7, componentSettings.getLamp().getValue());
            statement.setFloat(8, componentSettings.getFeeder().getValue());
            statement.setFloat(9, componentSettings.getPump().getValue());
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
