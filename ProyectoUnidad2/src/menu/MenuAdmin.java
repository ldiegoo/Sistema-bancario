package menu;
import carrito.Carrito;
import cine.Cine;
import funcion.Funcion;
import java.time.LocalDate;
import java.util.Scanner;
import pelicula.Pelicula;
import producto.Producto;
import usuario.trabajador.Trabajador;

public class MenuAdmin {
    final Scanner input = new Scanner(System.in);
    static Cine cine = new Cine();
    static Carrito carrito = new Carrito();

    public void ejecutarMenu(){
        int opcion = 0;
        while (opcion != 11) {
        System.out.println("BIENVENIDO QUERIDO ADMINISTRADOR");
        System.out.println("1. Registrar Cinepolito");
        System.out.println("2. Listar Cinepolito");
        System.out.println("3. Eliminar Cinepolito");
        System.out.println("4. Registrar Cliente");
        System.out.println("5. Listar Cliente");
        System.out.println("6. Agregar Funciones");
        System.out.println("7. Listar Funciones");
        System.out.println("8. Eliminar Funciones");
        System.out.println("9. Mirar Productos");
        System.out.println("10. Eliminar Productos");
        System.out.println("11. Cerrar Sesion");

        System.out.println("\nSelecciona una opcion: ");
        opcion = input.nextInt();

        

        switch (opcion){
            case 1:System.out.println("Seleccionaste la opcion de registrar cinepolito");
                System.out.println("Ingresa el nombre del trabajador: ");
                String nombre = input.nextLine();
                input.nextLine();
                System.out.println("Ingresa el apellido del trabajador: ");
                String apellido = input.nextLine();
                input.nextLine();
                System.out.println("Año de nacimiento: ");
                int anioNacimiento = input.nextInt();
                input.nextLine();
                System.out.println("Ingresa el mes de nacimiento: ");
                int mesNacimiento = input.nextInt();
                input.nextLine();
                System.out.println("Ingresa el dia de nacimiento: ");
                int diaNacimiento = input.nextInt();
                input.nextLine();
                System.out.println("Ingresa la direccion del trabajador: ");
                String direccion = input.nextLine();
                input.nextLine();
                System.out.println("Ingresa el rfc del trabajador: ");
                String rfc = input.nextLine();
                input.nextLine();
                System.out.println("Ingresa el sueldo del trabajador: ");
                double sueldo = input.nextDouble();
                input.nextLine();
                System.out.println("Ingresa el telefono del trabajador: ");
                String telefono = input.nextLine();
                input.nextLine();
                System.out.println("Ingresa la contraseña del trabajador: ");
                String contraseniaTrabajador = input.nextLine();
                LocalDate fechaRegistro = LocalDate.now();
                LocalDate fechaActual = LocalDate.now();

                int antiguedad = fechaRegistro.getYear() - fechaActual.getYear();
                LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
                String IdTrabajador = cine.generarIdTrabajador(apellido, nombre, String.valueOf(fechaNacimiento));
                cine.registrarTrabajador(IdTrabajador, nombre, apellido, fechaNacimiento, direccion, rfc, sueldo, telefono, contraseniaTrabajador, antiguedad);

                break;
            case 2:
                System.out.println("Seleccionaste la opción de listar trabajadores.");
                cine.mostrarTrabajadores();
                break;
            case 3:
                System.out.println("Seleccionaste la opcion de eliminar cinepolito");
                System.out.println("Ingrese el id del trabajador");
                String id = input.next();
                for (Trabajador t : cine.listaTrabajadores) {
                    if (id.equals(t.getId())) {
                        cine.listaTrabajadores.remove(t);
                        System.out.println("Cinepolito eliminado con exito");
                        return;
                    }
                }
                System.out.println("Id no coincide");
                break;
            case 4:
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
            case 5:
                System.out.println("Seleccionaste la opcion de listar cliente");
                cine.mostrarClientes();
                break;
            case 6:
                System.out.println("Seleccionaste la opcion de agregar funciones");
                System.out.println("Ingresar Id de la pelicula: ");
                String Id= input.nextLine();
                Pelicula pelicula = cine.obtenerPeliculaId(Id);
                System.out.println("Ingresar Id de la sala: ");
                String IdSala= input.nextLine();
                System.out.println("Ingresa el horario de la funcion: ");
                String horario = input.nextLine();
                cine.generarIdFuncion(pelicula, horario); 
                break;
            case 7:
                System.out.println("Seleccionaste la opcion de listar funciones");
                for (Funcion f : cine.listaFunciones) {
                    System.out.println(f.getPelicula() + " -> " + f.getHorario());
                }
                break;
            case 8:
                System.out.println("Seleccionaste la opcion de eliminar funciones");
                System.out.print("Ingresar id Funcion: ");
                id = input.next();
                for (Funcion f : cine.listaFunciones) {
                    if (id.equals(f.getId())) {
                        cine.listaAdmin.remove(f);
                        System.out.println("Funcion eliminada con exito");
                        return;
                    }
                }
                break;
            case 9:
                System.out.println("Seleccionaste la opcion de mirar productos");
                for (Producto p : cine.listaProductos) {
                    System.out.println(p.getNombre() + " \t--- "+p.getPrecio());
                }
                break;
            case 10:
                System.out.println("Seleccionaste la opcion de eliminar productos");
                System.out.print("Ingresar id del Producto: ");
                id = input.next();
                for (Producto p : cine.listaProductos) {
                    if (id.equals(p.getId())) {
                        cine.listaProductos.remove(p);
                        System.out.println("Producto eliminada con exito");
                        return;
                    }
                }
                break;
            case 11:
                System.out.println("HASTA LUEGO, QUERIDO ADMINGod");
                break;
            }
        }}
    }