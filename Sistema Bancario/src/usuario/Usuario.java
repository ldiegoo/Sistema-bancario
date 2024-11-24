package usuario;

public abstract class Usuario {
    // Variables

    public String nombre;
    public String apellidos;
    public String RFC;
    public String CURP;
    public String direccion;
    protected String contrasenia;

    //CONSTRUCTOR
    public Usuario( String nombre, String apellidos, String RFC, String CURP, String direccion, String contrasenia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.RFC = RFC;
        this.CURP = CURP;
        this.direccion = direccion;
        this.contrasenia = contrasenia;
    }

    // GETTERS Y SETTERS


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRFC() {
        return this.RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return this.CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


}