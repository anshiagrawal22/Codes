import java.util.Scanner;
import java.lang.Math;

public class HCF{
    public static void main(String[] args) {
        System.out.println("Enter two Numbers:");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int range,i,hcf=1;
        range=Math.min(a,b);

        for(i=1;i<=range;i++) //logic
        {
            if (a%i==0 && b%i==0){
                if(hcf<i){
                    hcf= i;
                }
            }
        }
        System.out.println("Highest Common Factor:"+hcf);
    }

}




