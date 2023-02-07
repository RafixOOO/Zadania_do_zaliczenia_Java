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
public class ZadanieG2_27 {
    public static int[][] sum(int[][] tablica1, int[][] tablica2) {
        int[][] tablica3 = new int[tablica1.length][tablica2[0].length];
        for(int i = 0; i < tablica1.length; i++) {
            for(int j = 0; j < tablica1[i].length; j++) {
                tablica3[i][j] = tablica1[i][j] + tablica2[i][j];
            }
        }
        return tablica3;
    }
    
    public static int[][] difference(int[][] tablica1, int[][] tablica2) {
        int[][] tablica3 = new int[tablica1.length][tablica1[0].length];
        for(int i = 0; i < tablica1.length; i++) {
            for(int j = 0; j < tablica1[i].length; j++) {
                tablica3[i][j] = tablica1[i][j] - tablica2[i][j];
            }
        }
        return tablica3;
    }
    
    public static void main(String[] args) {
        int[][] tablica1 = new int[5][6];
        int[][] tablica2 = new int[5][6];
        
        Random rand = new Random();
        for(int i = 0; i < tablica1.length; i++) {
            for(int j = 0; j< tablica1[i].length; j++) {
                tablica1[i][j] = rand.nextInt(50);
                System.out.print(tablica1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i = 0; i < tablica2.length; i++) {
            for(int j = 0; j < tablica2[i].length; j++) {
                tablica2[i][j] = rand.nextInt(50);
                System.out.print(tablica2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        if(tablica1.length == tablica2.length && tablica1[0].length == tablica2[0].length) {
            int[][] sum = sum(tablica1, tablica2);
            for(int i = 0; i < sum.length; i++) {
                for(int j = 0; j < sum[i].length; j++) {
                    System.out.print(sum[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("\n");
            int[][] dif = difference(tablica1, tablica2);
            for(int i = 0; i < dif.length; i++) {
                for(int j = 0; j < dif[i].length; j++) {
                    System.out.print(dif[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nie można wykonać dodawania i odejmowania na tych macierzach!");
        }
    }
}
