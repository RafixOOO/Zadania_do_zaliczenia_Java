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
public class ZadanieG1_2 {
    public static void main(String[] args){
        String przywitanie = "Dzień Dobry";
        System.out.println(przywitanie.toUpperCase());
        System.out.println(przywitanie.toLowerCase());
        for(int i = 0; i <przywitanie.length();i++){
            System.out.println(przywitanie.substring(i, i+1));
        }
        for(int i = 0; i <przywitanie.length();i++){
            System.out.print(przywitanie.substring(i, i+1) + " ");
        }
    }
}
