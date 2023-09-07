package practica.ej12AdministradorTareas;
import practica.ej5Y10ListaDeTareas.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AdministradorTareas {
    private List<Tarea> listaTareas;

    public AdministradorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public void crearTarea(String descripcion, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio) {
        Tarea nuevaTarea = new Tarea();
        nuevaTarea.crearTarea(descripcion, prioridad, fechaLimite, fechaRecordatorio);
        listaTareas.add(nuevaTarea);
    }

    public void marcarTareaComoRealizada(Tarea tarea) {
        tarea.marcarComoCompleta();
    }

    public List<Tarea> obtenerTareasNoVencidasOrdenadas() {
        LocalDate fechaActual = LocalDate.now();
        return listaTareas.stream()
                .filter(t -> !t.estaVencida())
                .sorted((t1, t2) -> {
                    if (t1.getPrioridad() != t2.getPrioridad()) {
                        return Integer.compare(t1.getPrioridad(), t2.getPrioridad());
                    } else {
                        return t1.getFechaLimite().compareTo(t2.getFechaLimite());
                    }
                })
                .collect(Collectors.toList());
    }

    public List<Tarea> buscarTareasPorTitulo(String titulo) {
        return listaTareas.stream()
                .filter(t -> t.getDescripcion().contains(titulo))
                .collect(Collectors.toList());
    }
}
