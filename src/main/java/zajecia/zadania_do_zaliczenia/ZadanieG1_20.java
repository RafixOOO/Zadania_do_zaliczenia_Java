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
class Complex {

    private double rze;
    private double uro;

    Complex(double rze, double uro) {
        this.rze = rze;
        this.uro = uro;
    }

    public String print() {
        String a;
        if (rze == 0) {
            a = uro + "i";
            return a;
        } else if (uro == 0) {
            a = rze + "";
            return a;
        } else {
            a = rze + " + " + uro + "i";
            return a;
        }
    }

    public String println() {
        String a;
        if (rze == 0) {
            a = uro + "i";
            return a;
        } else if (uro == 0) {
            a = rze + "";
            return a;
        } else {
            a = rze + " + " + uro + "i";
            return a;
        }
    }
}

public class ZadanieG1_20 {

    public static void print(String tekst) {
        System.out.printf(tekst);
    }

    public static void main(String[] args) {
        Complex zespolona = new Complex(2,3);
        Complex zespolona1 = new Complex(0,3);
        Complex zespolona2 = new Complex(2,0);
        print(zespolona.print()+"\n");
        print(zespolona1.print()+"\n");
        print(zespolona2.print()+"\n");
    }
}
