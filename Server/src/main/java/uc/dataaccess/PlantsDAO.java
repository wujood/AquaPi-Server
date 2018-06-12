package uc.dataaccess;

import uc.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlantsDAO extends DAOBase {

    public List<Plants> getPlants(String piid) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Plants> results = new ArrayList<>();

        try {
            connection = getConnection();

            statement = connection.prepareStatement("SELECT PLANTS_IN_PI.PLANT_ID, NAME, QUANTITY FROM PLANTS_IN_PI JOIN ALL_PLANTS ON (PLANTS_IN_PI.PLANT_ID = ALL_PLANTS.PLANT_ID) WHERE PLANTS_IN_PI.PI_ID = ?");
            statement.setString(1, piid);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Plants result = new Plants();
                result.setPlantId(resultSet.getString("PLANT_ID"));
                result.setName(resultSet.getString("NAME"));
                result.setQuantity(resultSet.getInt("QUANTITY"));

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

    public List<Plants> getPlants() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Plants> results = new ArrayList<>();

        try {
            connection = getConnection();

            statement = connection.prepareStatement("SELECT PLANT_ID, NAME FROM ALL_PLANTS");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Plants result = new Plants();
                result.setPlantId(resultSet.getString("PLANT_ID"));
                result.setName(resultSet.getString("NAME"));

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

    public Plants putPlants(Plants plants) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet generatedKeys = null;

        try {
            connection = getConnection();

            statement = connection.prepareStatement("REPLACE INTO PLANTS_IN_PI (PI_ID, PLANT_ID, quantity) VALUES (?, ?, ?)");
            statement.setString(1, plants.getPiId());
            statement.setString(2, plants.getPlantId());
            statement.setFloat(3, plants.getQuantity());
            statement.execute();

            return plants;
        } finally {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }
}