import java.util.Scanner;

public class PerfectNumber { //A number that is equal to the sum of its proper divisors (excluding itself).
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int divisor,i,sum=0;
        for(i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
                System.out.print(i+"+");
            }
        }
        System.out.println("="+sum);
        if(num==sum)
            System.out.println(num+ " is a Perfect Number");
        else
            System.out.println(num+ " is not Perfect Number");
    }
}
