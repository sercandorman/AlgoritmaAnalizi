
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MaximumSubArraySum_nPow3{

    public static int[] anArray = new int[100];

    public static int brutalForce(int[] input) {

        int bestSum = -Integer.MAX_VALUE;

        for (int start = 0; start < input.length; start++) {

            for (int end = start; end < input.length; end++) {

                int sum = input[start];
                bestSum = Math.max(sum, bestSum);

                for (int mid = start + 1; mid < end; mid++) {
                    sum = Math.max(input[mid], input[mid] + sum);
                    bestSum = Math.max(sum, bestSum);
                }
            }
        }

        return bestSum;
    }

    public static void runTest(int[] input) {

        System.out.printf("\n");
        System.out.printf("Input: ");
        for (int i = 0; i < input.length; i++) {
            System.out.printf("%2d", input[i]);
            if (i < input.length - 1) {
                System.out.printf(", ");
            }
        }
        System.out.printf("\n");

        int result = 0;

        result = MaximumSubArraySum_nPow3.brutalForce(input);
        System.out.printf("solve3 result = %d\n", result);

    }

    public static int[] doldur() {

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = randomSayilar();
        }
        return anArray;
    }

    public static int randomSayilar() {
        Random rand = new Random();
        int randomNum = rand.nextInt(20) - 10;
        return randomNum;
    }

    public static void main(String argv[]) {
        final long startTime = System.nanoTime();
        int[] test1 = {-2, -3, 4, -1, -2, -1, -5, -3};
        MaximumSubArraySum_nPow3 k = new MaximumSubArraySum_nPow3();
        int[] dizi = doldur();
        int sum = k.brutalForce(dizi);
        System.out.println("\nMaximum Sequence sum = " + sum);

        final long duration = System.nanoTime() - startTime;
        System.out.println(duration); //mikrosaniye

        double durationInMs = TimeUnit.MILLISECONDS.convert(duration, TimeUnit.NANOSECONDS);
        System.out.println(durationInMs);

    }
}
