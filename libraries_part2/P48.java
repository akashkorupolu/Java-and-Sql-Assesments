import java.io.*;
import java.util.*;
import java.util.regex.*;

class Customer {
    String name;
    String mobile;

    Customer(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
}

public class P48 {
    public static void main(String[] args) {

        ArrayList<Customer> list = new ArrayList<>();

        Pattern p = Pattern.compile("([A-Za-z]+)\\s+([0-9]{10})");

        try {
            BufferedReader br = new BufferedReader(new FileReader("customers.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                Matcher m = p.matcher(line);

                if (m.matches()) {
                    String name = m.group(1);
                    String mobile = m.group(2);

                    list.add(new Customer(name, mobile));
                }
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(list, (c1, c2) -> c1.name.compareToIgnoreCase(c2.name));

        System.out.println("Sorted Customer Details:");
        for (Customer c : list) {
            System.out.println(c.name + " " + c.mobile);
        }
    }
}

