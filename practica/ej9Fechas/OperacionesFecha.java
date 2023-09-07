package practica.ej9Fechas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OperacionesFecha {
    private DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public LocalDate obtenerFechaDesdeString(String fechaString, String formato) {
        if (formato.equals("dd-MM-yyyy")) {
            return LocalDate.parse(fechaString, dateFormatter1);
        } else if (formato.equals("MM-dd-yyyy")) {
            return LocalDate.parse(fechaString, dateFormatter2);
        } else {
            throw new IllegalArgumentException("Formato de fecha no válido");
        }
    }

    public boolean fechaEstaEntre(LocalDate fecha, LocalDate fechaInicio, LocalDate fechaFin) {
        return (fecha.isEqual(fechaInicio) || fecha.isAfter(fechaInicio)) &&
                (fecha.isEqual(fechaFin) || fecha.isBefore(fechaFin));
    }

    public boolean fechaEsMayorQue(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isAfter(fecha2);
    }

    public boolean fechaEsMenorQue(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isBefore(fecha2);
    }
}