package javaarrayselectionsort;

import java.util.Random;

public class JavaArraySelectionSort {

    public static int[] anArray = new int[10];
    
    public static int[] selectionSirala(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
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
    public static void main(String a[]){
        int[] dizi = doldur();
        System.out.println("Ilk hali :");
        for(int i:dizi){
            System.out.print(i+", ");
        }
        int[] dizi2 = selectionSirala(dizi);
        System.out.println("\nSiralamis Hali : ");
        for(int i:dizi2){
            System.out.print(i+", ");
        }
    }
}
