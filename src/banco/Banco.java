package banco;

import usuario.cliente.Cliente;
import usuario.empleado.Empleado;
import utils.AppendableObjectOutputStream;

import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class Banco {

    // Registro Cliente
    public void registrarCliente(Cliente cliente) {
        boolean append = new File(System.getProperty("user.dir") + "/clientes.bin").exists();
        try (FileOutputStream archivoEscribir = new FileOutputStream(System.getProperty("user.dir") + "/clientes.bin", true);
             ObjectOutputStream out = append ? new AppendableObjectOutputStream(archivoEscribir) : new ObjectOutputStream (archivoEscribir)) {
            out.writeObject(cliente);
            System.out.println("Usuario cliente ha sido registrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Registro Empleado
    public void registrarEmpleado(Empleado empleado) {
        boolean append = new File(System.getProperty("user.dir") + "/clientes.bin").exists();
        try (FileOutputStream archivoEscribir = new FileOutputStream(System.getProperty("user.dir") + "/empleados.bin", true);
             ObjectOutputStream out = append ? new AppendableObjectOutputStream(archivoEscribir) : new ObjectOutputStream (archivoEscribir)) {
            out.writeObject(empleado);
            System.out.println("Usuario empleado ha sido registrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Obtener Clientes
    public Cliente obtenerCliente(String id) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir") + "/clientes.bin"))) {
            while (true) {
                try {
                    Cliente cliente = (Cliente) in.readObject();
                    if (cliente.getId().equals(id)) {
                        return cliente;
                    }
                } catch (EOFException e) {
                    break; // Final del archivo
                } catch (ClassNotFoundException e) {
                    System.err.println("Usuario no encontrada: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Cliente no encontrado");
        return null;
    }

    // Obtener Clientes por nombre y apellido
    public Cliente obtenerClientePorNombre(String nombre, String apellido) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir") + "/clientes.bin"))) {
            while (true) {
                try {
                    Cliente cliente = (Cliente) in.readObject();
                    if (cliente.getNombre().equalsIgnoreCase(nombre) && cliente.getApellidos().equalsIgnoreCase(apellido)) {
                        return cliente;
                    }
                } catch (EOFException e) {
                    break; // Final del archivo
                } catch (ClassNotFoundException e) {
                    System.err.println("Usuario no encontrada: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("⚠\uFE0F Cliente no encontrado");
        return null;
    }

    // Obtener Empleado por nombre y apellido
    public Empleado obtenerEmpleadoPorNombre(String nombre, String apellido) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir") + "/empleados.bin"))) {
            while (true) {
                try {
                    Empleado empleado = (Empleado) in.readObject();
                    if (empleado.getNombre().equalsIgnoreCase(nombre) && empleado.getApellidos().equalsIgnoreCase(apellido)) {
                        return empleado;
                    }
                } catch (EOFException e) {
                    break; // Final del archivo
                } catch (ClassNotFoundException e) {
                    System.err.println("Usuario no encontrada: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("⚠\uFE0F Empelado no encontrado");
        return null;
    }

    //Nuemro de tarjeta random
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
        return numeroTarjeta.toString();
    }

    //Id cliente
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

    //Id empleado
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

    /*public Empleado buscarEjecutivoPorRFC(String rfcEmpleado) {
        for (Empleado empleado : listaEjecutivos) {
            if (empleado.getRFC().equals(rfcEmpleado)) {
                return empleado;
            }
        }
        return null;
    }*/

    public void verInformacionCliente(Cliente cliente) {
        System.out.println("Datos del cliente:");
        cliente.mostrarDatos();
    }

    /*public void mostrarEmpleados() {
        System.out.println("\n** Empleados **");
        for (Medico medicos : this.listaMedicos) {
            System.out.println(medicos.mostrarDatos());
        }
    }*/


}
