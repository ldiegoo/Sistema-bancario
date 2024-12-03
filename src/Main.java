import banco.Banco;
import menus.Menu;
import menus.menuCliente.MenuClientes;
import menus.menuEmpleados.menuGerente.MenuGerente;
import tarjeta.credito.TarjetaCredito;
import tarjeta.debito.TarjetaDebito;
import usuario.cliente.Cliente;
import usuario.empleado.Empleado;
import utils.RolTrabajo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;


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

        // Crear archivo tarjetas Credito
        File archivoTarjetasCredito = new File(System.getProperty("user.dir") + "/tarjetasCredito.bin");
        if (!archivoTarjetasCredito.exists()) {
            try (FileOutputStream archivoEscribir = new FileOutputStream(archivoTarjetasCredito);
                 ObjectOutputStream out = new ObjectOutputStream(archivoEscribir)) {
                System.out.println("Archivo de tarjetas de Credito generado con exito");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Crear archivo tarjetas Debito
        File archivoTarjetasDebito = new File(System.getProperty("user.dir") + "/tarjetasDebito.bin");
        if (!archivoTarjetasDebito.exists()) {
            try (FileOutputStream archivoEscribir = new FileOutputStream(archivoTarjetasDebito);
                 ObjectOutputStream out = new ObjectOutputStream(archivoEscribir)) {
                System.out.println("Archivo de tarjetas de Debito generado con exito");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Empleado empleado = new Empleado( "12345", "alex", "tremo", "RFC123456", "CURP123456", "Calle Falsa 123", "555-1234", "123", 1, 50000.0, RolTrabajo.GERENTE);
        // banco.registrarEmpleado(empleado);


        //Cliente clienteEx = new Cliente( "001", "Carlos", "González", "RFC123456", "CURP123456", "Av. Siempre Viva 742", "555-1234", "contraseniaSegura", "2023-12-01", "Sucursal Centro");
        //TarjetaCredito tarjetaCreditoEx = new TarjetaCredito( "Carlos González", "1234-5678-9012-3456", LocalDate.of(2023, 12, 1), "123", "012345678901234567", LocalDate.of(2026, 12, 1), LocalDate.of(2023, 12, 1), 50000.0, false);
        //TarjetaDebito tarjetaDebitoEx = new TarjetaDebito( "Carlos González", "6543-2109-8765-4321", LocalDate.of(2023, 12, 1), "456", "765432109876543210", LocalDate.of(2026, 12, 1), LocalDate.of(2023, 12, 1), 15000.0);

        //banco.registrarCliente(clienteEx);
        //Banco.registrarTarjetaCredito(tarjetaCreditoEx);
        //Banco.registrarTarjetaDebito(tarjetaDebitoEx);


        while (true) {

            switch (menu.rol()) {
                case 1:
                    Cliente cliente = Menu.loginCliente();
                    MenuClientes.menu(cliente);
                    break;
                case 2:
                    Empleado empleado = Menu.loginEmpleado();
                    assert empleado != null;
                    if (empleado.getRol() == RolTrabajo.GERENTE) { // Menu Gerente
                        MenuGerente.mostarMenuGerente();
                    } else { // Menu Ejecutivo

                    }
                case 3:
                    System.out.println("\n\uD83D\uDC4B Hasta luego!");
                    return;
            }

        }



        // System.out.println(banco.obtenerEmpleado("12345"));
        // System.out.println(banco.obtenerCliente("12345"));

        //Menu.loginCliente();
        //banco.registracionCliente();


        //MenuClientes.menu(Banco.obtenerCliente("001"));

    }
}