package usuario.cliente;

import usuario.Usuario;
import utils.RolTrabajo;

import java.io.Serial;
import java.io.Serializable;

public class Cliente extends Usuario implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    // Variables
    private String FechaRegistro;
    private String DireccionRegistro;
    private String SucursalRegistro;

    // Constructor


    public Cliente(String Id, String nombre, String apellidos, String RFC, String CURP, String direccion, String telefono, String contrasenia, String fechaRegistro, String direccionRegistro, String sucursalRegistro) {
        super(Id, nombre, apellidos, RFC, CURP, direccion, telefono, contrasenia);
        FechaRegistro = fechaRegistro;
        DireccionRegistro = direccionRegistro;
        SucursalRegistro = sucursalRegistro;
    }

    // GETTERS & SETTERS
    public String getFechaRegistro() {
        return this.FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public String getDireccionRegistro() {
        return this.DireccionRegistro;
    }

    public void setDireccionRegistro(String DireccionRegistro) {
        this.DireccionRegistro = DireccionRegistro;
    }

    public String getSucursalRegistro() {
        return this.SucursalRegistro;
    }

    public void setSucursalRegistro(String SucursalRegistro) {
        this.SucursalRegistro = SucursalRegistro;
    }


    
}
