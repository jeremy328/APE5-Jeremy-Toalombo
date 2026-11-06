import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IngresarNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            BufferedWriter archivo =
                    new BufferedWriter(
                            new FileWriter("registroMaterias.txt"));

            for (int i = 1; i <= 5; i++) {

                System.out.print("Ingrese la materia " + i + ": ");
                String materia = scanner.nextLine();

                archivo.write(materia);
                archivo.newLine();
            }

            archivo.close();

            System.out.println("Materias guardadas correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }

        scanner.close();
    }
}