package producto.productos;

import producto.Producto;
import producto.tipoProducto.TipoProducto;

import java.util.IdentityHashMap;

public class Palomitas extends Producto{

    public Palomitas (String Id,String nombre, double precio) {
        super(Id,nombre, precio, TipoProducto.PALOMITAS);
    }

    public void mostrarDatos(){
        String.format(
            "nombre: %s, precio: %.2f",
            nombre,
            precio
        );
    }
}
