package banco;

import tarjeta.credito.TarjetaCredito;
import tarjeta.debito.TarjetaDebito;
import usuario.cliente.Cliente;
import usuario.empleado.Empleado;
import utils.AppendableObjectOutputStream;
import utils.RolTrabajo;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Banco {


    static Scanner input = new Scanner(System.in);


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
        boolean append = new File(System.getProperty("user.dir") + "/empleados.bin").exists();
        try (FileOutputStream archivoEscribir = new FileOutputStream(System.getProperty("user.dir") + "/empleados.bin", true);
             ObjectOutputStream out = append ? new AppendableObjectOutputStream(archivoEscribir) : new ObjectOutputStream (archivoEscribir)) {
            out.writeObject(empleado);
            System.out.println("Usuario empleado ha sido registrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Registro Tarjeta Credito
    public static void registrarTarjetaCredito (TarjetaCredito tarjetaCredito) {
        boolean append = new File(System.getProperty("user.dir") + "/tarjetasCredito.bin").exists();
        try (FileOutputStream archivoEscribir = new FileOutputStream(System.getProperty("user.dir") + "/tarjetasCredito.bin", true);
             ObjectOutputStream out = append ? new AppendableObjectOutputStream(archivoEscribir) : new ObjectOutputStream (archivoEscribir)) {
            out.writeObject(tarjetaCredito);
            System.out.println("Tarjeta de Credito ha sido registrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Registro Tarjeta Debito
    public static void registrarTarjetaDebito(TarjetaDebito tarjetaDebito) {
        boolean append = new File(System.getProperty("user.dir") + "/tarjetasDebito.bin").exists();
        try (FileOutputStream archivoEscribir = new FileOutputStream(System.getProperty("user.dir") + "/tarjetasDebito.bin", true);
             ObjectOutputStream out = append ? new AppendableObjectOutputStream(archivoEscribir) : new ObjectOutputStream (archivoEscribir)) {
            out.writeObject(tarjetaDebito);
            System.out.println("Tarjeta de Debito ha sido registrado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Obtener Clientes
    public static Cliente obtenerCliente(String id) {
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

    // Obtener Empelado
    public static Empleado obtenerEmpleado(String id) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir") + "/empleados.bin"))) {
            while (true) {
                try {
                    Empleado empleado = (Empleado) in.readObject();
                    if (empleado.getId().equals(id)) {
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
        System.out.println("Empleado no encontrado");
        return null;
    }

    // Obtener Clientes por nombre y apellido
    public static Cliente obtenerClientePorNombre(String nombre, String apellido) {
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
    public static Empleado obtenerEmpleadoPorNombre(String nombre, String apellido) {
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
        System.out.println("⚠\uFE0F Empleado no encontrado");
        return null;
    }

    // Obtener Tarjeta Credito
    public static TarjetaCredito obtenerTarjetaCredito(String nombreCliente, String apellidoCliente) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir") + "/tarjetasCredito.bin"))) {
            while (true) {
                try {
                    TarjetaCredito tarjetaCredito = (TarjetaCredito) in.readObject();
                    String nombreCompletoCliente = nombreCliente + " " + apellidoCliente;
                    if (tarjetaCredito.getTitular().equals(nombreCompletoCliente)) {
                        return tarjetaCredito;
                    }
                } catch (EOFException e) {
                    break; // Final del archivo
                } catch (ClassNotFoundException e) {
                    System.err.println("Tarjeta de Credito no encontrada: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Tarjeta de Credito no encontrado");
        return null;
    }

    // Obtener Tarjeta Debito
    public static TarjetaDebito obtenerTarjetaDebito(String nombreCliente, String apellidoCliente) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(System.getProperty("user.dir") + "/tarjetasDebito.bin"))) {
            while (true) {
                try {
                    TarjetaDebito tarjetaDebito = (TarjetaDebito) in.readObject();
                    String nombreCompletoCliente = nombreCliente + " " + apellidoCliente;
                    if (tarjetaDebito.getTitular().equals(nombreCompletoCliente)) {
                        return tarjetaDebito;
                    }
                } catch (EOFException e) {
                    break; // Final del archivo
                } catch (ClassNotFoundException e) {
                    System.err.println("Tarjeta de Debito no encontrada: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("Tarjeta de Debito no encontrado");
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

    //solicitar tarjeta de credito


    //Id cliente
    public String generarIdCliente(String apellido, String CURP,String nombre) {
        LocalDate fecha = LocalDate.now();
        Random rdm= new Random();
        String apell = apellido.substring(0, 2).toUpperCase();
        char primerDigitoCurp = CURP.charAt(0);
        char segundoDigitoCurp = CURP.charAt(1);
        char primerLetraNombre = nombre.charAt(0);
        char segundoLetraNombre = nombre.charAt(1);
        char tercerLetraNombre = nombre.charAt(2);
        int yearActual = fecha.getYear();
        int aleatorio = rdm.nextInt(9999);
        return String.format("CUS-%s%s%s%s%c%c%d%d",
                primerLetraNombre,
                segundoLetraNombre,
                tercerLetraNombre,
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

    public void verInformacionCliente(Cliente cliente) {
        System.out.println("Datos del cliente:");
        cliente.mostrarDatos();
    }

    public void registracionCliente () {
        System.out.println("\n-------------------");
        System.out.println("- AGREGAR CLIENTE -");
        System.out.println("-------------------");
        System.out.println("Registrar Cliente \uD83E\uDD37");
        System.out.print("Ingresa su nombre: ");
        String nombreCliente= input.nextLine();

        System.out.print("Ingresa su apellido: ");
        String apellidoCliente= input.nextLine();

        System.out.print("\uD83D\uDCC4 Ingresa su rfc: ");
        String rfcCliente= input.nextLine();

        System.out.print("\uD83D\uDCC1 Ingresa su curp: ");
        String curpCliente= input.nextLine();

        System.out.print("\uD83C\uDFE0 Ingresa su dirección: ");
        String direccionCliente= input.nextLine();

        System.out.print("\uD83D\uDCDE Ingresa su telefono: ");
        String telefonoCliente= input.nextLine();

        System.out.print("\uD83D\uDD11 Ingrese su contraseña: ");
        String contraseniaCliente= input.nextLine();

        LocalDate fechaRegistro = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Convertir LocalDate a String
        String fechaString = fechaRegistro.format(formatter);

        String id = this.generarIdCliente(apellidoCliente,curpCliente,nombreCliente);

        Cliente clienteRegistrar = new Cliente(id,nombreCliente,apellidoCliente,rfcCliente,curpCliente,direccionCliente,telefonoCliente,contraseniaCliente,fechaString, direccionCliente);
        this.registrarCliente(clienteRegistrar);
    }
    public void registracionEmpleado(){
        System.out.println("\n-------------------");
        System.out.println("- AGREGAR EJECUTIVO -");
        System.out.println("-------------------");
        System.out.println("Registrar Empleado \uD83E\uDD37");

        System.out.print("Ingresa su nombre: ");
        String nombreEmpleado = input.nextLine();

        System.out.print("Ingresa su apellido: ");
        String apellidoEmpleado = input.nextLine();

        System.out.print("\uD83D\uDCC4 Ingresa su rfc: ");
        String rfcEmpleado = input.nextLine();

        System.out.print("\uD83D\uDCC1 Ingresa su curp: ");
        String curpEmpleado = input.nextLine();

        System.out.print("\uD83C\uDFE0 Ingresa su dirección: ");
        String direccionEmpleado = input.nextLine();

        System.out.print("\uD83D\uDCDE Ingresa su telefono: ");
        String telefonoEmpleado = input.nextLine();

        System.out.print("\uD83D\uDD11 Ingrese su contraseña: ");
        String contraseniaEmpleado = input.nextLine();

        System.out.println("\uD83D\uDCB5 Ingrese el salario del Ejecutivo: ");
        double salarioEmpleado = input.nextDouble();

        int sucursalRegistro = 0;
        while (sucursalRegistro < 1 || sucursalRegistro > 3) {
            System.out.println("\uD83C\uDFDB\uFE0F Selecciona la sucursal de registro: ");
            System.out.println("1. Morelos\n2. Centro\n3. Guatemala ");
            try {
                sucursalRegistro = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n⚠️ Ingrese una opción válida!\n");
                input.nextLine();
            }
            System.out.println("\n⚠️ Ingrese una opción válida!\n");
        }


        String idRegistrar = this.generarIdEmpleado(nombreEmpleado,apellidoEmpleado,curpEmpleado);
        Empleado empleadoRegistrar = new Empleado(idRegistrar, nombreEmpleado, apellidoEmpleado, rfcEmpleado, curpEmpleado, direccionEmpleado, telefonoEmpleado, contraseniaEmpleado, sucursalRegistro, salarioEmpleado,RolTrabajo.EJECUTIVO);
        registrarEmpleado(empleadoRegistrar);

    }

    public static void modificarCliente() {
        String nombreCliente, apellidoCliente, idCliente;

        System.out.println("\n---------------------");
        System.out.println("- MODIFICAR CLIENTE -");
        System.out.println("---------------------");

        int opcionEncontrar = 0;

        while (opcionEncontrar != 1 && opcionEncontrar != 2) {
            System.out.println("\uD83D\uDE46\n1. Encontrar Cliente por ID\n2. Encontrar Cliente por Nombre y Apellido");
            try {
                opcionEncontrar = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\n⚠️ Ingrese una opción válida!\n");
                input.nextLine();
            }
        }

        switch (opcionEncontrar) {
            case 1: // Por id
                System.out.print("Ingresar ID: ");
                idCliente = input.nextLine();

                Cliente clienteID = obtenerCliente(idCliente);

                if (clienteID != null) {

                } else {
                    System.out.println("\n⚠️ ¿Desea intentar de nuevo?\n");
                }

            case 2: // Por nombre y apellido
                while (true) {
                    System.out.print("Ingrese su nombre: ");
                    nombreCliente = input.next();
                    input.nextLine();

                    System.out.print("Ingrese su apellido: ");
                    apellidoCliente = input.next();

                    Cliente clienteNA = obtenerClientePorNombre(nombreCliente, apellidoCliente);

                    if (clienteNA != null) {


                    }
                }
        }

    }

    public static void opcionesModificarClientes() {
        System.out.println("-  -");
    }



/*
    public boolean habilitarSolicitudCredito(TarjetaDebito tarjetaDebito) {
        // Habilitar la opción de solicitar tarjeta de crédito si el saldo de débito es suficiente
        return tarjetaDebito.getSaldo() >= 30000;
    }

    public void solicitarTarjetaCredito(TarjetaCredito tarjetaCredito, Cliente cliente) {
        // Solicitar tarjeta de crédito si se cumple la condición
        if (habilitarSolicitudCredito() && !tarjetaCredito.isAsignada()) {
            tarjetaCredito.asignar();
            System.out.println(cliente.getNombre() + " ha solicitado y se le ha asignado una tarjeta de crédito");
        } else if (tarjetaCredito.isAsignada()) {
            System.out.println(cliente.getNombre() + " ya tiene una tarjeta de crédito asignada");
        } else {
            System.out.println(cliente.getNombre() + " no cumple con los requisitos para solicitar una tarjeta de crédito");
        }
    }

  */



}
