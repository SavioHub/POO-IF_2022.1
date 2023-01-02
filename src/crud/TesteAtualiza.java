package crud;

import principal.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteAtualiza {
    public static void main(String[] args) throws SQLException {
        String update = "UPDATE cliente SET nome = 'Sabrina santos', idade = 15 WHERE nome = 'Adriely Costa'";

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        Statement stm = connection.createStatement();

        System.out.println(update);
        stm.execute(update);





    }
}
