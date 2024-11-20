package usuario.cliente;

import usuario.Usuario;

public class Cliente extends Usuario{
    // Variables
    private String FechaRegistro;
    private String DireccionRegistro;
    private String SucursalRegistro; 

    // Constructor
    public Cliente(String id, String nombre, String apellidos, String RFC, String CURP, String direccion, String contrasenia, String FechaRegistro, String DireccionRegistro, String SucursalRegistro) {
        super(id, nombre, apellidos, RFC, CURP, direccion, contrasenia);
        this.FechaRegistro = FechaRegistro;
        this.DireccionRegistro = DireccionRegistro;
        this.SucursalRegistro = SucursalRegistro;
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
