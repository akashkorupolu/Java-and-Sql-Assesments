import java.io.*;
import java.util.LinkedHashSet;

public class P40{
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("names.txt"));
            String line;
            while ((line = br1.readLine()) != null) {
                names.add(line);
            }
            br1.close();
            BufferedReader br2 = new BufferedReader(new FileReader("names1.txt"));
            while ((line = br2.readLine()) != null) {
                names.add(line);
            }
            br2.close();
            for (String name : names) {
                System.out.println(name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

