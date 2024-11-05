// Write a main method in Solution class.
// In the main method, read five values for an integer array and two int value which are the limits(limit1 and limit 2). The main method should print the average of integer values which are greater than limit1 and less than limit2.
// For e.g., if the values are 1,2,3,4,5 and the limits are 2 and 6 then the average is 4((3+4+5)/3). The output should be in the format of sample output.
// Note: The returned average value should be of int data type.
// Sample input:
// 1
// 2
// 3
// 4
// 5
// 2
// 6
// Output: 4

import java.util.Scanner;

public class IPA_MockProblem1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Reading 5 integer values into an array
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = scanner.nextInt();
            }
    
            // Reading limit1 and limit2
            int limit1 = scanner.nextInt();
            int limit2 = scanner.nextInt();
    
            // Calculating the sum and count of values within the range
            int sum = 0;
            int count = 0;
    
            for (int num : arr) {
                if (num > limit1 && num < limit2) {
                    sum += num;
                    count++;
                }
            }
    
            // Calculating the average as an integer
            int average = (count > 0) ? (sum / count) : 0;
    
            // Printing the result
            System.out.println(average);
    
            scanner.close();
        }
     
}
