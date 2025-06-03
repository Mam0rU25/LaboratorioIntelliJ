package FranciscoMarmol20240348;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Inventario inventario = new Inventario();
                Scanner scanner = new Scanner(System.in);

                //Demostracion de sistematizacion de gestion de productos
                System.out.println("=== Ejemplo de actualización ===");
                inventario.actualizarStock("P001", 20); // Producto existente
                inventario.actualizarStock("P004", 10); // Producto no existente

                System.out.println("\n=== Listado de stock bajo ===");
                inventario.listarStockBajo();

                scanner.close();
            }
        }

