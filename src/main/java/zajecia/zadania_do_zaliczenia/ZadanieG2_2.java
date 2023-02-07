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
public class ZadanieG2_2 {
    public static void main(String[] args) {   
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int system = input.nextInt();
        String value = Integer.toString(number, system);
        System.out.println(number+"[10] = " +value+"["+system+"]");
    }
}
