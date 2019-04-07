package model.dao.connectionpool;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    private static ConnectionPool pool;
    private final DataSource dataSource;

    private ConnectionPool() throws NamingException {
        Context initialContext = new InitialContext();
        dataSource = (DataSource) initialContext.lookup("java:comp/env/jdbc/finalprojectdb");

    }

    public static synchronized ConnectionPool getInstance() {
        try {
            if (pool == null) {
                synchronized (ConnectionPool.class){
                    if(pool == null){
                        pool = new ConnectionPool();
                    }
                }
            }
        } catch (NamingException e) {

        }
        return pool;

    }


    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();

    }
}
