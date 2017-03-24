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
public class Circle extends Geometric {

    double center_x, center_y, radius;

    public Circle(double center_x, double center_y, double radius) {
        if (radius <= 0) {
            System.out.println("Error. Wrong parametres!");
            System.exit(0);
        }
        this.center_x = center_x;
        this.center_y = center_y;
        this.radius = radius;
    }

    public double CircleSquare() {
        return Math.PI * radius * radius;
    }
}
