package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String user = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/loja";
    public Connection recuperaConexao() throws SQLException {
            return DriverManager.getConnection(url, user, password);
    }
}
