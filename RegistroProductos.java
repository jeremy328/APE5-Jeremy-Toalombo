import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroProductos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            BufferedWriter archivo =
                new BufferedWriter(
                    new FileWriter("productos.txt", true));

            for (int i = 1; i <= 3; i++) {

                System.out.println("PRODUCTO " + i);

                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.print("Precio: ");
                double precio = Double.parseDouble(scanner.nextLine());

                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(scanner.nextLine());

                double total = precio * cantidad;

                archivo.write("Producto: " + nombre);
                archivo.newLine();

                archivo.write("Precio: $" + precio);
                archivo.newLine();

                archivo.write("Cantidad: " + cantidad);
                archivo.newLine();

                archivo.write("Valor total: $" + total);
                archivo.newLine();

                archivo.newLine();
            }

            archivo.close();

            System.out.println("Productos registrados correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        } catch (NumberFormatException e) {
            System.out.println("Ingrese valores numericos validos.");
        }

        scanner.close();
    }
}
