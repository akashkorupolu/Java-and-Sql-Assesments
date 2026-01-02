import java.util.Scanner;
public class P32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int sum=0;
        int num=sc.nextInt();
        while(num!=0)
        {
            sum=sum+num;
            num=sc.nextInt();
        }
        sc.close();;
        System.out.println("Sum is "+sum);
    }
}