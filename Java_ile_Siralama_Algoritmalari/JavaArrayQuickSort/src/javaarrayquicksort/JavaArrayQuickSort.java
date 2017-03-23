package javaarrayquicksort;

import java.util.Random;

public class JavaArrayQuickSort {

    public static int[] anArray = new int[10];
    private int array[];
    private int length;

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a
             * number from right side which is less then the pivot value. Once
             * the search is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] doldur() {

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = randomSayilar();
        }
        return anArray;
    }

    public static int randomSayilar() {
        Random rand = new Random();
        int randomNum = rand.nextInt(110) - 10;
        return randomNum;
    }

    public static void main(String a[]) {

        JavaArrayQuickSort sorter = new JavaArrayQuickSort();

        int[] dizi = doldur();
        System.out.print("İlk hali : ");
        for (int i : dizi) {
            System.out.print(i);
            System.out.print(" ");
        }
        sorter.sort(dizi);
        System.out.print("\nSiralandiktan sonra : ");
        for (int i : dizi) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
