/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import java.util.Arrays;

/**
 *
 * @author rpezd
 */
public class ZadanieG2_24 {
    public static void main(String[] args){
        double[] x= {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
        Arrays.sort(x);
        int ilosc=x.length/2;
        if(ilosc%2==0){
            System.out.println((x[ilosc]+x[ilosc+1])/2);
        }
        else{
            System.out.println(x[ilosc]);
        }
    }
}
