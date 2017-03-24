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
public class HW_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8, 3);
        Rectangle r2 = new Rectangle(6, 4);

        r2.SquareEquality(r1.RecSquare(), r2.RecSquare());

        Circle circle1 = new Circle(0, 0, 12);
        Circle circle2 = new Circle(3, 5, 11);

        circle2.SquareEquality(circle1.CircleSquare(), circle2.CircleSquare());

        Polygon pol1 = new Polygon(7, 6);
        
        System.out.println("Radius is: " + pol1.PolRadius());

        System.out.println("Perimeter is: " + pol1.Sum());
        System.out.println();

        Triangle triangle = new Triangle(3, 4);

        System.out.println(triangle.Heihgt());
        
    }

}
