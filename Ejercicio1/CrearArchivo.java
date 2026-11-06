import java.io.File;
import java.io.IOException;

public class CrearArchivo {

    public static void main(String[] args) {

        try {

            // Crear el objeto File
            File archivo = new File("estudiantes.txt");

            // Crear y comprobar el archivo
            if (archivo.createNewFile()) {

                System.out.println("Archivo creado correctamente.");

            } else {

                System.out.println("El archivo ya existe.");

            }

            // Mostrar el nombre del archivo
            System.out.println("Nombre del archivo: " + archivo.getName());

        } catch (IOException e) {

            // Controlar errores
            System.out.println("Ocurrió un error al crear el archivo.");

            System.out.println("Error: " + e.getMessage());

        }

    }

}