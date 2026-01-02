import java.util.Scanner;
public class SpacePos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String with some spaces");
        String s = sc.nextLine();
        sc.close();
        System.out.println("Spaces positions are :");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
                System.out.println(i);

        }
    }
}
