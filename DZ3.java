/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz3;

import java.util.Scanner;

/**
 *
 * @author леново
 */
public class DZ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //task1 FACTORIAL
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n -> ");
        int n = in.nextInt();
        System.out.println("factorial -> " + factorial(n));

        //Tast2 DEGREE
        System.out.print("Enter x -> ");
        int x = in.nextInt();
        System.out.print("Enter n -> ");
        int degree = in.nextInt();
        System.out.println("degree -> " + degree(x, degree));

        //Task3 BUNNY EARS
        System.out.print("Enter number of bunnies -> ");
        int bannies = in.nextInt();
        System.out.println("Ears -> " + bunnyEars(bannies));

        //Task4 SUMM DIGiTS
        System.out.print("Enter number -> ");
        int number = in.nextInt();
        System.out.println("Summ -> " + sumDigits(number));
        
    }

    public static double factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static double degree(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return n > 0 ? x * degree(x, n - 1) : 1 / (x * degree(x, n - 1));
    }

    public static int bunnyEars(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 == 0 ? 3 + bunnyEars(n - 1) : 2 + bunnyEars(n - 1);
    }

    public static int sumDigits(int n) {
        return n % 10 == n ? n : n % 10 + sumDigits(n / 10);
    }
}
