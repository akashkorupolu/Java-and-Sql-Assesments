//Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class P33 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("names.txt",true);
            Scanner sc = new Scanner(System.in);
            String txt=sc.nextLine();
            while(txt.equalsIgnoreCase("end")==false)
            {
            fw.append(txt+"\n");
            txt=sc.nextLine();
            System.out.println("Type end to exit");
            }
            fw.close();
            sc.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try
        {
            FileReader fr = new FileReader("names.txt");
            String line;
            BufferedReader br = new BufferedReader(fr);
            while((line=br.readLine())!=null)
            {
                System.out.println(line+"\n");
            }
            br.close();
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
