package usuario;

import utils.RolTrabajo;

import java.io.Serializable;

public abstract class Usuario implements Serializable {
    // Variables
    public String Id;
    public String nombre;
    public String apellidos;
    public String RFC;
    public String CURP;
    public String direccion;
    public String telefono;
    protected String contrasenia;

    //CONSTRUCTOR
    public Usuario(String Id, String nombre, String apellidos, String RFC, String CURP, String direccion,String telefono, String contrasenia) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.RFC = RFC;
        this.CURP = CURP;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contrasenia = contrasenia;
    }

    public void mostrarDatos() {
        System.out.println("\n-------------------");
        System.out.println("-Datos del cliente-");
        System.out.println("-------------------");
        String datos = String.format("""
                Nombre completo: %s %s
                Id: %s
                RFC: %s
                Telefono: %s\n
                """, nombre, apellidos, getId(), RFC, telefono);
        System.out.println(datos);
    }

    // GETTERS Y SETTERS
    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRFC() {
        return this.RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return this.CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

}