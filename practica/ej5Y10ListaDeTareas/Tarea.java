package practica.ej5Y10ListaDeTareas;
import java.time.LocalDate;



public class Tarea {
    private String descripcion;
    private int prioridad ;
    private boolean completa;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;

    public void crearTarea(String descripcion, int prioridad, LocalDate fechaLimite, LocalDate fechaRecordatorio) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completa = false;
        this.fechaLimite = fechaLimite;
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public void modificarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void marcarComoCompleta() {
        this.completa = true;
    }

    public boolean estaVencida() {
        LocalDate fechaActual = LocalDate.now();
        return !completa && fechaLimite.isBefore(fechaActual);
    }

    public boolean estaCompleta() {
        return completa;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public LocalDate getFechaLimite(){
        return fechaLimite;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String mostrarTarea() {
        if (estaCompleta() || (!estaCompleta() && (fechaLimite.isBefore(LocalDate.now())))) {
            return "(Vencida) " + descripcion;
        } else if(!estaCompleta() && (fechaRecordatorio.equals(LocalDate.now()) ||
                fechaRecordatorio.isBefore(LocalDate.now()))) {
            return "(Por vencer) " + descripcion;
            }
            else {
            return descripcion;
        }
    }
}


