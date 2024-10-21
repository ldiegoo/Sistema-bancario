package carrito;

import cine.Cine;
import funcion.Funcion;
import java.util.ArrayList;
import java.util.Scanner;
import producto.Producto;

public class Carrito {
    Cine cine= new Cine();
    final Scanner input = new Scanner(System.in);
    public ArrayList<Producto> listaProductosCarrito = new ArrayList<>();
    public ArrayList<Funcion> listaFuncionesCarrito = new ArrayList<>();
    
    public double precioTotal;

    // Metodos
    public void AgregarProducto() {
        System.out.println("Ingresar Id del producto: ");
        String Id=input.nextLine();
        Producto x=cine.obtenerproductoAgregado(Id);
        cine.AgregarProducto(x.getId());
    }

    public void EliminarProducto() {
        System.out.print("Ingresar Id del producto: ");
        String Id = input.nextLine();
        for (Producto p : listaProductosCarrito) {
            if (p.getId().equals(Id)) {
                listaProductosCarrito.remove(p);
                System.out.println("Producto eliminado con exito");
            }
        }
    }

    public void EliminarCarrito() {
        for (Producto p : listaProductosCarrito) {
            listaProductosCarrito.remove(p);
            System.out.println("Carrito eliminado con exito");
        }
    }

    public void PagarCarrito() {
        for (Producto producto : listaProductosCarrito) {
            precioTotal += producto.getPrecio();
        }
        
        int opcion = 0;
        while (opcion != 1 && opcion != 2) {
            System.out.println("Total: " + precioTotal);
            System.out.println("Seleccionar metodo de pago");
            System.out.println("1. Credito\n2. Debito");
            opcion = input.nextInt();
        }
        System.out.println("Carrito pagado con exito");
        System.out.println("Metodo de pago: ");
        switch (opcion) {
            case 1 -> System.out.print("Credito");
            case 2 -> System.out.println("Debito");
        }
        for (Producto p : listaProductosCarrito) {
            listaProductosCarrito.remove(p);
            System.out.println("Carrito eliminado con exito");
        }
    }

} // Fin carrito

