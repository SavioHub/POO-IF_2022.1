package modelo;

import crud.PersistenciaProduto;
import principal.ConnectionFactory;

import java.sql.*;

public class TestaInsercaoCliente {
    public static void main(String[] args) throws SQLException {
        Cliente cliente = new Cliente("Sabrina", 1);

        try(Connection connection = new ConnectionFactory().recuperaConexao()){
            PersistenciaProduto persistenciaProduto = new PersistenciaProduto(connection);
            persistenciaProduto.salvarProduto(cliente);
            persistenciaProduto.listarCliente(cliente);
            //new PersistenciaProduto(connection).salvarProduto(cliente);

        }
        System.out.println(cliente);
    }
}
