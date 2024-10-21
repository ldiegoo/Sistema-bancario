package menu;

import carrito.Carrito;
import cine.Cine;
import funcion.Funcion;
import java.time.LocalDate;
import java.util.Scanner;
import producto.Producto;
public class MenuCinepolito {
    final Scanner input = new Scanner(System.in);
    Cine cine = new Cine();
    Carrito carrito= new Carrito();
    public int mostrarMenuCinepolito(){
        int opcion = 0;
        while(opcion!=8){
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Agregar Funciones");   
            System.out.println("3. Listar Funciones");
            System.out.println("4. Eliminar Funciones");
            System.out.println("5. Mirar Productos");
            System.out.println("6. Agregar Productos");
            System.out.println("7. Cerrar Sesion");
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
        System.out.println("Seleccionaste la opcion de agregar funciones");
        break;
        case 3:
            System.out.printf("Seleccionaste la opcion de listar funciones");
            
            System.out.println("Seleccionaste la opcion de listar funciones");
                for (Funcion f : cine.listaFunciones) {
                    System.out.println(f.getPelicula() + " -> " + f.getHorario());
                }
                break;
        case 4:
            System.out.println("Seleccionaste la opcion de eliminar funciones");
            System.out.print("Ingresar id Funcion: ");
                String id = input.next();
                for (Funcion f : cine.listaFunciones) {
                    if (id.equals(f.getId())) {
                        cine.listaAdmin.remove(f);
                        System.out.println("Funcion eliminada con exito");
                        return;
                    }
                }
        break;
        case 5:
            System.out.printf("Seleccionaste la opcion de mirar productos");
            for (Producto p : cine.listaProductos) {
                    System.out.println(p.getNombre() + " \t--- "+p.getPrecio());
                }
        break;
        case 6:
            System.out.println("Seleccionaste la opcion de agregar productos");
            carrito.AgregarProducto();
        break;
        case 7:
            System.out.println("Hasta luego, te esperamos pronto para una nueva experiencia llena de emociones con Cinepolis");

        break;
        }
    }
}
