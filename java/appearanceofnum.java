public class appearanceofnum {
    public static void main(String[] args) {
        int A[]={2,3,4,2,3,2,5,2};
        int n =2;
        int count=0;
        for(int i=0;i<A.length; i++){
            if(n==A[i])
            {
                count++;
            }
        }
        System.out.println("Number of times "+ n + " occurs in an array:" + count);
    }
}
