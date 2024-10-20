package menu;

import java.util.Scanner;

public class MenuCinepolito {
    final Scanner input = new Scanner(System.in);

    public void mostrarMenu(){
        int opcion = 0;
        while(opcion!=14){
            System.out.println("1. Agregar Funciones");
            System.out.println("2. Modificar Funciones");
            System.out.println("3. Listar Funciones");
            System.out.println("4. Eliminar Funciones");
            System.out.println("5. Mirar Boletos");
            System.out.println("6. Mirar Productos");
            System.out.println("7. Eliminar Productos");
            System.out.println("8. Mirar carrito");
            System.out.println("9. Revisar disponibilidad de la sala");
            System.out.println("10. Listar salas");
            System.out.println("11. Agregar Promociones");
            System.out.println("12. Modificar Promociones");
            System.out.println("13. Eliminar Promociones");
            System.out.println("14. Cerrar Sesion");
            System.out.println("\nSelecciona una opcion: ");
            opcion = input.nextInt();
        }
    }
}
