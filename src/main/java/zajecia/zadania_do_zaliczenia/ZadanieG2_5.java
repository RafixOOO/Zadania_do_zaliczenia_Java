/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer; 

/**
 *
 * @author rpezd
 */
public class ZadanieG2_5 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String[] naz = new String[10];
        int[] sta = new int[10];
        int[] godz = new int[10];
        int[] wyp = new int[10];
        int i = 0;
        BufferedReader file = new BufferedReader(new FileReader("D:\\Zadania\\Java\\baza\\pracownicy.txt"));
        String li = file.readLine();
        while(li != null){
            StringTokenizer osoba = new StringTokenizer(li, " | ");
            String nazwa = osoba.nextToken() + " " + osoba.nextToken();
             naz[i] = nazwa;
             godz[i] = Integer.parseInt(osoba.nextToken());
             sta[i] = Integer.parseInt(osoba.nextToken());
             wyp[i] = sta[i]*godz[i];
             System.out.println(naz[i]+" "+ wyp[i]);
             i++;
             li=file.readLine();
        }
        

    }
}
