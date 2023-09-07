package practica.ej9Fechas;
import java.time.LocalDate;


public class Pruebas {
    public static void main(String[] args) {
        OperacionesFecha operacionesFecha = new OperacionesFecha();

        // Ejemplo 1: Obtener una fecha desde un string
        String fechaString1 = "05-09-2023";
        LocalDate fecha1 = operacionesFecha.obtenerFechaDesdeString(fechaString1, "dd-MM-yyyy");
        System.out.println("Fecha 1: " + fecha1);

        // Ejemplo 2: Determinar si una fecha está entre dos fechas
        LocalDate fechaInicio = LocalDate.of(2023, 9, 1);
        LocalDate fechaFin = LocalDate.of(2023, 9, 10);
        LocalDate fecha2 = LocalDate.of(2023, 9, 5);
        boolean estaEntre = operacionesFecha.fechaEstaEntre(fecha2, fechaInicio, fechaFin);
        System.out.println("Fecha 2 está entre fechaInicio y fechaFin: " + estaEntre);

        // Ejemplo 3: Determinar si una fecha es mayor que otra fecha
        LocalDate fecha3 = LocalDate.of(2023, 9, 15);
        boolean esMayor = operacionesFecha.fechaEsMayorQue(fecha3, fecha2);
        System.out.println("Fecha 3 es mayor que fecha2: " + esMayor);

        // Ejemplo 4: Determinar si una fecha es menor que otra fecha
        LocalDate fecha4 = LocalDate.of(2023, 9, 1);
        boolean esMenor = operacionesFecha.fechaEsMenorQue(fecha4, fechaInicio);
        System.out.println("Fecha 4 es menor que fechaInicio: " + esMenor);
    }
}
