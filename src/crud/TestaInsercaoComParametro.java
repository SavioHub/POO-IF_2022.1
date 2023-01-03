package crud;

import principal.ConnectionFactory;

import java.sql.*;

public class TestaInsercaoComParametro {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection connection = factory.recuperaConexao()) {
            connection.setAutoCommit(false);//controle manual da inserção de registro no BD, fazendo com que o JDBC não o controle mais

            //O preparedStatement serve para que o JDBC cuide dessa parte de inserção dos dados, para evitar que ocorra algum
            //problema em relação aos dados inseridos pelos usuários no formulário

            try (
                    PreparedStatement pstm =
                            connection.prepareStatement("INSERT INTO cliente (nome, idade) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            ) {
                adicionarVariavel("Alisson", 22, pstm);
                adicionarVariavel("Carol Oliveira", 26, pstm);

                connection.commit();
                //Quando todas as funções forem rodadas completamente sem ecxeções, aí sim vai dar o commit. caso o cotrário, nenhum registro será inserido

                //stm.close();
                //Não é necessário fechar o stm.close(), pois está dentro do try()
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Rollback executado!");
                connection.rollback();
                //ou adiciona todos ou não adiciona nenhum dos registros
            }
        }
        //connection.close();
        //Não é necessário fechar o connection.close(), pois está dentro do try()
    }

    private static void adicionarVariavel(String nome, Integer idade, PreparedStatement stm) throws SQLException {
        stm.setString(1, nome);
        stm.setInt(2, idade);

        if (nome.equals("Carol")){
            throw new RuntimeException("Não é possivel adicionar registro");
        }

        stm.execute();
        //Quando executar o insert into, quero q retorne um ID dessa inserção
        //pegando a chave gerada e guardando em um ResultSet
        try(ResultSet rst = stm.getGeneratedKeys()){
            while (rst.next()){
                Integer id = rst.getInt(1);
                System.out.println("O ID criado foi: "+id);
            }
            //rst.close();
            //Não é necessário fechar o rst.close(), pois está dentro do try()
        }


    }
}
