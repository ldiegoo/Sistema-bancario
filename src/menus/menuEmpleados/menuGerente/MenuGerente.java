package menus.menuEmpleados.menuGerente;
import banco.Banco;
import tarjeta.debito.TarjetaDebito;

import java.util.Scanner;

public class MenuGerente {
    static Scanner input = new Scanner(System.in);
    private static TarjetaDebito tarjetaDebito;
    private static Banco banco = new Banco();

    public static void mostarMenuGerente () {
        Banco banco = new Banco();
        int opcion ;

      while (true) {
            opcion = 0;
            while (opcion < 1 || opcion > 7) {
                System.out.println("\n---------------");
                System.out.println("- Operaciones -");
                System.out.println("---------------");
                System.out.println("""
                        1. Agregar Cliente ➕
                        2. Eliminar Cliente ➖
                        3. Mostrar Clientes \uD83D\uDC64
                        4. Agregar Ejecutivo ➕
                        5. Eliminar Ejecutivo ➖
                        6. Mostrar Ejecutivos 👷
                        7. Retirar Dinero\uD83D\uDCB8
                        8. Depositar Dinero \uD83D\uDCB5
                        9. Salir 🚪
                       """);
                System.out.print("Ingrese una opción: ");

                try {
                    opcion = input.nextInt();
                    if (opcion < 1 || opcion > 9) {
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

                case 3:
                    Banco.mostrarClientes();
                case 4:
                    banco.registracionEmpleado();
                    break;
                case 5:

                    break;
                case 6:
                    //banco.mostrarEjecutivos();
                    break;
                case 7:
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
                case 8:
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
                    case 9:

                        System.out.println("¡¡Hasta luego, regresa pronto!!");
                    return;


            }
        }
    }
}