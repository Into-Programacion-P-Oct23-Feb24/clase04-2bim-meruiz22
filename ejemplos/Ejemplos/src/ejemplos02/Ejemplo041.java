/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int[][] arreglo = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo1 = {{1, 2, 3}, {2, 2, 2}, {3, 2, 1}};
        int[][] arreglo2 = new int[3][3];

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo2[i][j] = obtenerMultiplicacion(arreglo[i][j],
                        arreglo1[i][j]);
            }
        }

        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("%d ", arreglo[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("%d ", arreglo1[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                System.out.printf("%d ", arreglo2[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int multiplicacion;
        multiplicacion = a * b;
        return multiplicacion;

    }

}
