package usuario.cliente;

import tarjeta.credito.TarjetaCredito;
import tarjeta.debito.TarjetaDebito;
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

    // Constructor
    public Cliente(String Id, String nombre, String apellidos, String RFC, String CURP, String direccion, String telefono, String contrasenia, String fechaRegistro, String direccionRegistro) {
        super(Id, nombre, apellidos, RFC, CURP, direccion, telefono, contrasenia);
        FechaRegistro = fechaRegistro;
        DireccionRegistro = direccionRegistro;
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





    
}
