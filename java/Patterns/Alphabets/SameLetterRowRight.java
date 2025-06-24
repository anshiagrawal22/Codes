package Patterns.Alphabets;
//      A
//    B B
//  C C C
//D D D D
public class SameLetterRowRight {
    public static void main(String[] args) {
        int i,j,k;
        char str='A';
        for(i=1;i<=4;i++){
            for(k=4;k>i;k--){
                System.out.print(" "+" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(str+" ");
            }
            str++;
            System.out.println();
        }
    }
}
