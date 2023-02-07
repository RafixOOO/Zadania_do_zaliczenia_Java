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
import java.util.Scanner;
class Fraction4{
    private int licznik;
    private int mianownik;
    
    Fraction4(int licznik, int mianownik){
        this.licznik=licznik;
        this.mianownik=mianownik;
    }
    
    Fraction4(){
        this.licznik=0;
        this.mianownik=0;
    }
    
    Fraction4(int licznik){
        this.licznik=licznik;
        this.mianownik=1;
    }
    
    public String toString(){
        String a =licznik+"/"+mianownik;
        return a;
    }
    
    public Fraction4 metoda(Fraction4 ob){
        Fraction4 obiekt = new Fraction4(this.licznik * ob.licznik, this.mianownik*ob.mianownik);
        return obiekt;
    }
    
    public int getnum(){
        return this.licznik;
    }
    public int getden(){
        return this.mianownik;
    }
}

public class ZadanieG2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int licznik = input.nextInt();
        int mianownik = input.nextInt();

        Fraction4 ulamek = new Fraction4(licznik, mianownik);       
        System.out.println(ulamek.toString());

        Fraction4 ulamek1 = new Fraction4(12, 12);
        Fraction4 ulameksuma = ulamek.metoda(ulamek1);
        System.out.println(ulameksuma.toString());
        
        System.out.println(ulamek.getden());
        System.out.println(ulamek.getnum());

    }    
}
