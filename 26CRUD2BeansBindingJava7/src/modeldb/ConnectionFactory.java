package modeldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final String database = "jdbc:mysql://localhost/ooclassesjava7";
    private final String login = "root";
    private final String password = "root";

    public Connection getConnection() {
        try {
            //necessario registrar o driver para jdbc 3 e projetos com java 5
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            return DriverManager.getConnection(
                    database, login, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
