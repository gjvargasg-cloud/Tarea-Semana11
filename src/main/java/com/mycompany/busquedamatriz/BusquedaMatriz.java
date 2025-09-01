package com.mycompany.busquedamatriz;

public class BusquedaMatriz {
    
    public static void buscarValor(int[][] matriz, int valorBuscado) {
        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBuscado) {
                    System.out.println(" Valor " + valorBuscado + " encontrado en la posicion: [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println(" Valor " + valorBuscado + " no encontrado en la matriz.");
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {3, 5, 7},
            {2, 9, 1},
            {4, 8, 6}
        };

        int valorBuscado = 9;

        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        buscarValor(matriz, valorBuscado);
    }
}