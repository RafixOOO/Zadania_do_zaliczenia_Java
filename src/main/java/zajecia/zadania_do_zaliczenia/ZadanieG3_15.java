/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rpezd
 */
public class ZadanieG3_15 {
    public static int[] lotto(){
        Random rand = new Random();
        int[] liczby = new int[6];
        int x = 0;
        List<String> list = Arrays.asList(liczby.toString());
        
        for (int i = 0; i < liczby.length; i++) {
            list = Arrays.asList(liczby.toString());
            x = rand.nextInt(49);
            if(list.contains(Integer.toString(x))){
                i--;
            }else{
                liczby[i] = x;
            }
 
        }
        return liczby;
    }
    public static void main(String[] args) {
        int[] tab = lotto();
        for (int i = 0; i < 6; i++) {
            System.out.print(tab[i] + " ");
    }
}
}
