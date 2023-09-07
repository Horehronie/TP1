package practica.ej12AdministradorTareas;
import practica.ej5Y10ListaDeTareas.Tarea;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Prueba {
    public static void main(String[] args) {
        AdministradorTareas administrador = new AdministradorTareas();

        // Crear algunas tareas
        administrador.crearTarea("Tarea 1", 2, LocalDate.of(2023, 9, 15), LocalDate.of(2023, 9, 10));
        administrador.crearTarea("Tarea 2", 1, LocalDate.of(2023, 9, 10), LocalDate.of(2023, 9, 5));
        administrador.crearTarea("Tarea 3", 3, LocalDate.of(2023, 9, 20), LocalDate.of(2023, 9, 18));

        // Marcar una tarea como realizada
        Tarea tarea = administrador.buscarTareasPorTitulo("Tarea 1").get(0);
        administrador.marcarTareaComoRealizada(tarea);

        // Obtener y mostrar tareas no vencidas ordenadas
        List<Tarea> tareasNoVencidas = administrador.obtenerTareasNoVencidasOrdenadas();
        for (Tarea t : tareasNoVencidas) {
            System.out.println(t.mostrarTarea());
        }

        // Buscar tareas por título
        List<Tarea> tareasPorTitulo = administrador.buscarTareasPorTitulo("Tarea 2");
        for (Tarea t : tareasPorTitulo) {
            System.out.println(t.mostrarTarea());
        }
    }
}
