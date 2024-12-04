package menus.menuGerente;
import java.util.Scanner;

public class MenuGerente {
    private Scanner sc = new Scanner(System.in);
    public int mostrarMenu () {

        System.out.println("\n*** BIEVENIDO ***");
        System.out.println("1. Gestionar Clientes ");
        System.out.println("2. Gestionar Empleados ");
        System.out.println("3. Salir");

        System.out.print("\nSelecciona una opción: ");
        int opcion = sc.nextInt();
        return opcion;

    }

    public void procesarDatosMenu (int opcion) {

        switch (opcion) {

            case 1:
                System.out.println("\n*** Gestionar Clientes ***");
                break;
            case 2:
                System.out.println("\n*** Gestionar Empleados ***");
                break;
            case 3:
                System.out.println(" Adios Guapo ;) ");
                break;

            default:
                System.out.println(" Esa Opción No Esta Disponible ヽ ಠ_ಠ ノ .");
        }
    }
}
