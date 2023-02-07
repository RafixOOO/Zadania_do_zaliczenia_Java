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
class Angle {
    private double x, y, z;

    Angle(double x) {
        this.x = x;
    }
    
    Angle(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    Angle(double x, double y, double z) {
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
public class ZadanieG3_19 {
    public static void main(String[] args) {
    Angle angle1 = new Angle(60);
        System.out.println(angle1.sin());
        System.out.println(angle1.cos());
        System.out.println(angle1.tan());
        System.out.println(angle1.ctan());
        
        double x = 100, y = 50, z = 40;
        if(0 < x && x < 360 && 0 < y && y < 60 && 0 < z && z < 60) {
            Angle angle2 = new Angle(x, y, z);
        }
    }
}
