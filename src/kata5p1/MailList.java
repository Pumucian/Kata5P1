package kata5p1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
public class MailList {
    
    public static List<String> read (String fileName) throws FileNotFoundException, IOException{
        List<String> mailList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String mail;
        while ((mail = reader.readLine()) != null){
            if (mail.indexOf('@') == -1) continue;
            mailList.add(mail);
        }
        reader.close();
        return mailList;
    }
}

