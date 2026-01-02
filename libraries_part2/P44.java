import java.util.Scanner;
public class P44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String[] st=str.split(" ");
        for (String string : st) {
            System.out.println(string);
        }
        sc.close();
    }
    
}
