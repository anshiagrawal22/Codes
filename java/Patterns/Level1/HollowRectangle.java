package Patterns.Level1;
//*****
//*   *
//*****
public class HollowRectangle {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=3;i++){
            for(j=1;j<=5;j++){
                if(i==3||i==1||j==1||j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
