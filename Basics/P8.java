import java.util.Scanner;
public class P8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter a number");
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int j=4;j>=0;j--)
        {
            System.out.println(arr[j]);
        }
    }
}
//8. Write a program to create an array of 5 elements and store values into it by taking them from the keyboard and display them in reverse order.
