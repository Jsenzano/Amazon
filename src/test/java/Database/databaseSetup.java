package Database;

import org.junit.Test;

import java.sql.*;

public class databaseSetup {


    @Test
    public static void databaseSetup() throws Exception {
        String userName = "techlead";
        String password = "password";
        String url = "jdbc:mysql://db4free.net:3306/techleadacademy";
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from teachers");

        int result = resultSet.getRow();

        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }
}
