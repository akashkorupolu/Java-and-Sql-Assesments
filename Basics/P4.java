import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the day of week");
        int day=sc.nextInt();
        System.out.println("Enter no of hours worked");
        int hours=sc.nextInt();
        sc.close();
        int amount;
        switch (day) {
            case 1:case 2:case 3:
                amount=200*hours;
                break;
            case 4:case 5:
                amount=400*hours;
                break;
            case 6:
                amount=600*hours;
                break;
            case 7:
                amount=800*hours;
                break;
        
            default:
                amount=0;
                break;
        }

        double Salary;
            if(amount>2000)
            {
                Salary=amount+0.1*amount;
            }
            else
            {
                Salary=amount;
            }
            System.out.printf("The total salary is %.2f",Salary);


    }
}
