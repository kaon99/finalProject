package model.dao.connectionpool;


import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    private static ConnectionPool instance;
    private static volatile DataSource dataSource;

    private ConnectionPool() {
        getDataSource();
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            synchronized (ConnectionPool.class) {
                if (instance == null) {

                    instance = new ConnectionPool();
                }
            }
        }
        return instance;
    }


    public static DataSource getDataSource() {

        if (dataSource == null) {
            synchronized (ConnectionPool.class) {
                if (dataSource == null) {
                    BasicDataSource ds = new BasicDataSource();
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    ds.setUrl("jdbc:mysql://localhost:3306/final_project?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true");
                    ds.setUsername("root");
                    ds.setPassword("root");
                    ds.setMinIdle(5);
                    ds.setMaxIdle(10);
                    ds.setMaxActive(100);
                    ds.setMaxOpenPreparedStatements(100);
                    ds.setRemoveAbandonedTimeout(50);
                    dataSource = ds;
                }
            }
        }
        return dataSource;

    }

    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException ex) {

            throw new RuntimeException(ex);
        }
    }


}