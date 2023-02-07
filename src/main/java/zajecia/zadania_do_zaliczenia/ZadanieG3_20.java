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
class Angle1 {
    private double x, y, z;
    
    public static final Angle1 RIGHT_ANGLE = new Angle1(Math.PI/2);
    public static final Angle1 STRAIGHT_ANGLE = new Angle1(Math.PI);
    public static final Angle1 FULL_ANGLE = new Angle1(Math.PI*2);
    public static final Angle1 RADIAN = new Angle1(1);
    public static final Angle1 DEGREE = new Angle1(1);
    public static final Angle1 ARCMINUTE = new Angle1(0, 1);
    public static final Angle1 ARCSECOND = new Angle1(0, 0, 1);

    Angle1(double x) {
        this.x = x;
    }
    
    Angle1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    Angle1(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double cos() {
        return Math.cos(x);
    }
    public double sin() {
        return Math.sin(x);
    }
    public double tan() {
        return Math.tan(x);
    }
    public double ctan() {
        return cos()/sin();
    }
    
    public double radian() {
        return x;
    }
    public double degree() {
        return 180 * (x/Math.PI);
    }
}
public class ZadanieG3_20 {
    public static void main(String[] args) {
        System.out.println("Kąt prosty: " + Angle1.RIGHT_ANGLE.degree());
        System.out.println("Kąt półpełny: " + Angle1.STRAIGHT_ANGLE.degree());
        System.out.println("Kąt pełny: " + Angle1.FULL_ANGLE.degree());
        System.out.println("1 radian: " + Angle1.RADIAN.radian());
        System.out.println("1 stopień: " + Angle1.DEGREE.degree());
        System.out.println("1 minuta: " + Angle1.ARCMINUTE.degree());
        System.out.println("1 sekunda: " + Angle1.ARCSECOND.degree());
    }
}
