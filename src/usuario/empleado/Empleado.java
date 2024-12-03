package usuario.empleado;

import usuario.Usuario;
import utils.RolTrabajo;

import java.io.Serial;
import java.io.Serializable;

public class Empleado extends Usuario implements Serializable {
    // Variables
    @Serial
    private static final long serialVersionUID = 3255469587165131566L;
    public int sucursal;
    private double salario;
    private final RolTrabajo rol;

    // Constructor
    public Empleado(String Id, String nombre, String apellidos, String RFC, String CURP, String direccion, String telefono, String contrasenia, int sucursal, double salario, RolTrabajo rol) {
        super(Id, nombre, apellidos, RFC, CURP, direccion, telefono, contrasenia);
        this.sucursal = sucursal;
        this.salario = salario;
        this.rol = rol;
    }


    // GETTERS & SETTERS

    public int getSucursal() {
        return this.sucursal;
    }

    public void setSucursal(int sucursal) {
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

    public RolTrabajo getRol() {return this.rol;}

    /*public RolTrabajo getRol() {
        return this.rol;
    }

    public void setRol(RolTrabajo rol) {
        this.rol = rol;
    }*/
/*
String Id,
String nombre,
String apellidos,
String RFC,
String CURP,
String direccion,
String telefono,
String contrasenia,
int sucursal,
double salario,
RolTrabajo rol
 */
}
