import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int t=num,digit,sum=0;
        while(t>0){
            digit=t%10;
            sum=sum+(digit*digit*digit);
            t=t/10;
        }
        System.out.println("Number:"+num);
        System.out.println("Sum of cube of digits:"+sum);
        if(num==sum)
            System.out.println(num+ " is an Armstrong Number");
        else
            System.out.println(num + " is not an Armstrong Number");
    }
}
