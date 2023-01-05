package dao;

import modelo.Categoria;
import modelo.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    private Connection connection;

    public CategoriaDAO(Connection connection1){
        this.connection = connection1;
    }

    //estava usando essa função para listar uma categoria com um cliente usando um for, só q isso não é performático
    public List<Categoria> listar() throws SQLException {
        System.out.println("Query lista categoria");
        List<Categoria> categoriaList = new ArrayList<>();
        String sql = "SELECT ID, NOME FROM categoria";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()){
                while (rst.next()){
                    Categoria categoria = new Categoria(rst.getInt(1), rst.getString(2));
                    categoriaList.add(categoria);

                }
            }
        }
        return categoriaList;
    }

    public List<Categoria> listarComCliente()throws SQLException{
        List<Categoria> categoriaList = new ArrayList<>();
        Categoria ultima = null;

        String sql = "SELECT ct.ID, ct.NOME, cl.ID, cl.NOME FROM categoria ct INNER JOIN " + "cliente cl ON ct.ID = cl.categoria_id";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()){
                while (rst.next()){
                    //se ultima for igual a null ou o nome da categoria for diferente da categoria que estiver no BD, fazer a instanciação da categoria
                    if(ultima == null || !ultima.getNome().equals(rst.getString(2))){
                        Categoria categoria = new Categoria(rst.getInt(1), rst.getString(2));

                        ultima = categoria;
                        categoriaList.add(categoria);
                    }
                    Cliente cliente = new Cliente(rst.getString(4), rst.getInt(3));
                    ultima.adicionarCliente(cliente);
                }
            }
        }
        return categoriaList;
    }
}
