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
public class ZadanieG2_1 {       
    public static void main(String[] args) {     
        boolean [] z = {true, false};
        System.out.println("p\t|\t q\t|\t p&&q\t|\t !p\t|\t !q\t|\t (!p||!q)\t|\t !(p && q) <=>(!p || !q)");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for (boolean p : z) {
            for (boolean q : z) {
                System.out.println(p + "\t|\t" + q + "\t|\t" + (p && q) + "\t|\t" + !p + "\t|\t" + !q + "\t|\t" + (!p || !q) + "\t\t|\t" + (!(p && q) == (!p || !q)));
            }
        }
    }
}

