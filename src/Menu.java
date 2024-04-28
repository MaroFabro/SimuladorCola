import javax.swing.*;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    Cola nuevaCola = new Cola();

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Primer cliente");
            System.out.println("4. Ultimo cliente");
            System.out.println("5. Longitud");
            System.out.println("6. Vacia");
            System.out.println("7. Cambiar tiempo de atencion");
            System.out.println("8. Obtener resultados");
            System.out.println("0. Terminar programa");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.next();
                    nuevaCola.ingresarCliente(nombreCliente);
                    break;
                case 2:
                    nuevaCola.atenderCliente();
                    break;
                case 3:
                    nuevaCola.primero();
                    break;
                case 4:
                    nuevaCola.ultimo();
                    break;
                case 5:
                    nuevaCola.longitud();
                    break;
                case 6:
                    nuevaCola.estaVacia();
                    break;
                case 7:
                     setTiempoDeAtencion();
                     break;
                case 8:
                    nuevaCola.obtenerResultado();
                    break;
                case 0:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    public void setTiempoDeAtencion() {
        System.out.println("Ingrese el tiempo de atención para la Caja 1 (minutos):");
        int tiempoCaja1 = scanner.nextInt();
        System.out.println("Ingrese el tiempo de atención para la Caja 2 (minutos):");
        int tiempoCaja2 = scanner.nextInt();
        System.out.println("Ingrese el tiempo de atención para la Caja 3 (minutos):");
        int tiempoCaja3 = scanner.nextInt();

        Caja caja1 = new Caja("Caja 1", tiempoCaja1);
        Caja caja2 = new Caja("Caja 2", tiempoCaja2);
        Caja caja3 = new Caja("Caja 3", tiempoCaja3);

        System.out.println(
                "Tiempo de atencion de: \n"
                + "Caja 1: " + tiempoCaja1 + " minutos.\n"
                + "Caja 2: " + tiempoCaja2 + " minutos.\n"
                + "Caja 3: " + tiempoCaja3 + " minutos.\n"
        );
    }

    public static void main(String[] args) {

        Menu m = new Menu();
        m.setTiempoDeAtencion();
        m.mostrarMenu();
    }
}


