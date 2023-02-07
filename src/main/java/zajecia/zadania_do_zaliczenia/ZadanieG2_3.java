/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author rpezd
 */
public class ZadanieG2_3 {
     public static double zaokraglenie(double wartosc) {
        return Math.round(wartosc * 1000.0) / 1000.0;
    }
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        double przyprostokatna = input.nextDouble();
        double katα=input.nextDouble();
        double kat=90;
        katα = Math.toRadians(katα);
        double katβ, przyprostokatnaWynik, przeciwprostokatnaWynik;
        katβ = Math.toRadians(180-katα+90);
        kat = Math.toRadians(kat);
        przyprostokatnaWynik=Math.round(przyprostokatna/Math.tan(katα));
        przeciwprostokatnaWynik=sqrt(pow(przyprostokatna,2)+pow(przyprostokatnaWynik,2));
        System.out.println("Przeciwprostokątna wynik: " + zaokraglenie(przeciwprostokatnaWynik));
        System.out.println("Przyprostokątna wynik: " + zaokraglenie(przyprostokatnaWynik));
    }
}
