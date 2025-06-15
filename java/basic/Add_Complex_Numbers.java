import java.util.Scanner;

public class Add_Complex_Numbers {
    public static void main(String[] args) {
        System.out.println("How many integers you want to add?");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] real = new int[n]; //initializing the array
        int[] complex = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the real part of "+ (i+1) +" number:");
            real[i]=sc.nextInt();
            System.out.println("Enter complex of "+ (i+1) +" number:");
            complex[i]= sc.nextInt();
        }
        int realSum=0,complexSum=0;
        for (i=0;i<n;i++)
        {
            realSum= realSum+ real[i];
            complexSum=complexSum+complex[i];
        }
        System.out.println("Adding all integers we get:");
        System.out.println(realSum +" + ("+complexSum+ "i)");
    }

}
