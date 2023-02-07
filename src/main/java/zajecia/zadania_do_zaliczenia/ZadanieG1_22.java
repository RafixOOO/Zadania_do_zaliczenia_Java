/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author rpezd
 */
public class ZadanieG1_22 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int i = 0;
        PrintWriter saver = new PrintWriter(new FileOutputStream("D:\\Zadania\\Java\\baza\\pierwiastki.txt"));
        for(i=2;i<=15;i++){
            saver.printf( i + " | %.8f | %.8f\n",Math.sqrt(i), Math.cbrt(i));
        }
        saver.close();
    }
}
