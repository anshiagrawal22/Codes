import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter range:");
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int i,j,count;
        for(i=1;i<=range;i++){
            count=0;
            for (j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count ==2){
                System.out.println(i);
            }
        }
    }
}
