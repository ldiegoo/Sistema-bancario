package menus.menuEjecutivo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuEjecutivo {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu () {

        System.out.println("\n*** BIEVENIDO ***");
        System.out.println("1. Registrar cliente");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. ");
        System.out.println("8. ");
        System.out.println("9. ");
        System.out.println("10. ");
        System.out.println("11. ");
        System.out.println("12. ");
        System.out.println("13. ");
        System.out.println("14. Salir");

        System.out.print("\nSelecciona una opción: ");
        int opcion = sc.nextInt();
        return opcion;

    }

    public void procesarDatosMenu (int opcion) {

        switch (opcion) {

            case 1:
                System.out.println("Elegiste la opcion de registrar un cliente\n");
                System.out.println("Ingresa el nombre del cliente: ");
                String nombre = sc.next();

                System.out.println("Ingresa los apellidos del cliente: ");
                String apellidos = sc.next();


                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;

            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:
                System.out.println("Hasta luego");
                break;
        }
    }
}
