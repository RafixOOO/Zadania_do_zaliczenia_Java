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
public class ZadanieG1_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean i=false;
        double a=0;
        while(i==false){
            System.out.println("Podaj liczbę dodatnią");
            a=input.nextDouble();
            if(a<=0){
                System.out.println("Liczba musi być dodatnia");
            }
            else{
                i=true;
            }
        }
    }
}
