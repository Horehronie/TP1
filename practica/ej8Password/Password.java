package practica.ej8Password;
import java.util.Random;

public class Password {
    private String password;
    private int longitud;

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public String getPassword() {
        return password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    private void generarPassword() {
        Random random = new Random();
        StringBuilder nuevaPassword = new StringBuilder();

        int Mayusculas = 0;
        int Minusculas = 0;
        int cantidadDeDigitos = 0;

        while (nuevaPassword.length() < longitud) {
            int type = random.nextInt(3); // 0: Uppercase, 1: Lowercase, 2: Digit

            if (type == 0) {
                nuevaPassword.append((char) (random.nextInt(26) + 'A'));
                Mayusculas++;
            } else if (type == 1) {
                nuevaPassword.append((char) (random.nextInt(26) + 'a'));
                Minusculas++;
            } else if (type == 2) {
                nuevaPassword.append(random.nextInt(10));
                cantidadDeDigitos++;
            }
        }

        password = nuevaPassword.toString();
    }

    public boolean isStrong() {
        int Mayusculas = 0;
        int Minusculas = 0;
        int cantidadDeDigitos = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                Mayusculas++;
            } else if (Character.isLowerCase(c)) {
                Minusculas++;
            } else if (Character.isDigit(c)) {
                cantidadDeDigitos++;
            }
        }

        return Mayusculas > 2 && Minusculas > 1 && cantidadDeDigitos > 1;
    }
}