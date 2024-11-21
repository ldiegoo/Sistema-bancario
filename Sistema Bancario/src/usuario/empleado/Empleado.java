package usuario.empleado;

import usuario.Usuario;

public class Empleado extends Usuario{
    // Variables
    public String IdEmpleado;
    public String sucursal;
    private double salario;
    private RolTrabajo rol;

    // Constructor
    public Empleado(String IdEmpleado, String nombre, String apellidos, String RFC, String CURP, String direccion, String contrasenia, String sucursal, double salario, RolTrabajo rol) {
        super(nombre, apellidos, RFC, CURP, direccion, contrasenia);
        this.IdEmpleado = IdEmpleado;
        this.sucursal = sucursal;
        this.salario = salario;
        this.rol = rol;
    }


    // GETTERS & SETTERS

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        IdEmpleado = idEmpleado;
    }

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
    }

    public RolTrabajo getRol() {
        return this.rol;
    }

    public void setRol(RolTrabajo rol) {
        this.rol = rol;
    }

}
