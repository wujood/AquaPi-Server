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

            statement = connection.prepareStatement("SELECT FISHES_IN_PI.FISH_ID, NAME, QUANTITY FROM FISHES_IN_PI JOIN ALL_FISHES ON (FISHES_IN_PI.FISH_ID = ALL_FISHES.FISH_ID) WHERE FISHES_IN_PI.PI_ID = ? AND QUANTITY > 0");
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

            statement = connection.prepareStatement("SELECT FISH_ID,NAME,MIN_TEMP,MAX_TEMP,FROST_FOOD,FLAKE_FOOD,LIVE_FOOD,NEEDS_HIDING,MIN_QUANTITY,WEIGHT,HELP_LINK,PIC_LINK FROM ALL_FISHES");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Fishes result = new Fishes();
                result.setFishId(resultSet.getString("FISH_ID"));
                result.setName(resultSet.getString("NAME"));
                result.setMinTemp(resultSet.getInt("MIN_TEMP"));
                result.setMaxTemp(resultSet.getInt("MAX_TEMP"));
                result.setFrostFood(resultSet.getInt("FROST_FOOD"));
                result.setFlakeFood(resultSet.getInt("FLAKE_FOOD"));
                result.setLiveFood(resultSet.getInt("LIVE_FOOD"));
                result.setNeedsHiding(resultSet.getInt("NEEDS_HIDING"));
                result.setMinQuantity(resultSet.getInt("MIN_QUANTITY"));
                result.setWeight(resultSet.getInt("WEIGHT"));
                result.setHelpLink(resultSet.getString("HELP_LINK"));
                result.setPicLink(resultSet.getString("PIC_LINK"));

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

            statement = connection.prepareStatement("REPLACE INTO FISHES_IN_PI (PI_ID, FISH_ID, QUANTITY) VALUES (?, ?, ?)");
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