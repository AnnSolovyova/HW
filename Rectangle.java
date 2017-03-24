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
public class Rectangle extends Geometric {

    
    public double wigth, heigth;

    public Rectangle(double wigth, double height) {
        if (wigth <=0 || height <= 0) {
            System.out.println("Error. Wrong parametres!");
            System.exit(0);
        }
        this.wigth = wigth;
        this.heigth = heigth;
    }

    public double RecSquare() {
        return wigth * heigth;
    }
}
