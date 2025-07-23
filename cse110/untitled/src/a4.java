//ass4
import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n =sc.nextInt();
        int c= 0;

        int num =1;
        int sum= 0;

        System.out.println("The odd numbers are:");
        while (c<n) {
            System.out.println(num);
            sum+= num;
            num+= 2;
            c++;
        }


        System.out.println("The Sum of odd Natural Numbers up to " +n+ " terms is: " + sum);
    }
}
