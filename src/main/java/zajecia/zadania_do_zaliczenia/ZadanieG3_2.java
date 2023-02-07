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
public class ZadanieG3_2 {
     public static void main(String args[]) {
        boolean[] bool = {false, true};
        System.out.println("p\t|\tq\t|\tr\t|\tq&r\t|\tp|A\t|\tp|q\t|\tp|r\t|\tC&D\t|\tB<=>E ");
        System.out.println("\t|\t\t|\t\t|\t(A)\t|\t(B)\t|\t(C)\t|\t(D)\t|\t(E)\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for(boolean p: bool) for(boolean q: bool) for(boolean r: bool) { 
            System.out.print(p+"\t|\t"+q+"\t|\t"+r);
            boolean a = q&r;
            boolean b = p|a;
            boolean c = p|q;
            boolean d = p|r;
            boolean e = c&d;
            System.out.print("\t|\t"+a+"\t|\t"+b+"\t|\t"+c+"\t|\t"+d+"\t|\t"+e+"\t|\t");
            System.out.println(b == e);
        }
        System.out.println();
    }
}
