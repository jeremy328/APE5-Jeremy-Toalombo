import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroVentas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalVentas = 0;

        try {
            BufferedWriter archivo =
                new BufferedWriter(
                    new FileWriter("ventas.txt", true));

            while (true) {

                System.out.print("Ingrese el producto (fin para terminar): ");
                String producto = scanner.nextLine();

                if (producto.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Ingrese el precio: ");
                double precio = Double.parseDouble(scanner.nextLine());

                System.out.print("Ingrese la cantidad: ");
                int cantidad = Integer.parseInt(scanner.nextLine());

                double subtotal = precio * cantidad;

                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double total = subtotal - descuento;

                totalVentas += total;

                archivo.write("Producto: " + producto);
                archivo.newLine();

                archivo.write("Subtotal: $" + subtotal);
                archivo.newLine();

                archivo.write("Descuento: $" + descuento);
                archivo.newLine();

                archivo.write("Total: $" + total);
                archivo.newLine();

                archivo.newLine();

                System.out.println("Total a pagar: $" + total);
                System.out.println("-------------------------");
            }

            archivo.write("TOTAL DE VENTAS: $" + totalVentas);
            archivo.newLine();
            archivo.newLine();

            archivo.close();

            System.out.println("Registro de ventas finalizado.");
            System.out.println("Total vendido: $" + totalVentas);

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        } catch (NumberFormatException e) {
            System.out.println("Ingrese valores numericos validos.");
        }

        scanner.close();
    }
}
