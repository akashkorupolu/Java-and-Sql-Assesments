import java.util.Scanner;

public class Counter {
    private int count;
    
    public Counter(int count)
    {
        this.count=count;
    }

    

    public int presentCount()
    {
        return count;
    }

    public void increment()
    {
        count+=1;
    }

    public void decrement()
    {
         count-=1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :");
        int count=sc.nextInt();
        Counter c=new Counter(count);


        
        int num;
        do 
        {
        System.out.println("Enter a case to do operation");
        System.out.println("press 1 to know count");
        System.out.println("press 2 to increment");
        System.out.println("press 3 to decrement");
        System.out.println("press 0 to exit");
        num=sc.nextInt();
            switch (num) {
                case 1:
                    int val=c.presentCount();
                    System.out.println("The count is "+val);
                    break;
                
                case 2:
                    c.increment();
                    break;
                
                case 3:
                    c.decrement();
                    break;
            
                default:
                    System.out.println("You have entered wrong number");
                    break;
            }
            


           
        }
        while(num!=0);
        sc.close();
    }

}
