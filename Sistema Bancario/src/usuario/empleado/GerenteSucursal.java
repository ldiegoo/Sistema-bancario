package usuario.empleado;

public class GerenteSucursal extends Empleado{

    public GerenteSucursal(String IdEmpleado, String nombre, String apellidos, String RFC, String CURP, String direccion, String contrasenia, String sucursal, double salario) {
        super(IdEmpleado, nombre, apellidos, RFC, CURP, direccion, contrasenia, sucursal, salario, RolTrabajo.GERENTESUCURSAL);
    }

}
