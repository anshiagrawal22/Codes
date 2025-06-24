package Patterns.Alphabets;
//A B C D E
//      D
//    C
//  B
//A B C D E
public class Zpattern {
    public static void main(String[] args) {
        int i,j;
        char str2='D';
        for(i=1;i<=5;i++){
            char str='A';
            for(j=1;j<=5;j++){
                if(i==1||i==5)
                    System.out.print(str++ + " ");
                else if (i+j==6)
                    System.out.print(str2-- + " ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
