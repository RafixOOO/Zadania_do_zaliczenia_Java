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
public class ZadanieG1_24 {
    public static void main(String[] args){
        double[] x= {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
        double iloczyn=1;
        for(int i=0;i<x.length;i++){
            iloczyn=iloczyn*x[i];
        }
        double srednia=Math.pow(iloczyn,1.0/16);
        System.out.println(srednia);
    }
}
