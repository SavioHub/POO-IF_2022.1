package crud;

import principal.ConnectionFactory;

import java.sql.*;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {
        String nome = "Sávio Costa); delete from cliente";
        Integer idade = 234;

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        //O preparedStatement serve para que o JDBC cuide dessa parte de inserção dos dados, para evitar que ocorra algum
        //problema em relação aos dados inseridos pelos usuários no formulário

        PreparedStatement stm =
                connection.prepareStatement("INSERT INTO cliente (nome, idade) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
        stm.setString(1, nome);
        stm.setInt(2, idade);

        stm.execute();
        //Quando executar o insert into, quero q retorne um ID dessa inserção
        //pegando a chave gerada e guardando em um ResultSet
        ResultSet rst = stm.getGeneratedKeys();

        while (rst.next()){
            Integer id = rst.getInt(1);
            System.out.println("O ID criado foi: "+id);
        }
        connection.close();
    }
}
