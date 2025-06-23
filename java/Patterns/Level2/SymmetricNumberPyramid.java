package Patterns.Level2;
//    1
//   2 3
//  4 5 6
// 7 8 9 10
public class SymmetricNumberPyramid {
    public static void main(String[] args) {
        int i,j,k,num=1;
        for(i=1;i<=4;i++){
            for(k=4;k>i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
}
