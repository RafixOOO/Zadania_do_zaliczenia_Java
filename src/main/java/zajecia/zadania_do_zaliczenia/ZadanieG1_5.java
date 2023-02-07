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
public class ZadanieG1_5 {
    public static void main(String[] args) {
        boolean [] z = {true, false};
        System.out.println("p\t|\t!p\t|\tp&&!p\t|\t!(p && !p)");
        System.out.println("-------------------------------------------------------------");
        for(boolean p: z){
            System.out.println(p +"\t|\t"+ !p +"\t|\t"+ (p&&!p) +"\t|\t"+ !(p && !p));
        }
    }
}
