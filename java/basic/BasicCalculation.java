import java.util.Scanner; //To perform basic mathematical operation
public class BasicCalculation {
    public static void main(String[] args) {
        System.out.println("Enter 2 values:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        operation(a,b);
        System.out.println("Go back to options? \n 1. Yes \n 2. No");
        int ch= sc.nextInt();
        if(ch==1)
            operation(a,b);
        else
            System.out.println("Thank You!");
    }
    static void operation(int a,int b) {
        System.out.println("Choose operation to perform: \n 1. Addition\n 2. Difference \n 3. Multiplication \n 4. Division \n 5. Remainder ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int sum = a + b;
                System.out.println("sum=" + sum);
                break;
            case 2:
                int diff;
                if (a > b) {
                    diff = a - b;
                } else {
                    diff = b - a;
                }
                System.out.println("difference=" + diff);
                break;
            case 3:
                int mul = a * b;
                System.out.println("Multiplication=" + mul);
                break;
            case 4:
                int div;
                if (b > a) {
                    div = a / b;
                } else {
                    div = b / a;
                }
                System.out.println("Division=" + div);
                break;
            case 5:
                int rem;
                if (b > a) {
                    rem = a % b;
                } else {
                    rem = b % a;
                }
                System.out.println("Remainder=" + rem);
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

    }
}
