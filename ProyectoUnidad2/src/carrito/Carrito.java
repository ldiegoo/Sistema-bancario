package carrito;

import java.util.ArrayList;

import funcion.Funcion;
import producto.Producto;

public class Carrito {
    public ArrayList<Producto> listaProductos = new ArrayList<>();
    public ArrayList<Funcion> listaFuncion = new ArrayList<>();
    
    public double precioTotal;

/* */
/*public Paciente obtenerPacienteporId(String idPaciente) {
        return listaPacientes.stream().filter(p -> p.getId().equals(idPaciente)).findFirst().orElse(null);
    }*/

//public Producto pro


    // Metodos
    
    /* 
    
    

    public void AgregarProducto(String Id) {
        Producto producto = obtenerproductoAgregado(Id);
        if (producto != null) {
            listaProductos.add(producto);
        } else {
            System.out.println("No se encontro el producto");
        }
    }


    public void EliminarCarrito(Producto producto) {
        listaProductos.remove(producto.id);
    }

    public void PagarCarrito() {
        for (Producto producto : listaProductos) {
            precioTotal += producto.getPrecio();
        }
        
        System.out.println("Total: " + precioTotal);
        System.out.println("Seleccionar metodo de pago");
        System.out.println("Carrito pagado con exito");
    }


 */

} // Fin carrito

