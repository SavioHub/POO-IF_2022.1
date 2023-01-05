package crud;

import dao.ClienteDAO;
import modelo.Cliente;
import principal.ConnectionFactory;

import java.sql.*;
import java.util.List;

public class ListagemTeste {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente();

        //instanciação do objeto da classe CriaConexao
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //instanciação da interface Connection recebendo o objeto criaConexao com seu metodo recuperarConexao

        try(Connection connection = connectionFactory.recuperaConexao()){
            ClienteDAO produtoDAO = new ClienteDAO(connection);
            List<Cliente> clienteList = produtoDAO.listar();
            //clienteList.stream().forEach(lc -> System.out.println(lc));
            //produtoDAO.listar(cliente);

            for (Cliente lc: clienteList  ) {
                System.out.println(lc);
            }
        };
    }
}
