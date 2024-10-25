package menu;

import cine.Cine;

import java.time.LocalDate;
import java.util.Scanner;

public class MenuCinepolito {
    final Scanner input = new Scanner(System.in);
    Cine cine = new Cine();
    public int mostrarMenuCinepolito(){
        int opcion = 0;
        while(opcion!=14){
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Agregar Funciones");
            System.out.println("3. Modificar Funciones");
            System.out.println("4. Listar Funciones");
            System.out.println("5. Eliminar Funciones");
            System.out.println("6. Mirar Boletos"); //eliminar
            System.out.println("7. Mirar Productos");
            System.out.println("8. Eliminar Productos");
            System.out.println("9. Mirar carrito");
            System.out.println("10. Revisar disponibilidad de la sala");
            System.out.println("11. Listar salas");
            System.out.println("12. Cerrar Sesion");
            System.out.println("\nSelecciona una opcion: ");
            opcion = input.nextInt();
        }
        return opcion;
    }
    public void ejecutarMenu(int opcion){
        switch (opcion){
            case 1:
                System.out.printf("Seleccionaste la opcion de registrar cliente");
                System.out.println("Ingresa el nombre del cliente: ");
                String nombreCliente = input.nextLine();
                System.out.println("Ingresa el apellido del cliente: ");
                String apellidoCliente = input.nextLine();
                System.out.println("Ingresa la fecha de nacimiento del cliente: ");
                System.out.println("Año de nacimiento del cliente: ");
                int anioNacimientoCliente = input.nextInt();
                System.out.println("Ingresa el mes de nacimiento del cliente: ");
                int mesNacimientoCliente = input.nextInt();
                System.out.println("Ingresa el dia de nacimiento del cliente: ");
                int diaNacimientoCliente = input.nextInt();
                System.out.println("Ingresa la direccion del cliente: ");
                String direccionCliente = input.nextLine();
                System.out.println("Ingresa el CURP del cliente: ");
                String CURP = input.nextLine();
                System.out.println("Ingresa la contraseña:");
                String contrasenia = input.nextLine();

                LocalDate fechaNacimientoCliente = LocalDate.of(anioNacimientoCliente, mesNacimientoCliente, diaNacimientoCliente);
                String idCliente = cine.generarIdCliente(apellidoCliente, CURP);
                cine.registrarCliente(idCliente, nombreCliente, apellidoCliente,fechaNacimientoCliente, direccionCliente, CURP,contrasenia );
        break;
        case 2:
            System.out.printf("Seleccionaste la opcion de agregar funciones");
        break;
        case 3:
            System.out.printf("Seleccionaste la opcion de modificar funciones");
        break;
        case 4:
            System.out.printf("Seleccionaste la opcion de listar funciones");
        break;
        case 5:
            System.out.printf("Seleccionaste la opcion de eliminar funciones");
        break;
        case 6:
            System.out.printf("Seleccionaste la opcion de mirar boletos");
        break;
        case 7:
            System.out.printf("Seleccionaste la opcion de mirar productos");
        break;
        case 8:
            System.out.printf("Seleccionaste la opcion de eliminar productos");
        break;
        case 9:
            System.out.printf("Seleccionaste la opcion de mirar carrito");
        break;
        case 10:
            System.out.printf("Seleccionaste la opcion de revisar disponibilidad de la sala");
        break;
        case 11:
            System.out.printf("Seleccionaste la opcion de listar salas");
        break;
        case 12:
            System.out.println("Seleccionaste la opcion de cerrar sesion");
            System.out.println("Hasta luego, te esperamos pronto para una nueva experiencia llena de emociones con Cinepolis");
        break;
        }
    }
}
