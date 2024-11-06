import java.util.Scanner;

public class IPA_Problem2 {
    public static void main(String[]args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int num =sc.nextInt();
            int sum =0;
            while(num >0)
            {
                sum +=num %10;num /=10;
            }
            if(sum %3 ==0)
            {
                System.out.println("TRUE");
            }
            else
            {
                System.out.println("FALSE");
            }
        }
    }
}
