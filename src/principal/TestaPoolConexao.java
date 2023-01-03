package principal;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaPoolConexao {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();

        for (int i =0; i < 20; i++){
            factory.recuperaConexao();
            System.out.println("Conexão de numero: "+i);
        }


    }
}
