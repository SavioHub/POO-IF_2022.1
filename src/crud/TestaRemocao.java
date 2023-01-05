package crud;

import dao.ClienteDAO;
import modelo.Cliente;
import principal.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente("Sabrina hacker",19);

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        ClienteDAO produtoDAO = new ClienteDAO(connection);
        produtoDAO.deletar(cliente);

        //produtoDAO.listar(cliente);

        //Statement stm = connection.createStatement();
        //stm.execute("DELETE from cliente WHERE id > 2");


    }
}
