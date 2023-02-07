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
public class ZadanieG1_27 {
    static int liczby[][]=new int[10][10];
    public static void product(int n){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                liczby[i][j]=liczby[i][j]*n;
            }
        }
    }
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                liczby[i][j]=1;
            }
        }
        product(5);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.printf(liczby[i][j]+", ");
            }
            System.out.printf("\n");
        }
    }
}
