package usuario.administrador;

import cine.Cine;
import java.time.LocalDate;
import usuario.Usuario;
import utils.Rol;

public class Administrador extends Usuario{
    public double sueldo;
    public String rfc;
    public int antiguedad;
    public String telefono;
    
    static Cine cine = new Cine();


    // Constructor
    public Administrador(String id, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String contrasenia, double sueldo, String rfc, int antiguedad) {
        super(id, nombre, apellido, fechaNacimiento, telefono, contrasenia, Rol.ADMIN);
        this.sueldo = sueldo;
        this.rfc = rfc;
        this.antiguedad = antiguedad;
    }
    
    // Metodos
    public String mostrarDatos(){
        return String.format("Id: %s, nombre: %s, apellido: %s, fecha de nacimiento: %s, telefono: %s, contraseña: %s, sueldo: %.2f, rfc: %s, antiguedad: %d",
            getId(),
            getNombre(),
            getApellido(),
            getFechaNacimiento(),
            getTelefono(),
            getContraseña(),
            getSueldo(),
            getRfc(),
            getAntiguedad()
        );
    }


    
    // Getters n Setters
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
