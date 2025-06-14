import java.util.Scanner; //Display binary representations of all numbers from 0 to the specified range.

public class All_decimal_in_binary {
    public static void main(String[] args) {
        System.out.println("Enter Range:");
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        for(int i=1; i<=range;i++){
            int temp=i, rem;
            String str="";
            while (temp>0){
                rem=temp%2;
                str=rem+str;
                temp=temp/2;
            }
            System.out.println("Decimal:"+ i +" Binary:"+str);
        }
    }
}
