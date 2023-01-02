package crud;

import principal.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO cliente (nome, idade) VALUES ('Lucas Afonso', 20)",Statement.RETURN_GENERATED_KEYS);
        //Quando executar o insert into, quero q retorne um ID dessa inserção

        //pegando a chave gerada e guardando em um ResultSet
        ResultSet rst = stm.getGeneratedKeys();


        while (rst.next()){
            Integer id = rst.getInt(1);
            System.out.println("O ID criado foi: "+id);
        }

    }
}
