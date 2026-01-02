import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class P36 {
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
                String[] marks=line.split(",");
                int total=0;
                for (String string : marks) {
                    string=string.trim();
                    int m=Integer.parseInt(string);
                    total+=m;
                }
                System.out.println(total);
            }
            sc.close();
            br.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}

