package menus.menuEmpleados.menuGerente;
import banco.Banco;

import java.util.Scanner;

public class MenuGerente {
    static Scanner input = new Scanner(System.in);

    public static void mostarMenuGerente () {
        Banco banco = new Banco();
        int opcion ;

      while (true) {
            opcion = 0;
            while (opcion < 1 || opcion > 7) {
                System.out.println("\n---------------");
                System.out.println("- Operaciones -");
                System.out.println("---------------");
                System.out.println("""
                        1. Agregar Cliente ➕
                        2. Eliminar Cliente ➖
                        3. Mostrar Clientes \uD83D\uDC64
                        4. Agregar Ejecutivo ➕
                        5. Eliminar Ejecutivo ➖
                        6. Mostrar Ejecutivos 👷
                        7. Salir 🚪
                       """);
                System.out.print("Ingrese una opción: ");

                try {
                    opcion = input.nextInt();
                    if (opcion < 1 || opcion > 9) {
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
                    banco.registracionCliente();
                    break;
                case 2: // Modificar Cliente

                case 3:

                case 4:
                    //banco.mostrarClientes();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    return;


            }
        }
    }
}