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
class Fraction1{
    private int licznik;
    private int mianownik;
    
    Fraction1(int licznik, int mianownik){
        this.licznik=licznik;
        this.mianownik=mianownik;
    }
    
    Fraction1(){
        this.licznik=0;
        this.mianownik=0;
    }
    
    Fraction1(int licznik){
        this.licznik=licznik;
        this.mianownik=1;
    }
    
    public String toString(){
        String a =licznik+"/"+mianownik;
        return a;
    }
}
public class ZadanieG1_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj licznik");
        int a = input.nextInt();
        System.out.println("Podaj Mianownik");
        int b = input.nextInt();
        Fraction1 ulamek = new Fraction1(1);
        System.out.println(ulamek.toString());
    }
}
