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
public class ZadanieG1_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podał długość boku");
        boolean i = false;
        double a=0;
        while (i == false) {
            a = input.nextDouble();
            if (a <= 0) {
                System.out.println("Liczba jest ujemna lub równa zero proszę podać liczbę dodatnią");
            } else {
                i = true;
            }
        }
        System.out.println("Obwód kwadratu jest równy: " + 4*a);
        System.out.println("Pole kwadratu jest równe: "+a*a);
    }
}
