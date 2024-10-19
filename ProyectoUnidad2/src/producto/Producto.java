package producto;

import producto.tipoProducto.TipoProducto;

public class Producto {
    public String nombre;
    public double precio;
    public TipoProducto tipo;

    // Constructor
    public Producto(String nombre, double precio, TipoProducto tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo=tipo;
    }



    // Getters n Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoProducto getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }




}
