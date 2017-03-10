/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz2;

import java.util.Scanner;

/**
 *
 * @author леново
 */
public class DZ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter n -> ");
        int n = in.nextInt();
        int[][] array = new int[n][n];
        Matrix(n, array);
        System.out.println();
        ElOfMatrixUnderMainDiag(n, array);
        System.out.println();
        ElOfMatrixHiggerMainDiag(n, array);
        System.out.println();
        ElOfMatrixHiggerSecDiag(n, array);
        System.out.println();
        ElOfMatrixUnderSecDiag(n, array);
        System.out.println();
    }

    public static void Matrix(int n, int arr[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * n);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void ElOfMatrixUnderMainDiag(int n, int arr[][]) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ElOfMatrixHiggerMainDiag(int n, int arr[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ElOfMatrixHiggerSecDiag(int n, int arr[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ElOfMatrixUnderSecDiag(int n, int arr[][]) {
        for (int i = 1; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
