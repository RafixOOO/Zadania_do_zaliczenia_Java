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
public class ZadanieG3_1 {
     static boolean impl(boolean p, boolean q) {
        return (Boolean.valueOf(p).compareTo(q) < 1);
    }
    public static void main(String args[]) {
        boolean[] bool = {false, true};
        System.out.println("p\t|\tq\t|\tr\t|\tp=>q\t|\tq=>r\t|\tA & B\t|\tp=>r\t|\tC=>D");
        System.out.println("\t|\t|\t|\t(A)\t|\t(B)\t|\t(C)\t|\t(D)\t|\t\t|\t");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for(boolean p: bool) for(boolean q: bool) for(boolean r: bool) { 
            System.out.print(p+"\t|\t"+q+"\t|\t"+r);
            System.out.print("\t|\t"+impl(p, q)+"\t|\t"+impl(q,r));
            System.out.print("\t|\t"+(impl(p, q)&impl(q, r)));
            System.out.print("\t|\t"+impl(p,r)+"\t|\t");
            System.out.println(impl(impl(p, q)&impl(q, r), impl(p,r)));
        }
        System.out.println();
    }
}
