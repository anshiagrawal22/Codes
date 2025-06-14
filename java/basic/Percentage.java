import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        System.out.println("Enter Marks out of 100:");
        Scanner sc= new Scanner(System.in);
        System.out.print("Physics:");
        int phy=sc.nextInt();
        System.out.print("Chemistry:");
        int chem=sc.nextInt();
        System.out.print("Maths:");
        int maths= sc.nextInt();
        System.out.print("Biology:");
        int bio= sc.nextInt();
        System.out.print("English:");
        int eng= sc.nextInt();
        System.out.println();

        double total= phy+chem+maths+bio+eng;
        double per= (total/500) * 100;
        System.out.println("Total Marks Obtained:"+ total);
        System.out.println("Percentage:"+per+"%");

    }
}

