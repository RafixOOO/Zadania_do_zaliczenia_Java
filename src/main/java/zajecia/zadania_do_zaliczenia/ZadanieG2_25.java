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
public class ZadanieG2_25 {
    public static void main(String[] args){
        double[] x= {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
        int k[]=new int[x.length];
        double liczba[]=new double[x.length];
        Arrays.sort(x);
        int l=0;
        liczba[l]=x[l];
        for(int i=0;i<x.length;i++){
            if(liczba[l]==x[i]){
              k[l]=k[l]+1;
            }
            else{
                l++;
                liczba[l]=x[i];
                k[l]=k[l]+1;
            }
        }
        for(int i=0;i<liczba.length;i++){
            System.out.println("Liczba "+liczba[i]+" Występuje: "+k[i]);
        }
    }
}
