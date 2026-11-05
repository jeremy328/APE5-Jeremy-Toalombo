
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AgregarInformacion {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            // 1. Ingresar información
            System.out.print("Ingrese el nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Ingrese la carrera: ");
            String carrera = teclado.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = teclado.nextInt();

            // 2. Abrir el archivo existente
            FileWriter escritor = new FileWriter("estudiantes.txt", true);

            // 3. Agregar información al archivo
            escritor.write("Nombre: " + nombre + "\n");
            escritor.write("Carrera: " + carrera + "\n");
            escritor.write("Edad: " + edad + "\n");
            escritor.write("----------------------\n");

            // 4. Cerrar el archivo
            escritor.close();

            System.out.println("\nInformación guardada correctamente.");

        } catch (IOException e) {

            System.out.println("Error al escribir en el archivo.");
            System.out.println(e.getMessage());

        }

        teclado.close();
    }
}
