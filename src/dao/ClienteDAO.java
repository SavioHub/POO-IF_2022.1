package dao;

import modelo.Categoria;
import modelo.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private Connection connection;

    public ClienteDAO(Connection connection){
        this.connection = connection;
    }
    public void salvar(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome, idade) VALUES (?, ?)";

        try (
                PreparedStatement pstm =
                        connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                //new connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)

        ){
            pstm.setString(1, cliente.getNome());
            pstm.setInt(2, cliente.getIdade());

            pstm.execute();

            try(ResultSet rst = pstm.getGeneratedKeys()){

                while (rst.next()){
                    cliente.setId(rst.getInt(1));
                }
            }
        }
    }
    public List<Cliente> listar() throws SQLException{
        List<Cliente> clienteList = new ArrayList<>();

        String sql = "SELECT ID, IDADE, NOME FROM cliente";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()){

                while (rst.next()){
                    Cliente cliente = new Cliente(rst.getInt(1), rst.getInt(2), rst.getString(3));

                    clienteList.add(cliente);
                }
            }
        }
        return clienteList;
    }
    public void deletar(Cliente cliente) throws SQLException{
        PreparedStatement pstm = connection.prepareStatement("DELETE from cliente WHERE nome = ? and idade = ?");
        pstm.setString(1, cliente.getNome());
        pstm.setInt(2, cliente.getIdade());
        pstm.execute();

        Integer linhasModificadas = Math.toIntExact(pstm.getLargeUpdateCount());
        System.out.println("Quantidade de linhas modificadas: "+ linhasModificadas);
    }
    public void atualizar(Cliente cliente) throws SQLException{
        String update = "UPDATE cliente SET idade = ? WHERE nome = ?";

        try (
                PreparedStatement pstm = connection.prepareStatement(update)
        ){
            pstm.setInt(1, cliente.getIdade());
            pstm.setString(2, cliente.getNome());
            pstm.execute();
            System.out.println("Nome: "+cliente.getNome()+"Idade: "+cliente.getIdade());
        }
    }

    public List<Cliente> buscarClientePorCategoria(Categoria categoria) throws SQLException{
        System.out.println("Query busca categoria por cliente");

        List<Cliente> clienteList = new ArrayList<>();

        String sql = "SELECT ID, IDADE, NOME FROM cliente WHERE categoria_id = ?";

        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.setInt(1, categoria.getId());
            pstm.execute();

            try (ResultSet rst = pstm.getResultSet()){

                while (rst.next()){
                    Cliente cliente = new Cliente(rst.getInt(1), rst.getInt(2), rst.getString(3));

                    clienteList.add(cliente);
                }
            }
        }
        return clienteList;
    }
}