import java.util.Scanner;

public class SpyNumber { //A number where the sum of its digits equals the product of its digits.
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int digit,t=num,sum=0,product=1;
        while(t>0){
            digit=t%10;
            sum=sum+digit;
            product=product*digit;
            t=t/10;
        }
        System.out.println("Sum:"+sum+"\nProduct:"+product);
        if(sum==product)
            System.out.println(num+" is a Spy Number");
        else
            System.out.println(num+ " is not a Spy Number");
    }
}
