package menu;

import java.util.Scanner;

public class MenuAdmin {
    final Scanner input = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion=0;

        while(opcion!=5){
            System.out.println("***BIENVENIDO QUERIDO ADMINISTRADOR***");
            System.out.println("1. Registrar Cinepolito");
            System.out.println("2. Listar Cinepolito");
            System.out.println("3. Eliminar Cinepolito");
            System.out.println("4. Registrar Cliente");
            System.out.println("5. Listar Cliente");
            System.out.println("6. Eliminar Cliente");
            System.out.println("7. Agregar Funciones");
            System.out.println("8. Modificar Funciones");
            System.out.println("9. Listar Funciones");
            System.out.println("10. Eliminar Funciones");
            System.out.println("11. Mirar Boletos");
            System.out.println("12. Mirar Productos");
            System.out.println("13. Eliminar Productos");
            System.out.println("14. Mirar carrito");
            System.out.println("13. Revisar disponibilidad de la sala");
            System.out.println("14. Listar salas");
            System.out.println("15. Agregar Promociones");
            System.out.println("16. Modificar Promociones");
            System.out.println("17. Eliminar Promociones");
            System.out.println("18. Cerrar Sesion");

            System.out.println("\nSelecciona una opcion: ");
            opcion=input.nextInt();
        }
    }

}
