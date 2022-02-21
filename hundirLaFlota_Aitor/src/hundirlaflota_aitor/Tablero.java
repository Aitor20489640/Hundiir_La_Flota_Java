/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundirlaflota_aitor;

import java.util.Scanner;

/**
 *
 * @author Aitor
 */
public class Tablero {
    
    /**
     * Metodo para crear un tablero.
     * @return Devuelve la matriz de char donde esta el tablero
     */

    public static char[][] crearTablero() {
        char tablero[][] = new char[10][10];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
        return tablero;
    }
    
    /**
     * Metodo para mostrar el tablero
     * @param tablero Matriz de caracteres donde estaran los barcos posicionados.
     */
    
    public static void mostrarTablero(char[][] tablero) {
        char eje = '@';
        System.out.print("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < tablero.length; i++) {
            eje += 1;
            System.out.print("\n" + eje);
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" " + tablero[i][j]);
            }
        }
        System.out.println("");
    }
    
    /**
     * Metodo para efectuar un disparo.
     * @param tablero Matriz de caracteres donde estaran los barcos posicionados.
     * @param usuario Matriz de caracteres que se mostrara al usuario.
     * @return Devuelve un string donde estara contenido el disparo.
     */

    public static String disparo(char[][] tablero, char[][] usuario) {
        Scanner sc = new Scanner(System.in);
        String disparo;
        
        System.out.println("Introduzca la posicion donde va a disparar en este formato (N-N)");
        System.out.println("La posicion va desde 0 hasta 9");
        System.out.println("La posicion A es 0");
        disparo = sc.next();
        
        return disparo;
    }
    
    /**
     * Metodo para comprobar si en el string esta el disparo en el formato correcto.
     * @param disparo String que contendra el disparo.
     * @return Devuelve un vector de enteros donde estaran las posiciones del tablero donde se desea disaparar.
     */

    public static int[] comprobarString(String disparo) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        int index[] = new int[2];
        String res;
        do {
            if (disparo.matches("\\d-\\d")) {
                exit = false;
            } else {
                System.err.println("Formato equivocado, vuelva a intentarlo");
                disparo = sc.next();
                exit = true;
            }
        } while (exit);

        res = disparo.substring(0, 1);
        index[0] = Integer.valueOf(res);
        res = disparo.substring(2);
        index[1] = Integer.valueOf(res);

        return index;
    }
    
    /**
     * Metodo para introducir en el tablero del usuario los tocados y aguas, asi como comprobar que no se ha disparado a una posicion ya disparada.
     * @param index Vector de enteros donde estara la posicion del disparo.
     * @param tablero Matriz de caracteres donde estaran los barcos posicionados.
     * @param usuario Matriz de caracteres que se mostrara al usuario.
     * @return Devuelve un entero para la comprobacion de si se ha disparado a una posicion ya disparada.
     */

    public static int comprobarDisparo(int[] index, char[][] tablero, char[][] usuario) {
        if ((tablero[index[0]][index[1]] == 'L') && (usuario[index[0]][index[1]] == '-')) {
            System.out.println("\nTocado\n");
            usuario[index[0]][index[1]] = 'X';
        } else if ((tablero[index[0]][index[1]] == 'B' && usuario[index[0]][index[1]] == '-')) {
            System.out.println("\nTocado\n");
            usuario[index[0]][index[1]] = 'X';
        } else if ((tablero[index[0]][index[1]] == 'Z' && usuario[index[0]][index[1]] == '-')) {
            System.out.println("\nTocado\n");
            usuario[index[0]][index[1]] = 'X';
        } else if ((tablero[index[0]][index[1]] == 'P' && usuario[index[0]][index[1]] == '-')) {
            System.out.println("\nTocado\n");
            usuario[index[0]][index[1]] = 'X';
        } else if (tablero[index[0]][index[1]] == '-' && usuario[index[0]][index[1]] == '-') {
            System.out.println("\nAgua\n");
            usuario[index[0]][index[1]] = 'A';
        } else if (usuario[index[0]][index[1]] == 'X' || usuario[index[0]][index[1]] == 'A') {
            return -1;
        }
        return 0;
    }
}
