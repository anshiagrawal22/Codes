import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = var1.nextInt();
        int d,sum=0,t; //d for digit
        t=num; //temporary variable;
        System.out.print("Digits:");
        while(t>0)
        {
            d=t%10;
            sum=sum+d;
            System.out.print(d + " ");
            t=t/10;
        }
        System.out.print("\n");
        System.out.println("Sum of digits:" +sum );
        var1.close();
    }
}
