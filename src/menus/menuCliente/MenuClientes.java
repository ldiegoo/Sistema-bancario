package menus.menuCliente;

import banco.Banco;
import tarjeta.credito.TarjetaCredito;
import tarjeta.debito.TarjetaDebito;
import usuario.cliente.Cliente;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Objects;
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
            while (opcion < 1 || opcion > 6) {
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
                    System.out.println("\n-----------");
                    System.out.println("- RETIRAR -");
                    System.out.println("-----------");
                    int opcionRetirar = 0;
                    String numTarjetaRetirar = "";
                    while (opcionRetirar < 1 || opcionRetirar > 2) {
                        System.out.println("1. Debito");
                        if (obtenerTarjetaCredito(cliente.getNombre(), cliente.getApellidos()) != null) {
                            System.out.println("2. Credito");
                        }
                        System.out.print("Ingrese opcion: ");
                        try {
                            opcionRetirar = input.nextInt();
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
                    }

                    if (opcionRetirar == 1) {
                        numTarjetaRetirar = Objects.requireNonNull(obtenerTarjetaDebito(cliente.getNombre(), cliente.getApellidos())).getNumTarjeta();
                    } else {
                        numTarjetaRetirar = Objects.requireNonNull(obtenerTarjetaCredito(cliente.getNombre(), cliente.getApellidos())).getNumTarjeta();
                    }

                    double cantidadRetirar = 0;
                    while (cantidadRetirar <= 0) {
                        System.out.println("Ingresa la cantidad a retirar: (decimal)");
                        try {
                            cantidadRetirar = input.nextDouble();
                            tarjetaDebito.retirarDinero(cantidadRetirar);
                            double nuevoSaldo= tarjetaDebito.getSaldo()-cantidadRetirar;
                            if (opcionRetirar == 1) {
                                Banco.modificarTarjetaDebito(System.getProperty("user.dir") + "/tarjetasDebito.bin", numTarjetaRetirar, nuevoSaldo);
                            }
                            System.out.println("\nRetiro realizado con exito!");
                            input.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
                    }


                    break;
                case 3:
                    System.out.println("-------------");
                    System.out.println("- DEPOSITAR -");
                    System.out.println("--------------");
                    int opcionDepositar = 0;
                    String numTarjetaDepositar = "";
                    while (opcionDepositar < 1 || opcionDepositar > 2) {
                        System.out.println("1. Debito");
                        if (obtenerTarjetaCredito(cliente.getNombre(), cliente.getApellidos()) != null) {
                            System.out.println("2. Credito");
                        }
                        System.out.print("Ingrese opcion: ");
                        try {
                            opcionDepositar = input.nextInt();
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
                    }


                    if (opcionDepositar == 1) {
                        numTarjetaDepositar = Objects.requireNonNull(obtenerTarjetaDebito(cliente.getNombre(), cliente.getApellidos())).getNumTarjeta();
                    } else {
                        numTarjetaDepositar = Objects.requireNonNull(obtenerTarjetaCredito(cliente.getNombre(), cliente.getApellidos())).getNumTarjeta();
                    }




                    double cantidadDepositar = 0;
                    while (cantidadDepositar <= 0) {
                        System.out.println("Ingresa la cantidad a depositar: ");
                        try {
                            cantidadDepositar = input.nextDouble();
                            tarjetaDebito.ingresarDinero(cantidadDepositar);
                            double nuevoSaldo= tarjetaDebito.getSaldo()+cantidadDepositar;
                            if (opcionDepositar == 1) {
                                Banco.modificarTarjetaDebito(System.getProperty("user.dir") + "/tarjetasDebito.bin", numTarjetaDepositar, nuevoSaldo);
                            }
                            System.out.println("Deposito realizado con exito!");
                            input.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
                        System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                    }
                    break;
                case 4:
                    System.out.println("---------");
                    System.out.println("- PAGAR -");
                    System.out.println("---------");
                    int opcionPagar = 0;
                    String numTarjetaPagar = "";
                    while (opcionPagar < 1 || opcionPagar > 2) {
                        System.out.println("1. Debito");
                        if (obtenerTarjetaCredito(cliente.getNombre(), cliente.getApellidos()) != null) {
                            System.out.println("2. Credito");
                        }
                        System.out.print("Ingrese opcion: ");
                        try {
                            opcionPagar = input.nextInt();
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
                    }

                    if (opcionPagar == 1) {
                        numTarjetaPagar = obtenerTarjetaDebito(cliente.getNombre(), cliente.getApellidos()).getNumTarjeta();
                    } else {
                        numTarjetaPagar = obtenerTarjetaCredito(cliente.getNombre(), cliente.getApellidos()).getNumTarjeta();
                    }



                    double cantidadPagar = 0;
                    while (cantidadPagar <= 0) {
                        System.out.println("Ingresa la cantidad a pagar: ");
                        try {
                            cantidadPagar = input.nextDouble();
                            tarjetaDebito.ingresarDinero(cantidadPagar);
                            double nuevoSaldo=tarjetaDebito.getSaldo()-cantidadPagar;
                            if (opcionPagar == 1) {
                                Banco.modificarTarjetaDebito(System.getProperty("user.dir") + "/tarjetasDebito.bin", numTarjetaPagar, nuevoSaldo);
                            }
                            System.out.println("Pago realizado con exito!\n");
                            input.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                            input.nextLine();
                        }
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

        while (cantidad == 0) {
            System.out.print("Ingrese cantidad deseada a retirar: ");

            try {
                cantidad = input.nextInt();
                if (cantidad < 1 || cantidad > 10000) {
                    System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
                }
            } catch (Exception e) {
                System.out.println("\n⚠\uFE0F Ingrese una opcion valida!\n");
            }
        }

        System.out.println("Has retirado: " + cantidad);

    }






}
