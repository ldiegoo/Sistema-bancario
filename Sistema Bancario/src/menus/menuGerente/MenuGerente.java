package menus.menuGerente;
import java.util.Scanner;

public class MenuGerente {
    private Scanner sc = new Scanner(System.in);
    public int mostrarMenu () {

        System.out.println("\n*** BIEVENIDO ***");
        System.out.println("1. Registrar ");
        System.out.println("2. Registrar medico");
        System.out.println("3. Registrar consultorio");
        System.out.println("4. Registrar consulta");
        System.out.println("5. Mostrar pacientes");
        System.out.println("6. Mostrar medicos");
        System.out.println("7. Mostrar consultorios");
        System.out.println("8. Mostrar consultas");
        System.out.println("9. Mostrar paciente por ID");
        System.out.println("10. Mostrar medicos por ID");
        System.out.println("11. Mostrar consultorios por ID");
        System.out.println("12. Mostrar consultas por ID");
        System.out.println("13. Ver mis datos");
        System.out.println("14. Salir");

        System.out.print("\nSelecciona una opción: ");
        int opcion = sc.nextInt();
        return opcion;

    }

    public void procesarDatosMenu (int opcion) {

        switch (opcion) {

            case 1:

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
