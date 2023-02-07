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
public class ZadanieG1_3 {
    public static void main(String[] args){
        String nazwa = "programowanie";
        System.out.println(nazwa);
        String napisOdwrócony = "";
        int długość = nazwa.length()-1;
        for(int i = 0; i < nazwa.length();i++){
            napisOdwrócony = napisOdwrócony + nazwa.charAt(długość-i);
        }
        System.out.println(napisOdwrócony);
    }
}
