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
public class ZadanieG2_6 {

    static void max(float a, float b, float c) {
        int i = 0;
        float[] li = new float[3];
        li[0]=a;
        li[1]=b;
        li[2]=c;
        float max = 0;
        for(i=0;i<li.length;i++){
            if(max<li[i]){
                max=li[i];
            }
        }
        System.out.println("Największa wartość: " + max);
    }

    static void min(float a, float b, float c) {
        int i = 0;
        float[] li = new float[3];
        li[0]=a;
        li[1]=b;
        li[2]=c;
        float min = 0;
        for(i=0;i<li.length;i++){
            if(min>li[i]){
                min=li[i];
            }
        }
        System.out.println("Najmniejsza wartość: " + min);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj trzy liczby");
        float a=input.nextFloat();
        float b=input.nextFloat();
        float c=input.nextFloat();
        min(a,b,c);
        max(a,b,c);
    }
}
