package carrito;

import java.util.ArrayList;
import java.util.Scanner;

import funcion.Funcion;
import producto.Producto;
import cine.Cine;

public class Carrito {
    Cine cine= new Cine();
    final Scanner input = new Scanner(System.in);
    public ArrayList<Producto> listaProductosCarrito = new ArrayList<>();
    public ArrayList<Funcion> listaFuncionesCarrito = new ArrayList<>();
    
    public double precioTotal;







    // Metodos




    public void AgregarProducto() {
        System.out.println("Agregar Id del producto: ");
        String Id=input.nextLine();
       Producto x=cine.obtenerproductoAgregado(Id);
       cine.AgregarProducto(x.getId());
    }


    public void EliminarCarrito(Producto producto) {
        listaProductosCarrito.remove(producto.id);
    }

    public void PagarCarrito() {
        for (Producto producto : listaProductosCarrito) {
            precioTotal += producto.getPrecio();
        }
        
        System.out.println("Total: " + precioTotal);
        System.out.println("Seleccionar metodo de pago");
        System.out.println("Carrito pagado con exito");
    }




} // Fin carrito

