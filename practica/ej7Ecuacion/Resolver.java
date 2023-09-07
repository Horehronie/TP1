package practica.ej7Ecuacion;

public class Resolver {
    public static void main(String[] args) {
        Ecuacion ecuacion = new Ecuacion();
        Ecuacion ecuacion2 = new Ecuacion();
        Ecuacion ecuacion3 = new Ecuacion();
        ecuacion.setCoeficienteA(1);
        ecuacion.setCoeficienteB(-4);
        System.out.println(ecuacion.resultado());

        ecuacion2.setCoeficienteA(1);
        ecuacion2.setCoeficienteB(-12);
        ecuacion2.setTerminoIndependiente(36);
        System.out.println(ecuacion2.resultado());

        ecuacion3.setCoeficienteA(1);
        ecuacion3.setTerminoIndependiente(1);
        System.out.println(ecuacion3.resultado());
    }
}
