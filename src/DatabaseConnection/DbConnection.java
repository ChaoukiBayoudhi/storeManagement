package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String userName="inga_user";
    private static final String password="inga_user";
    private static final String url="jdbc:postgresql://localhost:5432/storedb";
    public static Connection getDbConnection()
    {
        Connection con=null;
        try {
            con= DriverManager.getConnection(url,userName,password);
            System.out.println("Connection with the DB has been successfully established.");

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
