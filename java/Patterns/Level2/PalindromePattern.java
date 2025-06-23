package Patterns.Level2;
//    1
//   2 1 2
//  3 2 1 2 3
public class PalindromePattern {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=3;i++){
            for(k=3;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i+2;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
