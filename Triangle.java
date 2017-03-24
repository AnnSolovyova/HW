/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_5;

/**
 *
 * @author леново
 */
public class Triangle extends Geometric {
     double a, b;
     
     public Triangle(double a, double b) {
         if (a <= 0 || b <= 0) {
            System.out.println("Error. Wrong parametres!");
            System.exit(0);
        }
         this.a = a;
         this.b = b;
     }
     
     public double Hypotenuse() {
         return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
     }
     
     public double Heihgt() {
         double d, e;
         double c = Hypotenuse();
         e = c / (Math.pow(a, 2) / Math.pow(b, 2) + 1);
         d = c - e;
         return Math.sqrt(d * e);
     }
}
