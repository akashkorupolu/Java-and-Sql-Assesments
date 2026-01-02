// Write a program to take names from names.txt & display unique names in sorted order.
import java.io.*;
import java.util.TreeSet;

public class P39 {
    public static void main(String[] args) {
        var unique_names=new TreeSet<String>();
        try(BufferedReader br = new BufferedReader(new FileReader("names.txt"));)
        {
            String name;
            while((name=br.readLine())!=null)
            {
                unique_names.add(name);
            }
            for (String string : unique_names) {
                System.out.println(string+"\n");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
