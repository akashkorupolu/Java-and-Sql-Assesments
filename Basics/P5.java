import java.util.Scanner;;
public class P5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter number " +i);
            int n=sc.nextInt();
            total=total+n;
        }
        sc.close();
        System.out.println("The average is"+total/5);

    }
}
