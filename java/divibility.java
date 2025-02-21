public class divibility{
    public static void main(String[] args) {
        int i;
        System.out.println("Numbers from 10 to 950 that are divisible both by 6 and 9 are:");
        for (i=10;i<=950;i++){
            int num=i;
            if (num%6==0 && num %9 ==0)
            {
                System.out.println(num);
            }
        }
    }
}