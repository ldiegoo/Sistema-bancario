import banco.Banco;
import menus.Menu;
import menus.menuCliente.MenuClientes;
import menus.menuEmpleados.menuEjecutivo.MenuEjecutivo;
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

        /*
        // Gerente
        Empleado ejecutivoEx = new Empleado( "0003", "Ejecutivo", "Ejemplo", "RFC123456", "CURP123456", "Calle Falsa 123", "555-1234", "123", 1, 50000.0, RolTrabajo.EJECUTIVO);
        banco.registrarEmpleado(ejecutivoEx);

        // Ejecutivo
        Empleado gerenteEx = new Empleado( "0002", "Gerente", "Ejemplo", "RFC06666", "CURP06666", "Calle Real 123", "444-1234", "123", 1, 50000.0, RolTrabajo.GERENTE);
        banco.registrarEmpleado(gerenteEx);

        // Cliente
        Cliente clienteEx = new Cliente( "0001", "Cliente", "Ejemplo", "RFC876543", "CURP76543", "Abajo del puente", "4431853891", "123", "2023-12-01", "Sucursal Morelos");
        banco.registrarCliente(clienteEx);

        // Instancia de TarjetaCredito
        // TarjetaCredito tarjetaCredito = new TarjetaCredito( "Cliente Ejemplo", "1234 5678 9012 3456", LocalDate.of(2023, 1, 15), "123", "012345678901234567", LocalDate.of(2026, 12, 31), 15000.0, false );

        // Instancia de TarjetaDebito

         TarjetaDebito tarjetaDebito = new TarjetaDebito( "Cliente Ejemplo", "9876 5432 1098 7654", LocalDate.of(2022, 6, 20), "456", "765432109876543210", LocalDate.of(2025, 11, 30), 5000.0);
        //Banco.registrarTarjetaCredito(tarjetaCredito);
        Banco.registrarTarjetaDebito(tarjetaDebito);
        */



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
                        MenuEjecutivo.mostrarMenu();
                    }
                case 3:
                    System.out.println("\n\uD83D\uDC4B Hasta luego!");
                    return;
            }

        }


    }

}