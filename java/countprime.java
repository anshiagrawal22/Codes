public class countprime {

    public static void main(String[] args) {
        int i,j;
        System.out.println("Prime NUmbers between 10 to 1000:");
        for(i=10;i<=1000;i++){
            int count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
                if(count==2){
                    System.out.println(i);
                }
        }
    }
}
