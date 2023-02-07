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
public class ZadanieG3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int initialx = x;
        int y = input.nextInt();
        int dziel = 0;
        while(x >= y){
            x = x-y;
            dziel++;
        }
        System.out.println( initialx+ " / "+ y +" = " + dziel+ " r " + x);
        input.close();
    }
}
