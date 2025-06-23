package Patterns.Level2;
//1
//2 3
//4 5 6
public class FloydsTriangle { //A right-angled triangle with consecutive natural numbers
    public static void main(String[] args) {
        int i,j,k=1;
        for(i=1;i<=3;i++){
            for(j=1;j<=i;j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
