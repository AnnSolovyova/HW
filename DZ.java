/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz;

/**
 *
 * @author леново
 */
public class DZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Sum(2, 5));
        System.out.println(Sub(2, 5));
        System.out.println(Mult(2, 5));
        System.out.println(Div(2, 5));

    }

    public static float Sum(float a, float b) {
        return (a + b);
    }

    public static float Sub(float a, float b) {
        return (a - b);
    }

    public static float Mult(float a, float b) {
        return (a * b);
    }

    public static float Div(float a, float b) {
        return (a / b);
    }
}
