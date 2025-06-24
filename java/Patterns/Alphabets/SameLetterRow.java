package Patterns.Alphabets;
//A
//B B
//C C C
//D D D D
public class SameLetterRow {
    public static void main(String[] args) {
        int i,j;
        char str='A';
        for(i=1;i<=4;i++){
            for(j=1;j<=i;j++){
                System.out.print(str);
            }
            str ++;
            System.out.println();
        }
    }
}
