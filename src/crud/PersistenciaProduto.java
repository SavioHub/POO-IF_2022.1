package crud;

import modelo.Cliente;

import java.sql.*;

public class PersistenciaProduto {
    private Connection connection;

    public PersistenciaProduto(Connection connection){
        this.connection = connection;
    }

    public void salvarProduto(Cliente cliente) throws SQLException {
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

    public void listarCliente(Cliente cliente) throws SQLException{
        String sql = "SELECT id, nome, idade FROM cliente";
        try(
                PreparedStatement pstm = connection.prepareStatement(sql)
            ) {

            pstm.execute();

            try (
                    ResultSet rst = pstm.getResultSet();

                    ){

                        while (rst.next()) {
                            //enquanto tiver um proximo, irar execurat o laço
                            Integer id = rst.getInt("id");
                            String nome = rst.getString("nome");
                            Integer idade = rst.getInt("idade");
                            System.out.println("ID: "+id);
                            System.out.println("Nome: "+nome);
                            System.out.println("Idade: "+idade);

                        }

                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void remocaoCliente(Cliente cliente) throws SQLException{
        PreparedStatement pstm = connection.prepareStatement("DELETE from cliente WHERE nome = ? and idade = ?");
        pstm.setString(1, cliente.getNome());
        pstm.setInt(2, cliente.getIdade());
        pstm.execute();

        Integer linhasModificadas = Math.toIntExact(pstm.getLargeUpdateCount());
        System.out.println("Quantidade de linhas modificadas: "+ linhasModificadas);
        /*try {
            ResultSet rst = pstm.getResultSet();
            if (cliente.getNome().equals(rst.getString(1)) && cliente.getIdade().equals(rst.getInt(2))){
                pstm.execute();

            }else{
                System.out.println("Dados inseridos diferentes do que está registrado no banco de dados");
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }*/
    }
}
