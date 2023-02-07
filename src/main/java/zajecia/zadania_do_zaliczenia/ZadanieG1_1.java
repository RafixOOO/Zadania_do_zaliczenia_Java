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
public class ZadanieG1_1 {
    public static void main(String[] args){
        String[] znaki = new String[13];
        znaki[0]="p";
        znaki[1]="r";
        znaki[2]="o";
        znaki[3]="g";
        znaki[4]="r";
        znaki[5]="a";
        znaki[6]="m";
        znaki[7]="o";
        znaki[8]="w";
        znaki[9]="a";
        znaki[10]="n";
        znaki[11]="i";
        znaki[12]="e";
        String[] znakiOdwrócone = new String[znaki.length];
        int w = 12;
        for(int i = 0; i < znaki.length; i++){
            znakiOdwrócone[i]=znaki[w-i];
        }
        for(int i = 0; i < znaki.length; i++){
            System.out.println("Numer indeksu to: " + i + ", i wartość indeksu to: " + znaki[i]);
        }
        for(int i = 0; i < znakiOdwrócone.length; i++){
            System.out.println("Numer indeksu to: " + i + ", i wartość indeksu to: " + znakiOdwrócone[i]);
        }
    }
}
