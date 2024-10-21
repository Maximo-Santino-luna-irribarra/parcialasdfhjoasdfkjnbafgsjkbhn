/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaparcial1;

public class Main {
    public static void main(String[] args) {
        // Polimorfismo: Usamos el tipo Juego para referenciar diferentes tipos de juegos
        juego juego1 = new ajedrez();
        juego juego2 = new Futbol();

        // Iniciamos los juegos usando polimorfismo
        juego1.iniciar();  // Llama al método iniciar() de la clase Ajedrez
        juego2.iniciar();  // Llama al método iniciar() de la clase Futbol
    }
}
