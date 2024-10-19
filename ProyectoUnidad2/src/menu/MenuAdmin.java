package menu;
import cine.Cine;
import java.time.LocalDate;
import java.util.Scanner;

public class MenuAdmin {
    final Scanner input = new Scanner(System.in);
    static Cine cine = new Cine();


    public int mostrarMenu() {
        int opcion=0;

        System.out.println("BIENVENIDO QUERIDO ADMINISTRADOR");
        System.out.println("1. Registrar Cinepolito");
        System.out.println("2. Listar Cinepolito");
        System.out.println("3. Eliminar Cinepolito");
        System.out.println("4. Registrar Cliente");
        System.out.println("5. Listar Cliente");
        System.out.println("6. Eliminar Cliente");
        System.out.println("7. Agregar Funciones");
        System.out.println("8. Modificar Funciones");
        System.out.println("9. Listar Funciones");
        System.out.println("10. Eliminar Funciones");
        System.out.println("11. Mirar Boletos");
        System.out.println("12. Mirar Productos");
        System.out.println("13. Eliminar Productos");
        System.out.println("14. Mirar carrito");
        System.out.println("13. Revisar disponibilidad de la sala");
        System.out.println("14. Listar salas");
        System.out.println("15. Agregar Promociones");
        System.out.println("16. Modificar Promociones");
        System.out.println("17. Eliminar Promociones");
        System.out.println("18. Cerrar Sesion");

        System.out.println("\nSelecciona una opcion: ");
        opcion=input.nextInt();
        return opcion;
    }
    public void ejecutarMenuAdmin(int opcion){
        switch (opcion){
            case 1:System.out.println("Seleccionaste la opcion de registrar cinepolito");
                System.out.println("Ingresa el nombre del trabajador: ");
                String nombre = input.nextLine();
                System.out.println("Ingresa el apellido del trabajador: ");
                String apellido = input.nextLine();
                System.out.println("Ingresa la fecha de nacimiento del trabajador: ");
                System.out.println("Ingresa el año de nacimiento: ");
                int anioNacimiento = input.nextInt();
                System.out.println("Ingresa el mes de nacimiento: ");
                int mesNacimiento = input.nextInt();
                System.out.println("Ingresa el dia de nacimiento: ");
                int diaNacimiento = input.nextInt();
                System.out.println("Ingresa la direccion del trabajador: ");
                String direccion = input.nextLine();
                System.out.println("Ingresa el rfc del trabajador: ");
                String rfc = input.nextLine();
                System.out.println("Ingresa el sueldo del trabajador: ");
                double sueldo = input.nextDouble();
                System.out.println("Ingresa el telefono del trabajador: ");
                String telefono = input.nextLine();
                System.out.println("Ingresa la contrasenia del trabajador: ");
                String contraseña = input.nextLine();
                LocalDate fechaRegistro = LocalDate.now();
                LocalDate fechaActual = LocalDate.now();


                int antiguedad = fechaRegistro.getYear() - fechaActual.getYear();
                LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
                String IdTrabajor = cine.generarIdTrabajador(apellido, nombre, String.valueOf(fechaNacimiento));
                cine.registrarTrabajador(rfc, nombre, apellido, fechaNacimiento, direccion, rfc, sueldo, telefono, contraseña, antiguedad);

                //String id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String rfc, Double sueldo, String telefono, String contrasenia, int antiguedad
                break;
            case 2:
                System.out.println("Seleccionaste la opcion de listar cinepolito");
                break;
            case 3:
                System.out.println("Seleccionaste la opcion de eliminar cinepolito");
                break;
            case 4:
                System.out.printf("Seleccionaste la opcion de registrar cliente");
                break;
            case 5:
                System.out.println("Seleccionaste la opcion de listar cliente");
                break;
            case 6:
                System.out.println("Seleccionaste la opcion de eliminar cliente");
                break;
            case 7:
                System.out.printf("Seleccionaste la opcion de agregar funciones");
                break;
            case 8:
                System.out.printf("Seleccionaste la opcion de modificar funciones");
                break;
            case 9:
                System.out.printf("Seleccionaste la opcion de listar funciones");
                break;
            case 10:
                System.out.println("Seleccionaste la opcion de eliminar funciones");
                break;
            case 11:
                System.out.println("Seleccionaste la opcion de mirar boletos");
                break;
            case 12:
                System.out.println("Seleccionaste la opcion de mirar productos");
                break;
            case 13:
                System.out.println("Seleccionaste la opcion de eliminar productos");
                break;
            case 14:
                System.out.println("Seleccionaste la opcion de mirar carrito");
                break;
            case 15:
                System.out.println("Seleccionaste la opcion de agregar promociones");
                break;
            case 16:
                System.out.println("Seleccionaste la opcion de modificar promociones");
                break;
            case 17:
                System.out.println("Seleccionaste la opcion de eliminar promociones");
                break;
            case 18:
                System.out.println("Seleccionaste la opcion de cerrar sesion");
                System.out.println("HASTA LUEGO, QUERIDO ADMIN");
                break;
        }
    }


}
