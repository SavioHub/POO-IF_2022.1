package crud;

import dao.ClienteDAO;
import modelo.Cliente;
import principal.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteAtualiza {
    public static void main(String[] args) throws SQLException {
        //String update = "UPDATE cliente SET idade = 17 WHERE nome = 'Savio'";

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        ClienteDAO produtoDAO = new ClienteDAO(connection);
        Cliente cliente = new Cliente("Sabrina Barbosa", 5);

        produtoDAO.atualizar(cliente);

    }
}
