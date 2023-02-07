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
class Fraction3{
    private int licznik;
    private int mianownik;
    
    Fraction3(int licznik, int mianownik){
        this.licznik=licznik;
        this.mianownik=mianownik;
    }
    
    Fraction3(){
        this.licznik=0;
        this.mianownik=0;
    }
    
    Fraction3(int licznik){
        this.licznik=licznik;
        this.mianownik=1;
    }
    
    public String toString(){
        String a =licznik+"/"+mianownik;
        return a;
    }
    
    public Fraction3 metoda(Fraction3 ob){
        Fraction3 obiekt = new Fraction3(this.licznik * ob.licznik, this.mianownik*ob.mianownik);
        return obiekt;
    }
}

public class ZadanieG2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int licznik = input.nextInt();
        int mianownik = input.nextInt();

        Fraction3 ulamek = new Fraction3(licznik, mianownik);       
        System.out.println(ulamek.toString());

        Fraction3 ulamek1 = new Fraction3(12, 12);
        Fraction3 ulameksuma = ulamek.metoda(ulamek1);
        System.out.println(ulameksuma.toString());

    }    
}
