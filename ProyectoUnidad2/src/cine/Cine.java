package cine;

import asiento.Asiento;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import usuario.Usuario;
import usuario.administrador.Administrador;
import usuario.cliente.Cliente;
import usuario.trabajador.Trabajador;

public class Cine {
    public ArrayList<Administrador> listaAdmin = new ArrayList<>();
    public ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public ArrayList<Cliente> listaClientes = new ArrayList<>();
    public ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
    public ArrayList<Asiento> listaAsientos = new ArrayList<>();

    // Constructores
    public Cine(ArrayList<Administrador> listaAdmin, ArrayList<Usuario> listaUsuarios, ArrayList<Cliente> listaClientes, ArrayList<Trabajador> listaTrabajadores, ArrayList<Asiento> listaAsientos) {
        this.listaAdmin = listaAdmin;
        this.listaUsuarios = listaUsuarios;
        this.listaClientes = listaClientes;
        this.listaTrabajadores = listaTrabajadores;
        this.listaAsientos = listaAsientos;
    }

    public Cine() {
    }


    // Metodos
    public String generarIdAdmin(String apellido, int antiguedad, String fechaNacimiento) {
        LocalDate fecha = LocalDate.now();
        Random rdm = new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        int ant = antiguedad;
        char ultimoDigitofecha = apellido.charAt(apellido.length() - 1);
        char penultimoDigitofecha = apellido.charAt(apellido.length() - 2);
        int yearActual = fecha.getYear();
        int aleatorio = rdm.nextInt(9999);
        int lista = listaAdmin.size() + 1;
        return String.format("ADM-%s%d%c%c%d%d%d",
                apell,
                ant,
                ultimoDigitofecha,
                penultimoDigitofecha,
                yearActual,
                aleatorio,
                lista);

    }
    public String generarIdCliente(String apellido, String CURP) {
        LocalDate fecha = LocalDate.now();
        Random rdm= new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        char primerDigitoCurp = CURP.charAt(0);
        char segundoDigitoCurp = CURP.charAt(1);
        int yearActual = fecha.getYear();
        int aleatorio = rdm.nextInt(9999);
        int lista = listaClientes.size()+1;
        return String.format("CUS-%s%c%c%d%d%d",
                apell,
                primerDigitoCurp,
                segundoDigitoCurp,
                yearActual,
                aleatorio,
                lista);

    }

    public String generarIdTrabajador(String apellido, String nombre, String fechaNacimiento) {
        LocalDate fecha = LocalDate.now();
        Random rdm= new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        char ultimoDigitoFechaNac = fechaNacimiento.charAt(apellido.length() - 1);
        char penultimoDigitoFechaNac = fechaNacimiento.charAt(apellido.length() - 2);
        char primerDigitoNombre = nombre.charAt(0);
        char segundoDigitoNombre = nombre.charAt(1);
        int aleatorio= rdm.nextInt(9999);
        int yearActual = fecha.getYear();
        int lista = listaTrabajadores.size()+1;
        return String.format("TRAB-%s%c%c%c%c%d%d%d",
                apell,
                ultimoDigitoFechaNac,
                penultimoDigitoFechaNac,
                primerDigitoNombre,
                segundoDigitoNombre,
                yearActual,
                aleatorio,
                lista);
    }













    // Getters n Setters
    public ArrayList<Administrador> getListaAdmin() {
        return this.listaAdmin;
    }

    public void setListaAdmin(ArrayList<Administrador> listaAdmin) {
        this.listaAdmin = listaAdmin;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Cliente> getListaClientes() {
        return this.listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return this.listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public ArrayList<Asiento> getListaAsientos() {
        return this.listaAsientos;
    }

    public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
        this.listaAsientos = listaAsientos;
    }

}
