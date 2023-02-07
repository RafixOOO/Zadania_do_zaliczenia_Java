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
class Fraction{
    int licznik;
    int mianownik;
    
    Fraction(int licznik, int mianownik){
        this.licznik=licznik;
        this.mianownik=mianownik;
    }
    
    public String toString(){
        String a =licznik+"/"+mianownik;
        return a;
    }
}
public class ZadanieG1_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj licznik");
        int a =input.nextInt();
        System.out.println("Podaj Mianownik");
        int b =input.nextInt();
        Fraction ulamek=new Fraction(a,b);
        System.out.println(ulamek.toString());
    }
}
