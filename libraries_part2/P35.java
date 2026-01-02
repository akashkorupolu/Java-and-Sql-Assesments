//35. Write a program to display lines that contains more than 5 characters.
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class P35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String filename = sc.nextLine();

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null)
                
            {
                if(line.length()>2)
               System.out.println(line+"\n");
            }
            br.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}

