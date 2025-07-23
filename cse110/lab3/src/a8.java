//ass8
import java.util.Scanner;
public class a8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int m=n;
        int c=0;
        while (m>0){
            c++;
            m= m/10;

        }
        int pow=1;
        for (int i=0;i<c-1;i++){
            pow*=10;

        }
        while (pow>0){
            System.out.print(n/pow);

            n= n%pow;
            pow/=10;
            if (n>= 0&& pow!=0) {


                System.out.print(", ");
            }
        }


    }
}