import java.util.Scanner;

public class Invertcase {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        sc.close();
        String new_string = "";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
                c=Character.toLowerCase(c);
            else
                c=Character.toUpperCase(c);

            new_string+=c;
        }

        System.out.println("old string "+s);
        System.out.println("New String "+new_string);
    }
}
