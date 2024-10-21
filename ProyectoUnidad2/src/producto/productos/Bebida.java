package producto.productos;

import producto.Producto;
import producto.tipoProducto.TipoProducto;

public class Bebida extends Producto{

    public Bebida(String id,String nombre, double precio) {
        super(id,nombre, precio, TipoProducto.BEBIDA);
    }

    public void mostrarDatos(){
        String.format(
            "nombre: %s, precio: %.2f",
            nombre,
            precio
        );
    }
}
