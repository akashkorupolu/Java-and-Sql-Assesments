//Write a program to guess the random number in three attempts. The range is (1 to 25).
import java.util.Random;
import java.util.Scanner;

public class RandomGuess
{
    int chances=1;
    public String numGuess()
    {
        Scanner sc =new Scanner(System.in);
        Random r=new Random();
        int guess_num=r.nextInt(1,26);
        

        while(chances<4)
        {
            System.out.println("enter a number");
           int num=sc.nextInt();
            if(num==guess_num)
            {
                sc.close();
               return "You guessed it right";

            }
            else if (guess_num<num) {
                System.out.println("Enter a smaller number than "+num);
            }
            else
                System.out.println("Enter a greater number than "+num);
            chances+=1;

        }
        sc.close();
        System.out.println(guess_num);
        return "better luck nextime";

    }


    public static void main(String[] args) {
        RandomGuess r=new RandomGuess();
        System.out.println(r.numGuess());
    }
}