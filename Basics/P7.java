import java.util.Scanner;
//. Write a program to accept the number and display the number in reverse order.
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        sc.close();
        int revnum=0;
        while(num>0)
        {
            int digit=num%10;
            revnum=revnum*10+digit;
            num=num/10;
        }
        System.out.println("The reverse of a number is "+revnum);
    }
}
