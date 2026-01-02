//Write a program to accept a string that contains marks separated by commas and display total.
import java.util.Scanner;

public class TotalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks separated by comas");
        String marks_string = sc.nextLine();
        sc.close();
        int total=0;
        String[] marks=marks_string.split(",");
        for (String string : marks) {
            int m =Integer.parseInt(string);
            total+=m;
        }

        System.out.println("Total marks are "+total);
    }
}
