// Write a program to create an array of 10 elements, fill it with random no's and display array elements which are greater than average of array.
import java.util.Random;
import java.util.Arrays;
public class AverageArray {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Random r =  new Random();
        int sum=0;

        for(int i=0;i<10;i++)
        {
            arr[i]=r.nextInt(1,100);
            sum+=arr[i];
        }

        int average=sum/10;
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            if(i>average)
                System.out.println(i);
        }

    }
}
