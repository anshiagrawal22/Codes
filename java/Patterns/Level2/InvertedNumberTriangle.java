package Patterns.Level2;
//1 2 3 4
//1 2 3
//1 2
//1
public class InvertedNumberTriangle {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=4;i++){
            int k=1;
            for(j=4;j>=i;j--){
                    System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
