package Patterns.Level2;
//*             *
//* *         * *
//* * *     * * *
//* * * * * * * *
//* * *     * * *
//* *         * *
//*             *
public class ButterflyPattern {
    public static void main(String[] args) {
        UpperHalf();
        LowerHalf();
    }
    public static void UpperHalf(){
            int i,j,k;
            for(i=1;i<=4;i++){
                for(j=1;j<=i;j++){ //first half
                    System.out.print("*"+" ");
                }
                for(k=4;k>i;k--){ //2(No. of rows - i)
                    System.out.print(" "+" "+" "+" ");
                }
                for(j=1;j<=i;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
        }
    }
    public static void LowerHalf(){
        int i,j,k;
        for(i=1;i<=4;i++){
            for(j=3;j>=i;j--){
                System.out.print("*"+ " ");
            }
            for(k=1;k<=i;k++){
                System.out.print(" "+ " "+ " "+ " ");
            }
            for(j=3;j>=i;j--){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
