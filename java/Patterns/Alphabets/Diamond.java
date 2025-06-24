package Patterns.Alphabets;
//    A
//   B B
//  C C C
// D D D D
//  C C C
//   B B
//    A
public class Diamond {
    public static void main(String[] args) {
        UpperHalf();
        LoweHalf();
    }

    static void UpperHalf() {
        int i, j, k;
        char str = 'A';
        for (i = 1; i <= 4; i++) {
            for (k = 4; k > i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(str + " ");
            }
            System.out.println();
            str++;
        }
    }

    public static void LoweHalf() {
        int i, j, k;
        char str = 'C';
        for (i = 1; i <= 3; i++) {
            for (k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (j = 3; j >= i; j--) {
                System.out.print(str + " ");
            }
            System.out.println();
            str--;
        }
    }
}
