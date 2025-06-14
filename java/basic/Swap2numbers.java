import java.util.Scanner;
public class Swap2numbers {
    public static void main(String[] args) {
        System.out.println("Enter two values:");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int temp; //temporary variable
        System.out.println("Before swapping\na:"+a+"\nb:"+ b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping\na:"+a+"\nb:"+ b);
    }
}
