//Write a program to create a function that takes multiple numbers and displays common factors.
import java.util.Scanner;
import java.util.ArrayList;
public class P10 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter no.of elements you want to find common factor");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] num_list=new int[n];
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number you want a common factor");
            num_list[i]=sc.nextInt();
            if(num_list[i]<min)
                min=num_list[i];
        }
        sc.close();

        ArrayList<Integer> common_factors=new ArrayList<Integer>();

        

        for(int j=1;j<=min;j++)
        {
            boolean flag=true;
            for (int x : num_list) {
                if(x%j!=0)
                {
                    flag=false;
                    break;
                }
                
            }
            if(flag)
                common_factors.add(j);


        }

        System.out.println(common_factors.toString());

    }
}
