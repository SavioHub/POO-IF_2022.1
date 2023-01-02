package crud;

import principal.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        //Statement stm = connection.createStatement();
        //stm.execute("DELETE from cliente WHERE id > 2");

        PreparedStatement stm = connection.prepareStatement("DELETE from cliente WHERE id = ?");
        stm.setInt(1, 9);
        stm.execute();

        Integer linhasModificadas = Math.toIntExact(stm.getLargeUpdateCount());
        System.out.println("Quantidade de linhas modificadas: "+ linhasModificadas);
    }
}
