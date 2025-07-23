//ass9
import java.util.Scanner;
public class a9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c= 0;
        int sum =0;
        for (int i=1;i < n;i++) {
            if (n% i== 0){
                sum+= i;
                c++;

            }
        }
        if(c ==1) {
            System.out.println(n+ " is a prime number");
        } else {

            System.out.println(n+ " is not a prime number");
        }
        if (sum == n) {
            System.out.println(n + " is a perfect number");}

        else{
            System.out.println(n+" is not a perfect number");

        }
    }
}

