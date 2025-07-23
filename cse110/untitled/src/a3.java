//ass3
import java.util.Scanner;
public class a3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
        int posi =0;
        int nega= 0;


        for (int i =1;i <=n;i++) {
            System.out.print("Enter number " + i + ": ");
            int num =sc.nextInt();
            if (num<0)nega++;
            else {
                posi++;
            }
        }


        System.out.println(posi + " Non-negative Numbers");
        System.out.println(nega + " Negative Numbers");
    }
}
