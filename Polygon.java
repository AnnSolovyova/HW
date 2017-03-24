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
public class Polygon extends Geometric {

    double a;
    int n;

    public Polygon(double a, int n) {
        if (n < 3 || a <= 0) {
            System.out.println("Error. Wrong parametres!");
            System.exit(0);
        }
        this.a = a;
        this.n = n;
    }

    public double PolRadius() {
        return a / (2 * Math.sin(Math.PI / n));
    }

    public double Sum() {
        return a * n;
    }
}
