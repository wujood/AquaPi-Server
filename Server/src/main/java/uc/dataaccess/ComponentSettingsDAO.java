package uc.dataaccess;

import uc.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ComponentSettingsDAO extends DAOBase {
    private boolean isWaiting = false;
    private Date waitingStart;

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
        Configurations config = ConfigurationsDAO.configMap.get(piid);

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
                if(waterThermometer.getValue() > config.getMaxWaterTemperature())
                    waterThermometer.setMessage("Warning! Water temperature is over your configured maximal value");
                else if (waterThermometer.getValue() < config.getMinWaterTemperature())
                    waterThermometer.setMessage("Warning! Water temperature is below your configured minimal value");
                componentSetting.setWaterThermometer(waterThermometer);
                // AIR THERMOMETER
                airThermometer.setValue(resultSet.getFloat("AIR_THERMOMETER"));
                if(airThermometer.getValue() > 30)
                    airThermometer.setMessage("Warning! Air temperature is over 30°");
                componentSetting.setAirThermometer(airThermometer);
                // LAMP
                System.out.println("THRESHHOLD: " + config.getBrightnessTreshhold());
                System.out.println("LIGHTSENSOR: " + resultSet.getFloat("LIGHTSENSOR"));
                lamp.setValue(config.getBrightnessTreshhold() > resultSet.getFloat("LIGHTSENSOR") ? 1 : 0);
                componentSetting.setLamp(lamp);
                // FEEDER
                System.out.println("POST FEEDER: " + (isWaiting ? 1 : 0));
                feeder.setValue(isWaiting ? 1 : 0);
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
            statement.setFloat(2, componentSettings.getWaterFlowSensor().getValue());
            statement.setFloat(3, componentSettings.getLightSensor().getValue());
            statement.setFloat(4, componentSettings.getWaterLevelSensor().getValue());
            statement.setFloat(5, componentSettings.getWaterThermometer().getValue());
            statement.setFloat(6, componentSettings.getAirThermometer().getValue());
            statement.setFloat(7, componentSettings.getLamp().getValue());
            statement.setFloat(8, componentSettings.getFeeder().getValue());
            statement.setFloat(9, componentSettings.getPump().getValue());
            statement.execute();

            System.out.println("PUT:");
            System.out.println("WAITING " + (isWaiting ? "TRUE" : "FALSE"));
            if(isWaiting = false && componentSettings.getFeeder().getValue() == 1)
            {
                System.out.println("WAITING SET TO TRUE");
                isWaiting = true;
                waitingStart = new Date();
                System.out.println("STARTTIME: " + waitingStart.getTime());
            }
            else if (isWaiting)
            {
                System.out.println("ISWAITING!!");
                Date waitingEnd = new Date();
                long difference = (waitingEnd.getTime() - waitingStart.getTime())/1000;
                System.out.println("DIFFERENCE: " + difference);
                if(difference >= 30)
                    isWaiting = false;
            }

            return componentSettings;
        } finally {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }
}
