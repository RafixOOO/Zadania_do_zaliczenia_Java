/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import java.util.Random;

/**
 *
 * @author rpezd
 */
public class ZadanieG2_28 {
    static void upperTriangular(double[][] tablica) {
        if(tablica.length == tablica[0].length) {
            for(int i = 0; i < tablica.length - 1; ++i) {
                for(int j = i + 1; j < tablica.length; ++j) {
                    if(tablica[i][i] != 0) {
                        double p = tablica[j][i]/tablica[i][i];
                        for(int k = 0; k < tablica.length; ++k) {
                            tablica[j][k] -= tablica[i][k] * p;
                        }
                    } else {
                        for(int k = i + 1; k < tablica.length; ++k) {
                            if(tablica[k][i] != 0) {
                                for(int m = 0; m < tablica.length; ++m) {
                                    double temp = tablica[i][m];
                                    tablica[i][m] = tablica[k][m];
                                    tablica[k][m] = -temp;
                                }
                                break;
                            }
                        }
                    }
                }
            }
            for(int i = 0; i < tablica.length; i++) {
                for(int j = 0; j < tablica[i].length; j++) {
                    System.out.printf("%.2f\t", tablica[i][j]);
                }
            System.out.println();
        }
        } else {
            System.out.println("Macierz nie jest kwadratowa!");
        }
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] tablica = new double[7][7];
        for(int i = 0; i < tablica.length; i++) {
            for(int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = rand.nextInt(50);
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        upperTriangular(tablica);
    }
}
