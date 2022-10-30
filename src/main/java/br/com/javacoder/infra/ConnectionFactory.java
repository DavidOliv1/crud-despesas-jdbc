package br.com.javacoder.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){}

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/DespesasDB", "postgres", "teste");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
