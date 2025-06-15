import java.util.Scanner;

public class NivenNumber { //A number divisible by the sum of its digits.
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int t=num,digit,sum=0;
        while(t>0){
            digit=t%10;
            sum=sum+digit;
            t=t/10;
        }
        System.out.println("Sum of digit of "+num+" is:"+sum);
        if(num%sum==0)
            System.out.println(num+ " is a Niven Number as it is divisible by "+sum);
        else
            System.out.println(num+ " is not a Niven Number");
    }
}
