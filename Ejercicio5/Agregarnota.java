import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Agregarnota {

    public static void main(String[] args) {

        try {
            BufferedWriter archivo =
                    new BufferedWriter(new FileWriter("notas.txt", true));

            archivo.newLine();
            archivo.write("Estudiante: María - Nota: 9.5");

            archivo.close();

            System.out.println("Información agregada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al agregar información.");
        }
    }
}