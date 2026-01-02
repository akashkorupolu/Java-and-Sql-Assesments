import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        sc.close();
        int sec_max=0;
        for(int i=1;i<number/2;i++){
            if(number%i==0)
            {
                sec_max=(i>sec_max)?i:sec_max;
            }

        
        }
        System.out.println("Second largest factor is "+sec_max);
    }
}
