import java.io.*;

public class P45 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\s+", " ");
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("Spaces replaced successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
