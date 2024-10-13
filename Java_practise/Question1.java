package Java_practise;

import java.util.Scanner;

/*
 * Write a main method in Solution class, In the main method, read a string value and print the count of lower class characters present in the input String value.
 * If no lower class characters are present in the String value then it should print "No lower case characters present" as a string.
 */

 public class Question1
 {
    public static void main(String[] args) {
        int lower = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        for(int i = 0; i < str1.length(); i++)
        {
            char ch1 = str1.charAt(i);
            if(ch1 >= 'a' && ch1 <= 'z')
            {
                lower++;
            }
        }
        if(lower > 0)
        {
            System.out.println(lower);
        }
        else
        {
            System.out.println("No lower case characters present.");
        }
    }
 }
 