package crud;

import modelo.Cliente;
import principal.ConnectionFactory;

import java.sql.*;

public class ListagemTeste {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente();

        //instanciação do objeto da classe CriaConexao
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //instanciação da interface Connection recebendo o objeto criaConexao com seu metodo recuperarConexao
        Connection connection = connectionFactory.recuperaConexao();

        PersistenciaProduto persistenciaProduto = new PersistenciaProduto(connection);
        persistenciaProduto.listarCliente(cliente);

        connection.close();
    }
}
