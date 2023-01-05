package crud.categoria;

import dao.CategoriaDAO;
import modelo.Categoria;
import modelo.Cliente;
import principal.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestaListagemCategoria {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = new ConnectionFactory().recuperaConexao()){
            CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
            List<Categoria> categoriaList = categoriaDAO.listarComCliente();
            List<Cliente> clienteList = new ArrayList<>();

            for (Categoria lcat : categoriaList) {
                System.out.println(lcat.getNome());
//lcat.getClientes()
                for (Cliente cliente : lcat.getClientes()){
                    //Aqui vai fazer a vinculação dos registros das tabelas, ou seja, vai pegar cada registro que estiver inteligado
                    //com o a chave estragenira através do método: buscarCategoria(); que está criada na classe ClienteDAO
                    System.out.println(lcat.getNome() + " - " + cliente.getNome());
                }
            }
        }
    }
}
