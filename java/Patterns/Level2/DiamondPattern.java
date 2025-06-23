package Patterns.Level2;
//   *
//  * *
// * * *
//  * *
//   *
public class DiamondPattern {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 3; i++) {
            for (k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (i = 1; i <= 2; i++) {
            for (k = 1; k <= i+1; k++) {
                System.out.print(" ");
            }
            for (j = 2; j >= i; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
