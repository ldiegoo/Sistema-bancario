package menus.menuCliente;

import usuario.cliente.Cliente;

import java.util.Scanner;

public class MenuClientes {

    static Scanner input = new Scanner(System.in);

    public static void menu (Cliente cliente) {
        int opcion = 0;

        while (opcion < 1 || opcion > 4) {
            System.out.println("\n---------------");
            System.out.println("- Operaciones -");
            System.out.println("---------------");
            System.out.println("1. Ver Datos de Tarjeta \uD83D\uDCCA\n2. Retirar \uD83D\uDCB8\n3. Depositar \uD83D\uDCB5\n4. Salir \uD83D\uDEAA");
            System.out.print("Ingrese una opción: ");
            opcion = input.nextInt();
            input.nextLine();
            try {
                opcion = input.nextInt();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                    input.nextLine();
                }
            } catch (Exception e) {
                System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                input.nextLine();
            }
        }

        switch (opcion) {
            // Ver datos
            case 1:
                verDatos(cliente);
                break;
            case 2:

            case 4:
                break;



        }


    }

    public static void verDatos (Cliente cliente) {
        System.out.println("\n---------");
        System.out.println("- Datos -");
        System.out.println("---------");

        System.out.println("Dato 1");
        System.out.println("Dato 2");

        System.out.println("Ingrese enter para salir \uD83D\uDEAA");
        input.nextLine();
    }

    public static void retirar (Cliente cliente) {
        int cantidad = 0;

        System.out.println("\n------------");
        System.out.println("- Retirar -");
        System.out.println("-----------");

        System.out.println(" ");

        while (cantidad != 0) {
            System.out.print("Ingrese cantidad deseada a retirar: ");

            try {
                cantidad = input.nextInt();
                if (cantidad < 1) {
                    System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                } else if (cantidad > 1500) { // cambiar por el limite
                    System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                }
            } catch (Exception e) {
                System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
            }
        }
    }






}
