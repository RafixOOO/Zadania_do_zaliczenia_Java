/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;

/**
 *
 * @author rpezd
 */

class FileReader{
    private int liczba;
    
    public void losowanie()throws FileNotFoundException, IOException{
        Random rand = new Random();
        PrintWriter saver = new PrintWriter(new FileOutputStream("D:\\Zadania\\Java\\baza\\sto.txt"));
        for (int i = 0; i < 100; i++){
            liczba = rand.nextInt(20);
            saver.printf(liczba+"\n");
        }
        saver.close();
    }
    public void wypisz()throws FileNotFoundException, IOException{
        BufferedReader file = new BufferedReader(new java.io.FileReader("D:\\Zadania\\Java\\baza\\sto.txt"));
        String li = file.readLine();
        String a = "";
        while(li != null){
        StringTokenizer lic = new StringTokenizer(li);
        a=lic.nextToken()+", "+a;
        li=file.readLine();
        }
        System.out.printf(a);
    }
}
public class ZadanieG1_23 {
    public static void main(String[] args)throws FileNotFoundException, IOException{
        FileReader lotto = new FileReader();
        lotto.losowanie();
        lotto.wypisz();
    }
}
