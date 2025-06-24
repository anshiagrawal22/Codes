package Patterns.Alphabets;
//A
//A B
//A B C
//A B C D
public class LeftAligned {
    public static void main(String[] args) {
        char str;
        int i, j;
        for (i = 1; i <= 4; i++) {
            str='A';
            for(j=1;j<=i;j++){
                System.out.print(str++);
            }
            System.out.println();

        }
    }
}
