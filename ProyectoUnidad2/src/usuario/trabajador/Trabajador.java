package usuario.trabajador;

import java.time.LocalDate;
import usuario.Usuario;
import utils.Rol;

public class Trabajador extends Usuario{
    String rfc;
    String telefono;
    int añosTrabajando;
    public double sueldo;

    // Constructor
        public Trabajador(String id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String rfc, Double sueldo, String telefono, String contraseña, int añosTrabajando) {
        super(id, nombre, apellido, fechaNacimiento, direccion, contraseña, Rol.CINEPOLITOS);
        this.rfc = rfc;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.añosTrabajando= añosTrabajando;
    }

    // Metodos
    public String mostrarDatos(){
        return String.format("Id: %s, nombre: %s, apellido: %s, fecha de nacimiento: %s, direccion: %s, rfc: %s, sueldo: %.2f, telefono: %s, años trabajando: %d",
            getId(),
            getNombre(),
            getApellido(),
            getFechaNacimiento(),
            getDireccion(),
            getRfc(),
            getSueldo(),
            getTelefono(),
            getAñosTrabajando()
        );
}

    // Getters n Setters
    public String getRfc() {
        return this.rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAñosTrabajando() {
        return this.añosTrabajando;
    }

    public void setAñosTrabajando(int añosTrabajando) {
        this.añosTrabajando = añosTrabajando;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


}
