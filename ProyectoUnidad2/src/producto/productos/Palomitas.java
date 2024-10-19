package producto.productos;

import producto.Producto;
import producto.tipoProducto.TipoProducto;

public class Palomitas extends Producto{

    public Palomitas (String nombre, double precio) {
        super(nombre, precio, TipoProducto.PALOMITAS);
    }

    public void mostrarDatos(){
        String.format(
            "nombre: %s, precio: %.2f",
            nombre,
            precio
        );
    }
}
