package usuario.cliente;

import java.time.LocalDate;
import usuario.Usuario;
import utils.Rol;

public class Cliente extends Usuario{
    public String CURP;
    public int totalFunciones;
    
    // Constructor
    public Cliente(String id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String CURP, int totalFunciones, String contraseña) {
        super(id, nombre, apellido, fechaNacimiento, direccion, contraseña, Rol.CLIENTES);
        this.CURP = CURP;
        this.totalFunciones = totalFunciones;
    }

    // Metodos







    // Getters n Setters
    public String getCURP() {
        return this.CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public int getTotalFunciones() {
        return this.totalFunciones;
    }

    public void setTotalFunciones(int totalFunciones) {
        this.totalFunciones = totalFunciones;
    }

}
