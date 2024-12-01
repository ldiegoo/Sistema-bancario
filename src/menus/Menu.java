package menus;

import banco.Banco;
import usuario.Usuario;
import usuario.cliente.Cliente;
import usuario.empleado.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);

    static int intentos = 5;
    static Banco banco = new Banco();

    public int rol() {
        int opcion = 0;
        while (opcion < 1 || opcion > 3) {
            System.out.println("--------------------");
            System.out.println("- Sistema Bancario -");
            System.out.println("--------------------");
            System.out.println("\uD83C\uDFE6 Bienvenido.");
            System.out.println("1. Cliente \uD83D\uDC64\n2. Empleado \uD83D\uDC77\n3.Salir \uD83D\uDEAA");
            System.out.print("Ingrese la opcion de su rol: ");
            try {
                opcion = input.nextInt();
                if (opcion < 1 || opcion > 3) {
                    System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                    input.nextLine();
                }
            } catch (Exception e) {
                System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                input.nextLine();
            }
        }
        return opcion;
    }

// 🦺📋🔑🛡️👷🙋
    public static Cliente loginCliente() {
        String contrasenia, nombre, apellido;
        System.out.println("\n----------------");
        System.out.println("-Iniciar Sesion-");
        System.out.println("----------------");

        for (int i = 0; i < intentos; i++) {
            System.out.println("\n\uD83D\uDEE1\uFE0F " +(intentos - i) + " intentos restantes\n");
            System.out.println("\uD83D\uDE4B ");
            System.out.print("Ingrese su nombre: ");
            nombre = input.next();
            input.nextLine();

            System.out.print("Ingrese su apellido: ");
            apellido = input.next();


            Cliente cliente = banco.obtenerClientePorNombre(nombre, apellido);
            if (cliente == null) {
                continue;
            }

            while (intentos - i != 0) {
            System.out.print("\uD83D\uDD11 Ingrese su contraseña: ");
            contrasenia = input.next();

                if (contrasenia.equals(cliente.getContrasenia())) {
                    System.out.println("\n\uD83D\uDC4B Bienvenid@, " + cliente.getNombre());
                    return cliente;
                } else {
                    System.out.println("\n⚠\uFE0F Contraseña incorrecta");
                    i++;
                    System.out.println("\n\uD83D\uDEE1\uFE0F " +(intentos - i) + " intentos restantes\n");
                }

            }
        }

        System.out.println("⚠\uFE0F Limite de intentos");
        return null;

    }
    public boolean loginEmpleado() {
        String contrasenia, nombre, apellido;
        System.out.println("\n----------------");
        System.out.println("-Iniciar Sesion-");
        System.out.println("----------------");

        for (int i = 0; i < intentos; i++) {
            System.out.println("\n\uD83D\uDEE1\uFE0F " +(intentos - i) + " intentos restantes\n");
            System.out.println("\uD83D\uDE4B ");
            System.out.print("Ingrese su nombre: ");
            nombre = input.next();
            input.nextLine();

            System.out.print("Ingrese su apellido: ");
            apellido = input.next();


            Empleado empleado = banco.obtenerEmpleadoPorNombre(nombre, apellido);
            if (empleado == null) {
                continue;
            }

            while (intentos - i != 0) {
                System.out.print("\uD83D\uDD11 Ingrese su contraseña: ");
                contrasenia = input.next();

                if (contrasenia.equals(empleado.getContrasenia())) {
                    System.out.println("\n\uD83D\uDC4B Bienvenid@, " + empleado.getNombre());
                    return true;
                } else {
                    System.out.println("\n⚠\uFE0F Contraseña incorrecta");
                    i++;
                    System.out.println("\n\uD83D\uDEE1\uFE0F " +(intentos - i) + " intentos restantes\n");
                }

            }
        }

        System.out.println("⚠\uFE0F Limite de intentos");
        return false;

    }

   /* public void login(){
        Administrador admin = new Administrador (
                "001",
                "Admin",
                "Supremo",
                LocalDate.of(2004,9,17),
                "4452234568",
                "12354",
                10000,
                "refad678",
                2);
        cine.listaAdmin.add(admin);
        int intentos =5;
        Boolean bandera = true;


        while (intentos != 0 ) {
            System.out.println("Ingrese id: ");
            String id = sc.next();
            System.out.println("Ingrese contraseña: ");
            String contrasenia = sc.next();

            // Verificar Admins
            /*for (Administrador a : banco.listaAdmin) {
                if (a.getId().equals(id) && a.getContraseña().equals(contrasenia)) {
                    System.out.println("Bienvenido, administrador " + a.getNombre() + " " + a.getApellido());
                    MenuAdmin menuAdmin = new MenuAdmin();
                    menuAdmin.ejecutarMenu();
                }
            }*/
    /*
            // Verificar Trabajadores
            for (Empleado a : banco.listaTrabajadores) {
                if (a.getId().equals(id) && a.getContraseña().equals(contrasenia)) {
                    System.out.println("Bienvenido, trabajador " + a.getNombre() + " " + a.getApellido());
                    return;
                }
            }
            // Verificar Clientes
            for (Cliente a : c.listaClientes) {
                if (a.getId().equals(id) && a.getContraseña().equals(contrasenia)) {
                    System.out.println("Bienvenido, cliente " + a.getNombre() + " " + a.getApellido());
                    return;
                }
            }
            System.out.println("Id o contrasenia incorrecta");
            intentos--;
            System.out.println("Intentos: " + (intentos));
        }
        System.out.print("Límite de intentos");
    }
}*/
   private boolean validarTelefonoRepetido(ArrayList<? extends Usuario> listaUsuarios, String telefono) {
       for (Usuario usuario : listaUsuarios) {
           if (usuario.getTelefono().equals(telefono)) {
               System.out.println("Ya existe un ususario con ese telefono. Intenta de nuevo");
               return false;
           }
       }
       return true;
   }
}
