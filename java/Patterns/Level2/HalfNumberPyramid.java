package Patterns.Level2;
//1
//1 2
//1 2 3
public class HalfNumberPyramid {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=3;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
