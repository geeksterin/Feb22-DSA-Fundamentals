import java.util.Random;

public class ShufflingArray {
    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar) {
        Random rnd = new Random();

        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);  //rand()%(i+1)
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        shuffleArray(ar);

        for (var x : ar) {
            System.out.print(x + ",");
        }

    }
}
