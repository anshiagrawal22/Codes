import java.util.*;

public class DecimaltoBinary {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, rem;
        String str = "";
        while (temp > 0) {
            rem = temp % 2;
            str = rem + str; //logic: remainder concatenates string
            temp = temp / 2;
        }
        System.out.println("Decimal Number:" + num);
        System.out.println("Binary Form:" + str);
    }
    }