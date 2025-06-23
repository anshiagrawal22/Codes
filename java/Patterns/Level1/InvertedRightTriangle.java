package Patterns.Level1;
//****
// ***
//  **
//   *
public class InvertedRightTriangle {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++){
            for (int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(j=4;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
