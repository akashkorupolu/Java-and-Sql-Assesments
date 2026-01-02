//Write a program to accept a file and convert its contents to uppercase.(write in compact way)
import java.io.*;

class P40 {
    public static void main(String[] args) throws Exception {

        File f = new File("names.txt");
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            for (String s; (s = br.readLine()) != null; )
                sb.append(s.toUpperCase()).append("\n");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(f)) {
            fw.write(sb.toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
