/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zajecia.zadania_do_zaliczenia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rpezd
 */
class Tint01 {

    private int liczby[][];
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj gdzie chcesz wstawić liczbę");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Podaj jej wartość");
        int c = 0;
        c = input.nextInt();
        liczby[a][b] = c;
    }

    void print() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj gdzie jest ulokowana liczba");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(liczby[a][b]);
    }

    void setRandom(int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int a = input.nextInt();
        Random rand = new Random();
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby.length; j++) {
                liczby[i][j] = rand.nextInt(a);
            }
        }
    }

}

public class ZadanieG2_26 {

    public static void main(String[] args) {
        Tint01 licz=new Tint01();
        licz.setRandom(20);
        licz.input();
        licz.print();
    }
}
