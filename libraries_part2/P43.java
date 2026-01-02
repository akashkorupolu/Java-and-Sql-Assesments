import java.util.Scanner;

public class P43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PAN number: ");
        String pan = sc.nextLine().toUpperCase();

        if (pan.matches("[A-Z]{5}[0-9]{4}[A-Z]")) {
            System.out.println("Valid PAN");
        } else {
            System.out.println("Invalid PAN");
        }

        sc.close();
    }
}
