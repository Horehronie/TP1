package practica.ej7Ecuacion;

import javax.sound.midi.SysexMessage;

public class Ecuacion {
    private double coeficienteA = 0;
    private double coeficienteB = 0;
    private double terminoIndependiente = 0;


    public void setCoeficienteA(int coeficienteA){
        this.coeficienteA = coeficienteA;
    }
    public void setCoeficienteB(int coeficienteB){
        this.coeficienteB = coeficienteB;
    }
    public void setTerminoIndependiente(int terminoIndependiente){
        this.terminoIndependiente = terminoIndependiente;
    }
    public double getCoeficienteA(){
        return coeficienteA;
    }
    public double getCoeficienteB(){
        return coeficienteB;
    }
    public double getTerminoIndependiente(){
        return terminoIndependiente;
    }

    private double[] resolverDosRaices(){
        double[] raices = new double[]{0,0};

        raices[0] = (-coeficienteB - (Math.sqrt((Math.pow(coeficienteB,2))
                - 4 * coeficienteA * terminoIndependiente))) / (2*coeficienteA);

        raices[1] = (-coeficienteB + (Math.sqrt((Math.pow(coeficienteB,2))
                - 4 * coeficienteA * terminoIndependiente))) / (2*coeficienteA);

        return raices;
    }

    private double resolverUnaRaiz(){
        return (-coeficienteB) / (2*coeficienteA);
    }

    public String resultado(){
        String result = "";
        double determinante = ((Math.pow(coeficienteB,2))-4*coeficienteA*terminoIndependiente);
        if(determinante==0){
            result+="X1/X2=" + resolverUnaRaiz();
        }
        else if(determinante>0){
            result += "X1= "+ resolverDosRaices()[0]+ " X2= " + resolverDosRaices()[1];
        }
        else{
            result = "La ecuacion no tiene solucion.";
        }
        return result;
    }
}
