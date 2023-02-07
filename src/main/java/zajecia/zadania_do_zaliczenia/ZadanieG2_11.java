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
public class ZadanieG2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj bok: ");
        float a = input.nextFloat();
        while (a < 0) {
            System.out.println("Bok nie może mieć warotści ujemnej \n");
            System.out.println("Podaj bok: ");
            a = input.nextFloat();
        }
        double pole = (a * a * Math.sqrt(3)) / 4;
        System.out.println("Pole trójkąta wynosi: " + pole);
        input.close();
}
}
