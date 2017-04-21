/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listmaxminortvar;

import java.util.Random;

/**
 *
 * @author BM
 */
public class ListMaxMinOrtVar {

    public static double[] anArray = new double[10];

    private static double[] doldur() {

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = randomSayilar();
        }
        return anArray;
    }

    private static double randomSayilar() {
        Random rand = new Random();
        double randomNum = rand.nextInt(5);
        return randomNum;
    }

    private static void printNumbers(double[] input) {
        System.out.print("Dizi : ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    private static void maxMinAvgValue(double[] input) {
        double max = input[0];
        double min = input[0];
        double toplam = 0, avg = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }
            toplam = toplam + input[i];

        }
        avg = toplam / input.length;
        System.out.println("Max = " + max + "\n Min = " + min + "\n Avg = " + avg);
    }

    private static void varyansValue(double[] input) {
        double max = input[0];
        double min = input[0];
        double toplam = 0, avg = 0, tmp2 = 0, tmp = 0;
        for (int i = 0; i < input.length; i++) {
            toplam = toplam + input[i];
        }
        avg = toplam / input.length;
        for (int i = 0; i < input.length; i++) {
            tmp = tmp + (Math.abs(input[i] - avg));
            tmp2 = tmp2 + ((input[i] - avg) * (input[i] - avg));

        }
        System.out.println("Standart Sapma = " + tmp / input.length);
        System.out.println("Varyans = " + tmp2 / input.length);
    }

    public static void main(String[] args) {
        ListMaxMinOrtVar lmmov = new ListMaxMinOrtVar();
        double[] dizi = lmmov.doldur();
        lmmov.printNumbers(dizi);
        lmmov.maxMinAvgValue(dizi);
        lmmov.varyansValue(dizi);
    }
}
