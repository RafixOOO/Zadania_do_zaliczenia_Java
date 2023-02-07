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
public class ZadanieG2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierścień zewnętrzny: ");
        float R = input.nextFloat();
        System.out.println("Podaj pierścień wewnętrzny: ");
        float r = input.nextFloat();
        if(r>R){
            System.out.println("Pierścień wewnętrzny nie może być większy od zewnętrzego \n");
            System.out.println("Podaj pierścień zewnętrzny: ");
            R = input.nextFloat();
            System.out.println("Podaj pierścień wewnętrzny: ");
            r = input.nextFloat();
        }
        float pi = 3.14f;
        
        float pole = pi * (R * R) - pi * (r * r);
        pole = pole/pi;
        System.out.println("Pole pierścienia wynosi: " + pole + "π");
        input.close();   
    }
}
