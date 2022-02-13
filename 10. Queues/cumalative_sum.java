public class cumalative_sum {
    public static void main(String[] args) {
        int ar[] = {0,1,2,3,4,5,7};
        int csum[] = new int[ar.length];

        int sum = 0;
        for(int i=0;i<ar.length;i++){
            sum += ar[i];
            csum[i] = sum;
            System.out.print(csum[i]+",");
        }
    }
}
