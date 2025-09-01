package com.mycompany.ordenacionmatriz;

public class OrdenacionMatriz {

    public static void ordenarFila(int[][] matriz, int fila) {
        int n = matriz[fila].length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (matriz[fila][j] > matriz[fila][j + 1]) {
                    int temp = matriz[fila][j];
                    matriz[fila][j] = matriz[fila][j + 1];
                    matriz[fila][j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {7, 3, 5},
            {9, 2, 8},
            {4, 6, 1}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int filaAOrdenar = 1;
        ordenarFila(matriz, filaAOrdenar);

        System.out.println("\nMatriz con la fila " + filaAOrdenar + " ordenada:");
        imprimirMatriz(matriz);
    }
}