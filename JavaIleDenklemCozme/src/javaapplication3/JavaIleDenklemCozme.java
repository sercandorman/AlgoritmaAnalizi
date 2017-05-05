/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class JavaIleDenklemCozme {

    int x1 = 0, x2 = 0, x3 = 0;

    public void esalonYap(int a, int b, int[][] Array) {
        float temp1[] = null, temp2[] = null;
        float bolucu, k;
        int y, i, j, z, t, e, ti, tj;
        int kontrol;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                for (ti = 0; ti < a; ti++) {
                    for (tj = 0; tj < b; tj++) {//for1
                        i = ti;
                        j = tj;
                        t = j;
                        z = i;
                        if (i == j) {//if1
                            bolucu = Array[i][i];
                            if (bolucu == 0) {
                                for (j = 0; j < b; j++) {/*for1*/

                                    temp1[j] = Array[i][j];
                                }/*for1end*/

                                for (i = (a - 1); i > t; i--) {/*for2*/

                                    if (Array[i][t] != 0) {/*if3*/

                                        for (j = 0; j < b; j++) {
                                            temp2[j] = Array[i][j];
                                        }
                                        break;
                                    }/*if3end*/

                                }/*for2end*/

                                for (j = 0; j < b; j++) {/*for3*/

                                    Array[z][j] = (int) temp2[j];
                                    Array[i][j] = (int) temp1[j];
                                }/*for3end*/


                                System.out.println("Yerdegistirme iterasyonu;\n");
                                for (i = 0; i < a; i++) {
                                    for (j = 0; j < b; j++) {//for
                                        System.out.println(Array[i][j]);
                                        if (j == (b - 1)) {//if
                                            System.out.println("\n");
                                        }//ifend
                                    }//forend
                                }

                                bolucu = Array[z][z];

                                for (j = 0; j < b; j++) {//for2
                                    Array[z][j] = (int) (Array[z][j] / bolucu);

                                    if (j == (b - 1)) {//if2
                                        System.out.println("\n");
                                    }//if2end
                                }//for2end
                                for (y = 0; y < (a - 1); y++) {//for3
                                    if (y >= t) {//if3
                                        e = t;
                                        k = Array[(y + 1)][e];
                                        for (e = 0; e < b; e++) {//for4
                                            Array[(y + 1)][e] = (int) ((-1) * k * Array[z][e] + Array[(y + 1)][e]);

                                        }
                                    }//for3-4end   
                                    System.out.println("\n");
                                }//if3end

                                System.out.println("Iterasyon sonucu;\n");
                                for (i = 0; i < a; i++) {
                                    for (j = 0; j < b; j++) {
                                        System.out.println(Array[i][j]);
                                        if (j == (b - 1)) {
                                            System.out.println("\n");
                                        }
                                    }
                                }

                            }//ifbolucuend           
                            else {

                                for (j = 0; j < b; j++) {//for2
                                    Array[i][j] = (int) (Array[i][j] / bolucu);

                                    if (j == (b - 1)) {//if2
                                        System.out.println("\n");
                                    }//if2end
                                }//for2end
                                for (y = 0; y < (a - 1); y++) {//for3
                                    if (y >= t) {//if3
                                        e = t;
                                        k = Array[(y + 1)][e];
                                        for (e = 0; e < b; e++) {//for4
                                            Array[(y + 1)][e] = (int) ((-1) * k * Array[i][e] + Array[(y + 1)][e]);

                                        }
                                    }//for3-4end   
                                    System.out.println("\n");
                                }//if3end

                                System.out.println("Iterasyon sonucu;\n");
                                for (i = 0; i < a; i++) {
                                    for (j = 0; j < b; j++) {
                                        System.out.print(Array[i][j]+" ");
                                        if (j == (b - 1)) {
                                            System.out.println();
                                        }
                                    }
                                }

                            }//elseend
                        }//if1end
                    }//for1end
                }
            }
        }
        System.out.println("\nESELON FORM SONUCU;\n");
        for (i = 0; i < a; i++) {
            for (e = 0; e < b; e++) {//for
                j = e;
                System.out.print(Array[i][e] + " ");
                if (e == (b - 1)) {//if
                    System.out.println("");
                }//ifend
            }//forend
        }
    }//fonksiyonend

    public void denklemCoz(int[][] dizi, int[][] sonuc) {
        this.x3 = sonuc[2][0];
        this.x2 = (sonuc[1][0] - this.x3);
        this.x1 = (sonuc[1][0] - this.x3 - this.x2);
        System.out.println();
        System.out.println("x3 = " + this.x3);
        System.out.println("x2 = " + this.x2);
        System.out.println("x1 = " + this.x1);
    }

    public static void main(String[] args) {
        int[][] dizim = new int[][]{
            {7, 2, 7},
            {8, 3, 1},
            {7, 9, 1}
        };

        int[][] sonuc = new int[][]{{10}, {11}, {12}};

        JavaIleDenklemCozme jidc = new JavaIleDenklemCozme();
        jidc.esalonYap(3, 3, dizim);
        jidc.denklemCoz(dizim, sonuc);
    }

}
