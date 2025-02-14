import java.util.Scanner;  

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (% per annum): ");  // Fixed string
        double rate = sc.nextDouble();

        System.out.print("Enter Time Period (in years): ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + interest);
        
    }
}
