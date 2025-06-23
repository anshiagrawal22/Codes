package Patterns.Level2;
//* * * *
// * * *
//  * *
//   *
//  * *
// * * *
//* * * *
public class SandglassPattern {
    public static void main(String[] args) {
        UpperHalf();
        LowerHalf();
    }
    public static void UpperHalf(){
        int i, j, k;
        for(i=1;i<=4;i++){
            for (k=1;k<i;k++) {
                System.out.print("");
            }
            for(j=4;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void LowerHalf(){
        int i, j, k;
        for(i=1;i<=3;i++){
            for(k=2;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}

