import banco.Banco;
import menus.Menu;
import menus.menuCliente.MenuClientes;
import usuario.cliente.Cliente;
import usuario.empleado.Empleado;
import utils.RolTrabajo;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;




public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        Menu menu = new Menu();

        // Crear archivo clientes
        File archivoClientes = new File(System.getProperty("user.dir") + "/clientes.bin");
        if (!archivoClientes.exists()) {
            try (FileOutputStream archivoEscribir = new FileOutputStream(archivoClientes);
                 ObjectOutputStream out = new ObjectOutputStream(archivoEscribir)) {
                System.out.println("Archivo de clientes generado con exito");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Crear archivo empleados
        File archivoEmpleados = new File(System.getProperty("user.dir") + "/empleados.bin");
        if (!archivoEmpleados.exists()) {
            try (FileOutputStream archivoEscribir = new FileOutputStream(archivoEmpleados);
                 ObjectOutputStream out = new ObjectOutputStream(archivoEscribir)) {
                System.out.println("Archivo de empleados generado con exito");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
        Cliente cliente = new Cliente("004", "Ana", "Martínez", "ANMA123456", "CURP345678", "Calle de la Amargura 789", "555-4321", "password321","2024-04-01", "Dirección 4", "Sucursal 4");
        banco.registrarCliente(cliente);

        Empleado empleado = new Empleado("002", "Laura", "García", "LAGA123456", "CURP234567", "Avenida Central 456", "555-6789", "password456", "Sucursal Norte", 60000.0, RolTrabajo.GERENTE);
        banco.registrarEmpleado(empleado);
        */

        while (true) {

            switch (menu.rol()) {
                case 1:
                    MenuClientes.menu(Menu.loginCliente());
                    break;

                case 3:
                    System.out.println("\n\uD83D\uDC4B Hasta luego!");
                    return;
            }

        }



    }
}