package menus.menuEmpleados.menuEjecutivo;

import java.util.Scanner;

public class MenuEjecutivo {
    private Scanner input = new Scanner(System.in);

    public void menu () {
        int opcion;

        while (true) {
            opcion = 0;
            while (opcion < 1 || opcion > 4) {
                System.out.println("\n---------------");
                System.out.println("- Operaciones -");
                System.out.println("---------------");
                System.out.println("1.");
                System.out.print("Ingrese una opción: ");

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
                    break;
                case 2:

                case 3:

                case 4:
                    return;


            }
        }
    }
}
