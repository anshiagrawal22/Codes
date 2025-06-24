package Patterns.Alphabets;
//      A
//    A B
//  A B C
//A B C D
public class RightAligned {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=4;i++){
            char str='A';
            for(k=4;k>i;k--){
                System.out.print(" "+" ");
            }
            for (j=1;j<=i;j++){
                System.out.print(str++ +" ");
            }
            System.out.println();
        }
    }
}
