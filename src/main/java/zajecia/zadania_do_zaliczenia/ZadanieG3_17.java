/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

/**
 *
 * @author rpezd
 */
public class ZadanieG3_17 {
    public static double[] rndArray(int n, double a, double step){
        double[] tablica = new double[n];
        
        tablica[0] = 0;
        for (int i = 1; i < tablica.length; i++) {
            if(tablica[i-1] == a){
                tablica[i] = a;
            }else{
                tablica[i] = tablica[i-1]+step;
            }
        }
        return tablica;
    }
    public static void main(String[] args) {
        double[] tablica = rndArray(50, 20, 0.3);
        for (double d : tablica) {
            System.out.print(d + " ");
        }
    }
}
