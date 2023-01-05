package crud;

import dao.ClienteDAO;
import modelo.Cliente;
import principal.ConnectionFactory;

import java.sql.*;
import java.util.List;

public class TestaInsercaoCliente {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente("Savio Santos", 20);

        try(Connection connection = new ConnectionFactory().recuperaConexao()){
            ClienteDAO produtoDAO = new ClienteDAO(connection);
            produtoDAO.salvar(cliente);

            List<Cliente> listaDeClientes = produtoDAO.listar();
            listaDeClientes.stream().forEach(lc -> System.out.println(lc));


            //produtoDAO.listar(cliente);
            //new PersistenciaProduto(connection).salvarProduto(cliente);

        }
    }
}
