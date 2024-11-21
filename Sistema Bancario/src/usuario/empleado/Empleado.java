package usuario.empleado;

import usuario.Usuario;

public class Empleado extends Usuario {
    // Variables
    public String sucursal;
    private double salario;
    private RolTrabajo rol;

    // Constructor
    public Empleado(String id, String nombre, String apellidos, String RFC, String CURP, String direccion, String contrasenia, String sucursal, double salario, RolTrabajo rol) {
        super(id, nombre, apellidos, RFC, CURP, direccion, contrasenia);
        this.sucursal = sucursal;
        this.salario = salario;
        this.rol = rol;
    }


    // GETTERS & SETTERS

    public String getSucursal() {
        return this.sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        System.out.println("");
        System.out.println();
    }

    public RolTrabajo getRol() {
        return this.rol;
    }

    public void setRol(RolTrabajo rol) {
        this.rol = rol;
    }

}
