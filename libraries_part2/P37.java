import java.io.FileWriter;
import java.util.Scanner;

public class P37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("Marks.data");

            System.out.println("Enter 20 marks:");

            for (int i = 1; i <= 20; i++) {
                int mark = sc.nextInt();
                fw.write(mark + "\n");
            }

            fw.close();
            System.out.println("20 marks written to Marks.data");

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
