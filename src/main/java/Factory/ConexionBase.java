package Factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class ConexionBase {

    public DataSource dataSource;

    public ConexionBase() {

        var pooledDataSource = new ComboPooledDataSource();
        pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura_mx?useTimeZone=true&serverTimeZone=UTC");
        pooledDataSource.setUser("root");
        pooledDataSource.setPassword("Altecpower1");

        this.dataSource = pooledDataSource;
    }

    public Connection connectionBase() {
        try {
            return this.dataSource.getConnection();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
