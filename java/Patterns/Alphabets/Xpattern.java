package Patterns.Alphabets;
//A       A
// B     B
//  C   C
//   D D
//    E
//   D D
//  C   C
// B     B
//A       A
public class Xpattern {
    public static void main(String[] args) {
        UpperHalf();
        LowerHalf();
    }
    public static void UpperHalf(){
        int i,j,k;
        char str='A';
        for(i=1;i<=5;i++){ //left
            for (j=1;j<=5;j++){
                if(i==j)
                    System.out.print(str);
                else
                    System.out.print(" ");
            }
            for (j=4;j>=1;j--){ //right
                if(i==j)
                    System.out.print(str);
                else
                    System.out.print(" ");
            }
            str++;
            System.out.println();
        }
    }
    public static void LowerHalf(){
        int i,j,k;
        char str='D';
        for(i=1;i<=4;i++){ //left
            for (j=1;j<=5;j++){
                if(i+j==5)
                    System.out.print(str);
                else
                    System.out.print(" ");
            }
            for (j=4;j>=1;j--){ //right
                if(i+j==5)
                    System.out.print(str);
                else
                    System.out.print(" ");
            }
            str--;
            System.out.println();
        }
    }
}
