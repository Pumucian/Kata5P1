package kata5p1;

//C:\Users\Entrar\Downloads\SQLiteDatabaseBrowserPortable\Data\Kata5.db

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Kata5P1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "system", "orcl");
        
        Statement statement = connection.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT * FROM hello;");
        
        while (rs.next()){
            //System.out.println("ID = " + rs.getInt("id"));
            System.out.println("NAME = " + rs.getString("a"));
        }
        
        /*String query = "CREATE TABLE IF NOT EXISTS MAIL ('Id' INTEGER PRIMARY KEY AUTOINCREMENT , 'Mail' TEXT NOT NULL);";
        statement.execute(query);
            
        String fichero = "C:\\Users\\Entrar\\Documents\\NetBeansProjects\\Kata5P1\\emails.txt";
        
        ArrayList<String> mailArray = (ArrayList<String>) MailList.read(fichero);
        for (String mail : mailArray) {
            query = "INSERT INTO MAIL (Mail) VALUES ('" + mail + "');";
            statement.execute(query);
        }*/
    }
    
}
