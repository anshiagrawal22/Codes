import java.util.Scanner;

public class CheckingNumber {
    public static void main(String[] args) {
        System.out.print("To check: \n1. Odd or Even \n2. Largest Among 3 Numbers\n Choice:");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                odd_even();
                break;
            case 2:
                largestNumber();
                break;
            default:
                System.out.println("Invalid Choice");
                System.out.println("Thank you!");
                break;
        }
    }
    static void odd_even() {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
    static void largestNumber() {
        System.out.println("Enter 3 numbers:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println(a+ "is greater");
        else if (b>a && b>c)
            System.out.println(b+"is greater");
        else
            System.out.println(c+ "is greater");
    }
}
