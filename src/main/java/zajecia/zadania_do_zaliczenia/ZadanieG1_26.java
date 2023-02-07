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
public class ZadanieG1_26 {
    public static void main(String[] args) {
        double liczby[][] = new double[10][3];
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<10;j++){
                if(i==0){
                    liczby[j][i]=j+1;
                }
                else if(i==1){
                    liczby[j][i]=Math.sqrt(j+1);
                }
                else if(i==2){
                    liczby[j][i]=Math.cbrt(j+1);
                }
            }
        }
        int j=0;
        for(int i=0;i<10;i++){
               System.out.printf("%.0f | %.8f | %.8f\n",liczby[i][j],liczby[i][j+1],liczby[i][j+2]); 
            
        }
    }
}
