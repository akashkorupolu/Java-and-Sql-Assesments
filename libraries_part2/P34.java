// Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has.

import java.io.FileReader;
import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name:");
        String filename = sc.nextLine();

        int uppercount = 0, lowercount = 0, digitcount = 0;

        try {
            FileReader fr = new FileReader(filename);
            int ch;

            while ((ch = fr.read()) != -1) {
                if (Character.isLowerCase((char) ch)) {
                    lowercount++;
                } else if (Character.isUpperCase((char) ch)) {
                    uppercount++;
                } else if (Character.isDigit((char) ch)) {
                    digitcount++;
                }
            }

            fr.close();

            System.out.println("Lowercase letters: " + lowercount);
            System.out.println("Uppercase letters: " + uppercount);
            System.out.println("Digits: " + digitcount);

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
