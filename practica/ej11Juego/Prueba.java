package practica.ej11Juego;
import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        Juego juego = new Juego();
        ArrayList<String> diccionario = new ArrayList<>();
        // Agregar palabras al diccionario

        diccionario.add("hola");
        // Asignar palabras a los jugadores
        juego.asignarPalabraAJugador1("hola", diccionario);
        juego.asignarPalabraAJugador2("chau", diccionario);

        // Determinar al ganador
        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
    }
}