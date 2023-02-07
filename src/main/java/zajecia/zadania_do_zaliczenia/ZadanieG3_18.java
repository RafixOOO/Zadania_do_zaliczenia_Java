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
class Fraction5 {
    private int licznik = 0 , mianownik = 0;
    Fraction5(){
        this.licznik = 0;
        this.mianownik = 1;
    }
    Fraction5(int licznik){
        this.licznik = licznik;
        this.mianownik = 1;
    }
    Fraction5(int licznik, int mianownik){
        if (mianownik != 0){
           this.licznik = licznik;
           this.mianownik = mianownik;
        }else{
            System.out.print("Podano zerowy mianownik!");
            System.exit(1);
        }
    }
    public String toString(){
        if (mianownik == 0) return 0 + " ";
        return licznik + "/" + mianownik;
    }
    
    public double ulamek(){
        double wynik = licznik*100/mianownik*100;
        return wynik/10000;
    }
    public float ulamek1(){
        float wynik = licznik*100/mianownik*100;
        return wynik/10000;
    }
}
public class ZadanieG3_18 {
    public static void main(String[] args) {
        Fraction5 f1 = new Fraction5(3, 6);
        Fraction5 f2 = new Fraction5(2, 5);

        System.out.println(f1.toString());
        System.out.println(f1.ulamek1());
        System.out.println(f2.toString());
        System.out.println(f2.ulamek());
    }
}
