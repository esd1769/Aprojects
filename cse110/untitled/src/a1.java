//assignment1
import java.util.Scanner;
public class a1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            if (i %5==0 && i %3!=0){
                System.out.println(i);
            }
        }
    }
}
