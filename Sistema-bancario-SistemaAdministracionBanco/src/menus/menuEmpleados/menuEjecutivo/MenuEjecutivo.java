package menus.menuEmpleados.menuEjecutivo;

import banco.Banco;
import menus.menuCliente.MenuClientes;
import tarjeta.debito.TarjetaDebito;

import java.util.Scanner;


public class MenuEjecutivo {
    private Scanner input = new Scanner(System.in);
    private static TarjetaDebito tarjetaDebito;
    private static Banco banco = new Banco();
    private MenuClientes menuCliente= new MenuClientes();

    public void menu () {
        int opcion;

        while (true) {
            opcion = 0;
            while (opcion < 1 || opcion > 4) {
                System.out.println("\n---------------");
                System.out.println("- Operaciones -");
                System.out.println("---------------");
                System.out.println("""
                1.Agregar Cliente ➕
                2.Mostrar Clientes \uD83D\uDC64
                3.Eliminar Cliente ➖
                4.Retirar Dinero \uD83D\uDCB8
                5.Depositar Dinero \uD83D\uDCB5
                6.Salir 🚪
                """);

                System.out.print("Ingrese una opción: ");

                try {
                    opcion = input.nextInt();
                    if (opcion < 1 || opcion > 4) {
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
                    banco.registracionCliente();
                    break;
                case 2:
                    Banco.mostrarClientes();
                    break;
                    case 3:
                        break;
                case 4:
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
                case 5:
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

                case 6:
                    System.out.println("¡¡Hasta luego, regresa pronto!!");
                    return;


            }
        }
    }
}
