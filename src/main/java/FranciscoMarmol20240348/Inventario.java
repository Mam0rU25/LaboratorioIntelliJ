package FranciscoMarmol20240348;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventario {
        private Producto[] productos;
        private int contadorProductos;
        private static final int CAPACIDAD = 10;

        public Inventario() {
            productos = new Producto[CAPACIDAD];
            contadorProductos = 0;
            inicializarDatosEjemplo();
        }

        private void inicializarDatosEjemplo() {
            agregarProducto(new Producto("P001", 15));
            agregarProducto(new Producto("P002", 8));
            agregarProducto(new Producto("P003", 5));
        }
    //Creacion de eventos y estructuras selectivas IF
        public void agregarProducto(Producto producto) {
            if (contadorProductos < CAPACIDAD) {
                productos[contadorProductos] = producto;
                contadorProductos++;
            }
        }

    //Otro evento que sera el de actualizar Stock, el cual contiene un for, que servira para contar la cantidad de productos
        public void actualizarStock(String id, int nuevaCantidad) {
            boolean encontrado = false;

            for (int i = 0; i < contadorProductos; i++) {
                if (productos[i].getId().equals(id)) {
                    productos[i].setStock(nuevaCantidad);
                    System.out.println("Stock actualizado");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Producto no registrado");
            }
        }

        // Implementación exacta del diagrama de secuencia
        public void listarStockBajo() {
            System.out.println("Productos con stock bajo:");

            for (int i = 0; i < contadorProductos; i++) {
                if (productos[i].getStock() < 10) {
                    System.out.println(productos[i].toString());
                }
            }
        }
    }
