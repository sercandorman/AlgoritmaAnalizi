package javaapplication3;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MaximumSubArraySum_nlogn {

    public static int[] anArray = new int[10000];

    /* Function to largest continuous sum */
    public int maxSequenceSum(int[] arr) {
        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            /* calculate maxEndingHere */
            if (maxEndingHere < 0) {
                maxEndingHere = arr[i];
            } else {
                maxEndingHere += arr[i];
            }

            /* calculate maxSoFar */
            if (maxEndingHere >= maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }
        return maxSoFar;
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

    public static void main(String[] args) {
        final long startTime = System.nanoTime();
        Scanner scan = new Scanner(System.in);
        System.out.println("Kadane Algorithm Test\n");
        /* Make an object of Kadane class */
        MaximumSubArraySum_nlogn k = new MaximumSubArraySum_nlogn();
        int[] dizi = doldur();
        int sum = k.maxSequenceSum(dizi);
        System.out.println("\nMaximum Sequence sum = " + sum);
        final long duration = System.nanoTime() - startTime;
        System.out.println(duration);

        double durationInMs = TimeUnit.MILLISECONDS.convert(duration, TimeUnit.NANOSECONDS);
        System.out.println(durationInMs);

    }
}
