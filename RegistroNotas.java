import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            BufferedWriter archivo =
                new BufferedWriter(new FileWriter("estudiantes.txt"));

            for (int i = 1; i <= 3; i++) {

                System.out.println("ESTUDIANTE " + i);

                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Ingrese la calificacion: ");
                double nota = Double.parseDouble(scanner.nextLine());

                archivo.write("Nombre: " + nombre);
                archivo.newLine();

                archivo.write("Calificacion: " + nota);
                archivo.newLine();
                archivo.newLine();
            }

            archivo.close();

            System.out.println("Registros guardados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar una calificacion numerica.");
        }

        scanner.close();
    }
}
