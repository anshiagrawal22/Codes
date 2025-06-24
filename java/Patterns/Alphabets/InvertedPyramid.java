package Patterns.Alphabets;
//A B C D
// A B C
//  A B
//   A
public class InvertedPyramid {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=4;i++){
            char str='A';
            for(k=1;k<i;k++){
                System.out.print(" ");
            }
            for(j=4;j>=i;j--){
                System.out.print(str++ +" ");
            }
            System.out.println();
        }
    }
}
