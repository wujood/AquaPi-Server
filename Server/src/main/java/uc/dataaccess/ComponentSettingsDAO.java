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
            statement = connection.prepareStatement("SELECT * FROM signals ");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                ComponentSettings componentSetting = new ComponentSettings();
                WaterFlowSensor waterFlowSensor = new WaterFlowSensor();
                LightSensor lightSensor = new LightSensor();
                WaterLevelSensor waterLevelSensor = new WaterLevelSensor();
                Thermometer thermometer = new Thermometer();
                Lamp lamp = new Lamp();
                Feeder feeder = new Feeder();
                Pump pump = new Pump();

                componentSetting.setPiId(resultSet.getString("id"));
                componentSetting.setTimestamp(resultSet.getDate("timestamp"));
                waterFlowSensor.setValue(resultSet.getFloat("waterflowsensor_value"));
                componentSetting.setWaterFlowSensor(waterFlowSensor);
                lightSensor.setValue(resultSet.getFloat("lightsensor_value"));
                componentSetting.setLightSensor(lightSensor);
                waterLevelSensor.setValue(resultSet.getFloat("waterlevelsensor_value"));
                componentSetting.setWaterLevelSensor(waterLevelSensor);
                thermometer.setValue(resultSet.getFloat("thermometer_value"));
                componentSetting.setThermometer(thermometer);
                lamp.setValue(resultSet.getFloat("lamp_value"));
                componentSetting.setLamp(lamp);
                feeder.setValue(resultSet.getFloat("feeder_value"));
                componentSetting.setFeeder(feeder);
                pump.setValue(resultSet.getFloat("pump_value"));
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
}
