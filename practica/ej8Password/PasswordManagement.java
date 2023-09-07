package practica.ej8Password;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PasswordManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de contraseñas a generar: ");
        int numPasswords = scanner.nextInt();

        List<Password> passwords = new ArrayList<>();
        System.out.println("a");

        for (int i = 0; i < numPasswords; i++) {
            Password password = new Password(8); // Longitud por defecto de 8
            passwords.add(password);
        }

        for (Password password : passwords) {
            String strength = password.isStrong() ? "Fuerte" : "Débil";
            System.out.println(password.getPassword() + " - " + strength);
        }
    }
}
