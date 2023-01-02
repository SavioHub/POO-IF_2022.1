package crud;

import principal.ConnectionFactory;

import java.sql.*;

public class ListagemTeste {
    public static void main(String[] args) throws SQLException {
            //instanciação do objeto da classe CriaConexao
            ConnectionFactory connectionFactory = new ConnectionFactory();
            //instanciação da interface Connection recebendo o objeto criaConexao com seu metodo recuperarConexao
            Connection connection = connectionFactory.recuperaConexao();

            PreparedStatement stm = connection.prepareStatement("SELECT id, nome, idade FROM cliente");
            stm.execute();

            ResultSet rst = stm.getResultSet();
            while (rst.next()) {
                //enquanto tiver um proximo, irar execurat o laço
                Integer id = rst.getInt("id");
                String nome = rst.getString("nome");
                Integer idade = rst.getInt("idade");
                System.out.println(id);
                System.out.println(nome);
                System.out.println(idade);
            }

            connection.close();
    }
}
