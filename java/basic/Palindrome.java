import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t = num, rem, rev = 0;
        while (t > 0) {
            rem = t % 10;
            rev = (rev * 10) + rem;
            t = t / 10;
        }
        System.out.println("Number:" + num);
        System.out.println("Reverse:" + rev);
        if (num == rev)
            System.out.println(num+" is a palindrome number");
        else
            System.out.println(num+" is not a palindrome number");
    }
}
