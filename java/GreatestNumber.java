import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three distinct numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( a!=b && b!=c && c!=a){
        if(a>b && a>c)
        System.out.println(a + " is the greatest number");
        else if(b>a && b>c)
        System.out.println(b + " is the greatest number");
        else if(c>a && c>b)
        System.out.println(c + " is the greatest number");
        }
        else if( a==b || b==c || c==a)
        System.out.println("Two numbers are same, kindly enter three DISTINCT numbers");
    }
}
