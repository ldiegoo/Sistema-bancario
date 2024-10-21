package boleto;

import asiento.Asiento;
import pelicula.Pelicula;
import sala.Sala;
import usuario.cliente.Cliente;

public class Boleto {

    public String IdBoleto;
    public double precio;
    public Asiento asiento;
    public Sala sala;
    public Cliente cliente;
    public Pelicula pelicula;

    // Constructor
    public Boleto(String IdBoleto, double precio, Asiento asiento, Sala sala, Cliente cliente, Pelicula pelicula) {
        this.IdBoleto = IdBoleto;
        this.precio = precio;
        this.asiento = asiento;
        this.sala = sala;
        this.cliente = cliente;
        this.pelicula = pelicula;
    }

    public Boleto() {
        
    }

    // Getters n Setters
    public String getIdBoleto() {
        return this.IdBoleto;
    }

    public void setIdBoleto(String IdBoleto) {
        this.IdBoleto = IdBoleto;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Asiento getAsiento() {
        return this.asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public Sala getSala() {
        return this.sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return this.pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    

}