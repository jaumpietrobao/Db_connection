package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bd_Connection010 {

    public static void criaTabelaPssoa() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bd_Connection010", "root", "root");

            int statement = ((Connection) connection).prepareStatement(
                    "CREATE TABLE pessoa(nome VARCHAR(50))").executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }