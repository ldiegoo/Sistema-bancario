package menus.menuEjecutivo;

import java.util.Scanner;

public class MenuEjecutivo {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu () {
        System.out.println("\n*** BIEVENIDO ***");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Autorizar Solicitudes ");
        System.out.println("3. Realizar Operaciones En Tarjetas de los clientes ");
        System.out.println("4. Salir");

        System.out.print("\nSelecciona una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public void procesarDatosMenu (int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Elegiste la opción de registrar un cliente\n");
                System.out.println("Ingresa el nombre del cliente: ");
                String nombre = sc.nextLine();

                System.out.println("Ingresa los apellidos del cliente: ");
                String apellidos = sc.nextLine();

                System.out.println("||| Se Regristro Exitosamente, Saludos " + nombre + "\n" + apellidos + " |||");


                break;

            case 2:
                System.out.println("Elegiste la opción de autorizar solicitudes\n");

                break;

            case 3:
                System.out.println("Elegiste la opción de realizar operaciones en tarjetas\n");
                break;

            case 4:
                System.out.println(" Adios Guapo ;) ");
                break;

            default:
                System.out.println(" Esa Opción No Esta Disponible ヽ ಠ_ಠ ノ .");
        }
    }
}

