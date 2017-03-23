
package javaarrayinsertionsort;

import java.util.Random;

public class JavaArrayInsertionSort {
    
    public static int[] anArray = new int[10];
    
    public static int[] doInsertionSort(int[] input){
		
	    int temp;
	    for (int i = 1; i < input.length; i++) {
		    for(int j = i ; j > 0 ; j--){
			    if(input[j] < input[j-1]){
				    temp = input[j];
				    input[j] = input[j-1];
				    input[j-1] = temp;
			    }
		    }
	    }
	    return input;
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
            System.out.print("İlk hali : ");
                for (int i : dizi) {
                    System.out.print(i);
                    System.out.print(" ");
                }
            System.out.print("\nSon hali : ");
            int[] dizi2 = doInsertionSort(dizi);
		for(int i:dizi2){
			System.out.print(i);
			System.out.print(", ");
		}
	}
	   
}
