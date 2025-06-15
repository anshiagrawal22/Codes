import java.util.Scanner;

public class NeonNumber { //A number where the sum of digits of its square equals the number.
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,digit,t=num*num;
        while(t>0){
            digit=t%10;
            sum=sum+digit;
            t=t/10;
        }
        if (sum==num)
            System.out.println(num+ " is a Neon Number");
        else
            System.out.println(num + " is not a Neon Number");
    }
}
