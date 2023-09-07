package practica.ej11Juego;
import java.util.ArrayList;

class Palabra {
    private String palabra;
    private int puntaje;

    public Palabra(String palabra) {
        this.palabra = palabra;
        calcularPuntaje();
    }

    private void calcularPuntaje() {
        // Calcular el puntaje según las reglas dadas
        puntaje = palabra.length();
        for (char letra : palabra.toCharArray()) {
            if ("kzxwqy".contains(String.valueOf(letra))) {
                puntaje++;
            }
        }
    }

    public String obtenerPalabra() {
        return palabra;
    }

    public int obtenerPuntaje() {
        return puntaje;
    }
}

class Jugador {
    private String nombre;
    private ArrayList<Palabra> palabras = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPalabra(String palabra, ArrayList<String> diccionario) {
        if (diccionario.contains(palabra)) {
            palabras.add(new Palabra(palabra));
        } else {
            System.out.println("La palabra no está en el diccionario: " + palabra);
        }
    }

    public int calcularPuntajeTotal() {
        int puntajeTotal = 0;
        for (Palabra palabra : palabras) {
            puntajeTotal += palabra.obtenerPuntaje();
        }
        return puntajeTotal;
    }

    public String obtenerNombre() {
        return nombre;
    }
}

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego() {
        jugador1 = new Jugador("Jugador 1");
        jugador2 = new Jugador("Jugador 2");
    }

    public void asignarPalabraAJugador1(String palabra, ArrayList<String> diccionario) {
        jugador1.agregarPalabra(palabra, diccionario);
    }

    public void asignarPalabraAJugador2(String palabra, ArrayList<String> diccionario) {
        jugador2.agregarPalabra(palabra, diccionario);
    }

    public String determinarGanador() {
        int puntajeJugador1 = jugador1.calcularPuntajeTotal();
        int puntajeJugador2 = jugador2.calcularPuntajeTotal();

        if (puntajeJugador1 > puntajeJugador2) {
            return jugador1.obtenerNombre();
        } else if (puntajeJugador2 > puntajeJugador1) {
            return jugador2.obtenerNombre();
        } else {
            return "Empate";
        }
    }
}