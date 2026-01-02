import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<5)
        {
            System.out.println("Enter a number");
            String num=sc.nextLine();
            try{
                int digit=Integer.parseInt(num);
                sum+=digit;
                i++;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Enter digits only");
                i--;
            }
        }
        sc.close();
        System.out.println("Total Sum is "+sum);
        
    }
}
