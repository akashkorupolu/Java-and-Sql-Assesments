import java.util.Scanner;
public class P9 {

    public void largestNum(int[] arr,int n)
    {
        int largest=-1;
        for (int k : arr) {
            if(k>largest)
                largest=k;
        }
        System.out.println("Largest number in arr is "+largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an Array");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter " +i+" element");
            arr[i]=sc.nextInt();
        }
        sc.close();
        P9 ob = new P9();
        ob.largestNum(arr,n);
    }
}
