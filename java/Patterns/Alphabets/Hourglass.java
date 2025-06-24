package Patterns.Alphabets;
//A B C D E
// A B C D
//  A B C
//   A B
//    A
//   A B
//  A B C
// A B C D
//A B C D E
public class Hourglass {
    public static void main(String[] args) {
        UpperHalf();
        LoweHalf();
    }

    static void UpperHalf() {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            char str = 'A';
            for (k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (j = 5; j >= i; j--) {
                System.out.print(str + " ");
                str++;
            }
            System.out.println();
        }
    }

    public static void LoweHalf() {
        int i, j, k;
        for (i = 1; i <= 4; i++) {
            char str = 'A';
            for (k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i+1; j++) {
                System.out.print(str + " ");
                str++;
            }
            System.out.println();
        }
    }
}

