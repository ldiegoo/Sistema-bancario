package menus.menuCliente;

import banco.Banco;
import tarjeta.credito.TarjetaCredito;
import tarjeta.debito.TarjetaDebito;
import usuario.cliente.Cliente;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

import static banco.Banco.obtenerTarjetaCredito;
import static banco.Banco.obtenerTarjetaDebito;

public class MenuClientes {

    static Scanner input = new Scanner(System.in);
    private static TarjetaDebito tarjetaDebito;
    private static Banco banco = new Banco();
    public static void menu (Cliente cliente) {
        int opcion ;

        while (true) {
            opcion = 0;
            while (opcion < 1 || opcion > 4) {
                System.out.println("\n---------------");
                System.out.println("- Operaciones -");
                System.out.println("---------------");
                System.out.println("""
                        1. Ver Datos de Tarjeta \uD83D\uDCCA
                        2. Retirar \uD83D\uDCB8
                        3. Depositar \uD83D\uDCB5
                        4. Pagar 
                        5. Solicitar Tarjeta Credito 
                        6. Salir \uD83D\uDEAA
                        """);
                System.out.print("Ingrese una opción: ");

                try {
                    opcion = input.nextInt();
                    if (opcion < 1 || opcion > 5) {
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
                    verDatos(cliente);
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("-- Ingresaste la opcion de retirar dinero de tu tarjeta --");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Ingrese la tarjeta: ");
                    String numTarjetaRetirar= input.nextLine();
                    input.nextLine();
                    double cantidadRetirar = 0;
                    while (cantidadRetirar <= 0) {
                        System.out.println("Ingresa la cantidad a retirar: ");
                        try {
                            cantidadRetirar = input.nextDouble();
                            input.nextLine();
                            tarjetaDebito.retirarDinero(cantidadRetirar);
                            double nuevoSaldo= tarjetaDebito.getSaldo()-cantidadRetirar;
                            banco.modificarTarjetaDebito(System.getProperty("user.dir") + "/tarjetasDebito.bin",numTarjetaRetirar,nuevoSaldo );
                            break;
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
                        System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                    }


                    break;
                case 3:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("-- Ingresaste la opcion de depositar dinero de tu tarjeta --");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Ingrese la tarjeta: ");
                    String numTarjetaDepositar= input.nextLine();
                    double cantidadDepositar = 0;
                    while (cantidadDepositar <= 0) {
                        System.out.println("Ingresa la cantidad a depositar: ");
                        try {
                            cantidadDepositar = input.nextDouble();
                            tarjetaDebito.ingresarDinero(cantidadDepositar);
                            double nuevoSaldo= tarjetaDebito.getSaldo()+cantidadDepositar;
                            banco.modificarTarjetaDebito(System.getProperty("user.dir") + "/tarjetasDebito.bin",numTarjetaDepositar,nuevoSaldo);

                            break;
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
                        System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                    }
                    break;
                case 4:
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("-- Ingresaste la opcion de pagar con tu tarjeta --");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Ingrese la tarjeta: ");
                    String numTarjetaPagar= input.nextLine();
                    double cantidadPagar = 0;
                    while (cantidadPagar <= 0) {
                        System.out.println("Ingresa la cantidad a pagar: ");
                        try {
                            cantidadPagar = input.nextDouble();
                            tarjetaDebito.ingresarDinero(cantidadPagar);
                            double nuevoSaldo=tarjetaDebito.getSaldo()-cantidadPagar;
                            banco.modificarTarjetaDebito(System.getProperty("user.dir") + "/tarjetasDebito.bin",numTarjetaPagar,nuevoSaldo);

                            break;
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
                        System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                    }
                    break;
                case 5:
                    banco.solicitarTarjetaCredito(cliente.getNombre(), cliente.getApellidos());
                    break;
                case 6:
                    return;
            }
        }

    }

    public static void verDatos (Cliente cliente) {
        String opcionVerDatos;
        String nombreCompleto = cliente.getNombre() + " " + cliente.getApellidos();
        TarjetaDebito tarjetaDebito = obtenerTarjetaDebito(cliente.getNombre(), cliente.getApellidos());

        System.out.println("\n---------");
        System.out.println("- Datos -");
        System.out.println("---------\n");

        assert tarjetaDebito != null;
        String datos = String.format("""
                Titular: %s
                💳 Tarjeta de Debito
                Numero de tarjeta: %s
                Fecha de vencimiento: %s
                CVV: %s
                Saldo: %.2f""", nombreCompleto, tarjetaDebito.getNumTarjeta(), tarjetaDebito.getFechaVencimiento(), tarjetaDebito.getCVV(), tarjetaDebito.getSaldo());
        System.out.println(datos);

        if (Banco.obtenerTarjetaCredito(cliente.getNombre(), cliente.getApellidos()) != null) {
            TarjetaCredito tarjeta2 = obtenerTarjetaCredito(cliente.getNombre(), cliente.getApellidos());
            assert tarjeta2 != null;

            String datos2 = String.format("""
                    💳 Tarjeta de Credito
                    Numero de tarjeta: %s
                    Fecha de vencimiento: %s
                    CVV: %s
                    Credito: %.2f
                    """, tarjeta2.getNumTarjeta(), tarjeta2.getFechaVencimiento(), tarjeta2.getCVV(), tarjeta2.getCredito());
            System.out.println(datos2);
        }

        System.out.println("Ingrese cualquier tecla para salir \uD83D\uDEAA");
        opcionVerDatos = input.next();
    }

    public static void retirar (Cliente cliente) {
        int cantidad = 0;

        System.out.println("\n------------");
        System.out.println("- Retirar -");
        System.out.println("-----------\n");

        while (cantidad != 0) {
            System.out.print("Ingrese cantidad deseada a retirar: ");

            try {
                cantidad = input.nextInt();
                if (cantidad < 1) {
                    System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                } else if (cantidad > 1500) { // cambiar por el limite
                    System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                }
            } catch (Exception e) {
                System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
            }
        }
    }






}
