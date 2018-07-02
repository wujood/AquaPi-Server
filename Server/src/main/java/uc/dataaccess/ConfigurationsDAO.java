package uc.dataaccess;

import uc.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigurationsDAO extends DAOBase {

    public List<Configurations> getConfigurations(String piid) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Configurations> results = new ArrayList<>();

        try {
            connection = getConnection();

            statement = connection.prepareStatement("SELECT * FROM CONFIGURATIONS WHERE PI_ID = ?");
            statement.setString(1, piid);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Configurations result = new Configurations();
                result.setPiId(resultSet.getString("PI_ID"));
                result.setMinAirTemperature(resultSet.getFloat("MIN_AIR_TEMPERATURE"));
                result.setMaxAirTemperature(resultSet.getFloat("MAX_AIR_TEMPERATURE"));
                result.setMinWaterTemperature(resultSet.getFloat("MIN_WATER_TEMPERATURE"));
                result.setMaxWaterTemperature(resultSet.getFloat("MAX_WATER_TEMPERATURE"));
                result.setBrightnessTreshhold(resultSet.getFloat("BRIGHTNESS_THRESHOLD"));
                result.setFeederFrequency(resultSet.getFloat("FEEDER_FREQUENCY"));
                result.setWaterFlowSensitivity(resultSet.getFloat("WATER_FLOW_SENSITIVITY"));
                result.setTogglePushNotifications(resultSet.getInt("TOGGLE_PUSH_NOTIFICATIONS"));

                results.add(result);
            }
        } finally {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }

        return results;
    }

    public Configurations putConfigurations(Configurations configurations) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet generatedKeys = null;

        try {
            connection = getConnection();

            statement = connection.prepareStatement("REPLACE INTO CONFGURATIONS (PI_ID, MIN_AIR_TEMPERATURE, MAX_AIR_TEMPERATURE, MIN_WATER_TEMPERATURE, MAX_WATER_TEMPERATURE, BRIGHTNESS_THRESHOLD, FEEDER_FREQUENCY, WATER_FLOW_SENSITIVITY, TOGGLE_PUSH_NOTIFICATIONS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            statement.setString(1, configurations.getPiId());
            statement.setFloat(2, configurations.getMinAirTemperature());
            statement.setFloat(3, configurations.getMaxAirTemperature());
            statement.setFloat(4, configurations.getMinWaterTemperature());
            statement.setFloat(5, configurations.getMaxWaterTemperature());
            statement.setFloat(6, configurations.getBrightnessTreshhold());
            statement.setFloat(7, configurations.getFeederFrequency());
            statement.setFloat(8, configurations.getWaterFlowSensitivity());
            statement.setInt(9, configurations.getTogglePushNotifications());
            statement.execute();

            return configurations;
        } finally {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }
}