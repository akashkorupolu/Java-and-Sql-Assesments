import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Name_Until_end {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter names -(Enter end to exit)");
            String txt=sc.nextLine();
            
            while(txt.equalsIgnoreCase("end")==false)
            {
            System.out.println(txt+"-");
            txt=sc.nextLine();
            }

            sc.close();
            System.out.println("File written successfully");
        
    }
}
