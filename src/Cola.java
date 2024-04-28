import javax.swing.*;

public class Cola {
    Cliente primero;
    Cliente ultimo;
    int tamaño;

    public Cola() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public void ingresarCliente(String nombre) {
        Cliente nuevoCliente = new Cliente(nombre);

        if (primero == null) {
            primero = nuevoCliente;
            ultimo = nuevoCliente;
        } else {
            ultimo.siguiente = nuevoCliente;
            ultimo = nuevoCliente;
        }
        tamaño++;
    }

    public void atenderCliente() {
        if(vacia()) {
            System.out.println("No hay clientes." + "\n");
        } else if (primero == ultimo) { // Si solo hay un elemento en la cola
            System.out.println("Se ha atendido a " + primero.nombre);
            primero = null;
            ultimo = null;
            tamaño--;
        } else {
            System.out.println("Se ha atendido a " + primero.nombre);
            primero = primero.siguiente;
            tamaño--;
        }
    }

    public void primero() {
        if (vacia()) {
            System.out.println("Cola vacia." + "\n");
        } else {
            System.out.println("El primer cliente es "+ primero.nombre + "\n");
        }
    }

    public void ultimo() {
        if (vacia()) {
            System.out.println("Cola vacia." + "\n");
        } else {
            System.out.println("El ultimo cliente es "+ ultimo.nombre + "\n");
        }
    }

    public boolean vacia() {
        return tamaño == 0;
    }

    public void estaVacia() {
        if(vacia()) {
            System.out.println("Cola vacia." + "\n");
        }
        else {
            longitud();
        }
    }

    public void longitud() {
        if (vacia()) {
            System.out.println("Cola vacia." + "\n");
        } else {
            System.out.println("Hay " + tamaño + " clientes en la cola." + "\n");
        }
    }

    public void obtenerResultado() {
        System.out.println("IMPLEMENTAR");
    }

   /* public void desencolar() {
        if (vacia()) {
            System.out.println("Cola vacia.");
        } else if (primero == ultimo) { // Si solo hay un elemento en la cola
            System.out.println("Se ha desencolado el nodo " + primero.data);
            primero = null;
            ultimo = null;
            tamaño--;
        } else {
            System.out.println("Se ha desencolado el nodo " + primero.data);
            primero = primero.siguiente;
            primero.anterior = null;
            tamaño--;
        }
    }  
    */


}
