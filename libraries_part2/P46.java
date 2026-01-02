import java.io.*;
import java.util.*;
import java.util.regex.*;

public class P46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        Pattern p = Pattern.compile("[A-Za-z]+[0-9]+");

        System.out.println("Enter strings (type 'end' to stop):");
        while (true) {
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("end"))
                break;

            Matcher m = p.matcher(s);
            if (m.matches()) {
                list.add(s);
            }
        }
        sc.close();

        Collections.sort(list);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("SortedText.txt",true));
            for (String str : list) {
                bw.write(str);
                bw.newLine();
            }
            bw.close();
            System.out.println("Sorted data written to Sortedtext.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

