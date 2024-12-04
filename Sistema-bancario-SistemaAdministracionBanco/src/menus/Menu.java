package menus;

import banco.Banco;
import usuario.cliente.Cliente;
import usuario.empleado.Empleado;

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
            System.out.print("Ingresar como: ");
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
    public static Empleado loginEmpleado() {
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
                    return empleado;
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


}
