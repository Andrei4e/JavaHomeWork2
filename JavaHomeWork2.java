import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedReader;

public class JavaHomeWork2 {
    
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            
            String line = reader.readLine();
            int a = 0, b = 0;
            //int ;
            while (line != null) {
                if (line.charAt(0) == 'a') a = Integer.parseInt(line.substring(2).replaceAll("[\r\n]+$", "")) ;
                else b = Integer.parseInt(line.substring(2).replaceAll("[\r\n]+$", ""));
                line = reader.readLine();                
            }
            System.out.println(a);
            System.out.println(b);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       

    }
}