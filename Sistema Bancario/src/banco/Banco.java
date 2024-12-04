package banco;

import usuario.empleado.GerenteSucursal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
public class Banco {
public ArrayList<GerenteSucursal> listaGerente = new ArrayList<>();

    public Banco(ArrayList<GerenteSucursal> listaGerente) {
        this.listaGerente = listaGerente;
    }

    public static String generarNumeroTarjeta() {
        Random random = new Random();
        StringBuilder numeroTarjeta = new StringBuilder();

        // Genera un número de tarjeta de 16 dígitos
        for (int i = 0; i < 16; i++) {
            numeroTarjeta.append(random.nextInt(10)); // Genera un dígito aleatorio del 0 al 9
        }
        // Formatea el número en bloques de 4
        StringBuilder numeroFormateado = new StringBuilder();
        for (int i = 0; i < numeroTarjeta.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                numeroFormateado.append(" "); // Añade un espacio cada 4 dígitos
            }
            numeroFormateado.append(numeroTarjeta.charAt(i));
        }
        return numeroFormateado.toString();
    }
    public String generarIdCliente(String apellido, String CURP,String SucursalRegistro) {
        LocalDate fecha = LocalDate.now();
        Random rdm= new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        char primerDigitoCurp = CURP.charAt(0);
        char segundoDigitoCurp = CURP.charAt(1);
        char primerDigitoSucursal = SucursalRegistro.charAt(0);
        char segundoDigitoSucursal = SucursalRegistro.charAt(1);
        char tercerDigitoSucursal = SucursalRegistro.charAt(2);
        int yearActual = fecha.getYear();
        int aleatorio = rdm.nextInt(9999);
        //int lista = listaClientes.size()+1;
        return String.format("CUS-%s%s%s%s%c%c%d%d",
                primerDigitoSucursal,
                segundoDigitoSucursal,
                tercerDigitoSucursal,
                apell,
                primerDigitoCurp,
                segundoDigitoCurp,
                yearActual,
                aleatorio);

    }
    public String generarIdEmpleado(String nombre, String apellido, String CURP) {
        LocalDate fecha = LocalDate.now();
        Random rdm= new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        char ultimoDigitoFechaNac = CURP.charAt(apellido.length() - 1);
        char penultimoDigitoFechaNac = CURP.charAt(apellido.length() - 2);
        char primerDigitoNombre = nombre.charAt(0);
        char segundoDigitoNombre = nombre.charAt(1);
        int aleatorio= rdm.nextInt(9999);
        int yearActual = fecha.getYear();
       // int lista = listaTrabajadores.size()+1;
        return String.format("TRAB-%s%c%c%c%c%d%d",
                apell,
                ultimoDigitoFechaNac,
                penultimoDigitoFechaNac,
                primerDigitoNombre,
                segundoDigitoNombre,
                yearActual,
                aleatorio);
    }
    public String generarCVV() {
        Random rdm= new Random();
        StringBuilder cvv = new StringBuilder();
        //generar el cvv
        for (int i = 0; i < 3; i++) {
            cvv.append(rdm.nextInt(10));
        }
        //convierte la StringBuilder a String
        return cvv.toString();
    }
    public LocalDate generarFechaVencimiento() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaVencimiento = fechaActual.plusYears(5);
        return fechaVencimiento;
    }

}
