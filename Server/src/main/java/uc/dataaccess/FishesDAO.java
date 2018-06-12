package uc.dataaccess;

import uc.entities.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FishesDAO extends DAOBase {

    public List<Fishes> getFishes(String piid) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Fishes> results = new ArrayList<>();

        try {
            connection = getConnection();

            statement = connection.prepareStatement("SELECT FISHES_IN_PI.FISH_ID, NAME, QUANTITY FROM FISHES_IN_PI JOIN ALL_FISHES ON (FISHES_IN_PI.FISH_ID = ALL_FISHES.FISH_ID) WHERE FISHES_IN_PI.PI_ID = ?");
            statement.setString(1, piid);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Fishes result = new Fishes();
                result.setFishId(resultSet.getString("FISH_ID"));
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

    public List<Fishes> getFishes() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Fishes> results = new ArrayList<>();

        try {
            connection = getConnection();

            statement = connection.prepareStatement("SELECT FISH_ID, NAME FROM ALL_FISHES");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Fishes result = new Fishes();
                result.setFishId(resultSet.getString("FISH_ID"));
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

    public Fishes putFishes(Fishes fishes) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet generatedKeys = null;

        try {
            connection = getConnection();

            statement = connection.prepareStatement("REPLACE INTO FISHES_IN_PI (PI_ID, FISH_ID, quantity) VALUES (?, ?, ?)");
            statement.setString(1, fishes.getPiId());
            statement.setString(2, fishes.getFishId());
            statement.setFloat(3, fishes.getQuantity());
            statement.execute();

            return fishes;
        } finally {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
        }
    }
}