import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class JavaHomeWork2 {
    
    public static void main(String[] args) throws IOException {

        double a = 0, b = 0;

        try {
            File file = new File("input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            
            String line = reader.readLine();
            

            while (line != null) {
                if (line.charAt(0) == 'a') a = Integer.parseInt(line.substring(2).replaceAll("[\r\n]+$", "")) ;
                else b = Integer.parseInt(line.substring(2).replaceAll("[\r\n]+$", ""));
                line = reader.readLine();                
            }            
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }    
        
        try(FileWriter writer = new FileWriter("output.txt", false))
        {
            if (a == 0 && b == 0) writer.write("не определено");
            else writer.write(Double.toString(Degree(a, b)));

            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }

    public static double Degree(double a, double b){
        if (b > 1) return a * Degree(a, --b);
        if (b < 1) return 1 / a * Degree(a, ++b);
        return a;
    }
}