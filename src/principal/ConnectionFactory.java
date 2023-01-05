package principal;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    private String user = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/loja";

    public DataSource dataSource;
    public ConnectionFactory(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        this.dataSource = comboPooledDataSource;
        //faz com que o pool funcione dentro da aplicação, fazendo com DataSource expoe para aplicação

        comboPooledDataSource.setMaxPoolSize(15);
    }
    public Connection recuperaConexao() {
        try {
            return this.dataSource.getConnection();
            //faz com q o datasouce pega a conexão que está disponivel no pool de conexoẽs
            //não precisa ir direto ao banco de dados, quando uma conexão estiver aberta e o usuario encerrar a tarefa
            //e outro usuario abrir uma requisição, ele usara a conexão q estiver aberta do pool
            // Reciclar um conjunto de conexões de tamanho fixo ou dinâmico
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }
}
