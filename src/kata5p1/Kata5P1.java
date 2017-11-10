package kata5p1;

//C:\Users\Entrar\Downloads\SQLiteDatabaseBrowserPortable\Data\Kata5.db

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Kata5P1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection ("jdbc:sqlite:C:/Users/Entrar/Downloads/SQLiteDatabaseBrowserPortable/Data/KATA5.db");
        
        Statement statement = connection.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM PEOPLE;");
        
        while (rs.next()){
            System.out.println("ID = " + rs.getInt("id"));
            System.out.println("NAME = " + rs.getString("name"));
        }
    }
    
}
