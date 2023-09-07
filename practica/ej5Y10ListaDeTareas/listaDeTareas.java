package practica.ej5Y10ListaDeTareas;

import java.time.LocalDate;

public class listaDeTareas {
    public static void main(String[] args) {
        // Crear las tareas
        LocalDate fechaManana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();
        tarea1.crearTarea("Ir al supermercado mañana", 1, fechaManana, LocalDate.now());

        tarea2.crearTarea("Consultar repuesto del auto", 1, fechaAyer, fechaAyer);

        tarea3.crearTarea("Ir al cine a ver la nueva película de Marvel", 1, fechaAyer, fechaAyer);

        tarea2.marcarComoCompleta();

        System.out.println("Tarea 1: " + tarea1.mostrarTarea() + ", Completa: " + tarea1.estaCompleta());
        System.out.println("Tarea 2: " + tarea2.mostrarTarea() +  ", Completa: " + tarea2.estaCompleta());
        System.out.println("Tarea 3: " + tarea3.mostrarTarea() + ", Completa: " + tarea3.estaCompleta());
    }
}
