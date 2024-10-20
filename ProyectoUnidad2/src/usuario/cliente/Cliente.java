package usuario.cliente;

import java.time.LocalDate;
import usuario.Usuario;
import utils.Rol;

public class Cliente extends Usuario{
    public String CURP;

    // Constructor
    public Cliente(String id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String CURP, String contraseña) {
        super(id, nombre, apellido, fechaNacimiento, direccion, contraseña, Rol.CLIENTES);
        this.CURP = CURP;
    }

    // Getters n Setters
    public String getCURP() {
        return this.CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
    public String mostrarDatos(){
        return String.format("Id: %s, nombre: %s, apellido: %s, fecha de nacimiento: %s,direccion: %s,CURP: %s, contraseña: %s",
                getId(),
                getNombre(),
                getApellido(),
                getFechaNacimiento(),
                getDireccion(),
                getCURP(),
                getContraseña()

        );
    }

}
