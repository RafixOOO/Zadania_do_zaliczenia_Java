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
public class ZadanieG2_4 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        String liczbaPierwsza = input.next();
        int liczbaPierwszaBinarna = Integer.parseInt(liczbaPierwsza, 2);
        String liczbaDruga = input.next();
        int liczbaDrugaBinarna = Integer.parseInt(liczbaDruga, 2); 
        String wynik = Integer.toBinaryString(liczbaPierwszaBinarna+liczbaDrugaBinarna);
        System.out.println("Wynik dodawania: " + wynik);
    }
}
