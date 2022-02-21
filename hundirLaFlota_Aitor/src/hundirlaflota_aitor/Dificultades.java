/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hundirlaflota_aitor;

/**
 *
 * @author Aitor
 */
public class Dificultades {
    
    /**
     * Metodo para jugar una partida en dificultad facil.
     */
    
    public static void facil(){
        char[][] tablero = Tablero.crearTablero();
        char[][] usuario = Tablero.crearTablero();
        int cont = 1; /*hundidos = 0;
        boolean ganado = true;*/
        
        Barcos.insertarPortaAviones(tablero);
        
        Barcos.insertarAcorazado(tablero);
        
        for (int i = 0; i < 3; i++) {
            Barcos.insertarBuque(tablero);
        }
        
        for (int i = 0; i < 5; i++) {
            Barcos.insertarLancha(tablero);
        }
        
        
        while (cont <= 10) {
            System.out.println("Llevas " + cont + " de 50 intentos");
            System.out.println("---------------------");
            Tablero.mostrarTablero(usuario);
            switch (Tablero.comprobarDisparo(Tablero.comprobarString(Tablero.disparo(tablero, usuario)), tablero, usuario)) {
                case 0:
                    break;
                case -1:
                    System.out.println("\nYa has utilizado esta posicion");
                    cont--;
                    break;
            }
            cont++;
        }
        
        Tablero.mostrarTablero(tablero);
        Tablero.mostrarTablero(usuario);
    }
    
    /**
     * Metodo para jugar en la dificultado media.
     */
    
    public static void medio(){
        
    }
    
    /**
     * Metodo para jugar en la dificultad dificil.
     */
    
    public static void dificil(){
        
    }
    
}
