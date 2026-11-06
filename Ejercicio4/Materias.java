import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Materias {

    public static void main(String[] args) {

        try {
            BufferedWriter archivo =
                    new BufferedWriter(new FileWriter("materias.txt"));

            archivo.write("Programación");
            archivo.newLine();

            archivo.write("Matemáticas");
            archivo.newLine();

            archivo.write("Física");
            archivo.newLine();

            archivo.write("Inglés");
            archivo.newLine();

            archivo.write("Base de Datos");

            archivo.close();

            System.out.println("Materias guardadas correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }
    }
}
