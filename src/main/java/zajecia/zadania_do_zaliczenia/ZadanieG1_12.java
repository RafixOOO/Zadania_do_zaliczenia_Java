/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import java.util.Scanner;

/**
 *
 * @author rpezd
 */
public class ZadanieG1_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean i = false;
        double a;
        String b="Wszystkie liczby: ";
        double c=0;
        while (i == false) {
            a=input.nextDouble();
            b=b+a+", ";
            c=c+a;
            if(a==0){
                i=true;
                System.out.println(b);
                System.out.println("Suma: " + c);
            }
        }
    }
}
