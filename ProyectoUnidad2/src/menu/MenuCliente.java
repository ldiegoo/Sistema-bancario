package menu;

import java.util.Scanner;
public class MenuCliente {
    final Scanner input = new Scanner(System.in);

    public void mostrarMenuCliente(){
        int opcion=0;
        while(opcion!=5){
            System.out.println("1. Mirar Boletos");
            System.out.println("2. Mirar Productos");
            System.out.println("3. Mirar Promociones");
            System.out.println("4. Mirar Carrito");
            System.out.println("5. Cerrar Sesion");

            
            System.out.println("\nSelecciona una opcion: ");
            opcion=input.nextInt();
        }
    }
}
