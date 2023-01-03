package crud;

import modelo.Cliente;
import principal.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente("Sabrina",1);

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        PersistenciaProduto persistenciaProduto = new PersistenciaProduto(connection);
        persistenciaProduto.remocaoCliente(cliente);
        persistenciaProduto.listarCliente(cliente);
        //Statement stm = connection.createStatement();
        //stm.execute("DELETE from cliente WHERE id > 2");


    }
}
