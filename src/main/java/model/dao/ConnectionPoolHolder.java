package model.dao;
import org.apache.commons.dbcp.BasicDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPoolHolder {
    private static volatile DataSource dataSource;

    private ConnectionPoolHolder() {
    }

     static {
        if (dataSource == null) {
            synchronized (ConnectionPoolHolder.class) {
                if (dataSource == null) {
                    //TODO move all hardcode to properties
                    BasicDataSource bs = new BasicDataSource();
                    bs.setDriverClassName("com.mysql.jdbc.Driver");
                    bs.setUrl("jdbc:mysql://localhost:3306/final_project?useSSL=false");
                    bs.setUsername("root");
                    bs.setPassword("root");
                    bs.setMinIdle(5);
                    bs.setMaxIdle(10);
                    bs.setMaxOpenPreparedStatements(100);
                    dataSource = bs;
                }
            }
        }
    }
    public static Connection getConnection () throws SQLException {
return dataSource.getConnection();
    }
}