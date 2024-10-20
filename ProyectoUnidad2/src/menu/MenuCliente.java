package menu;

import java.util.Scanner;
public class MenuCliente {
    final Scanner input = new Scanner(System.in);

    public int mostrarMenu(){
        int opcion=0;
        while(opcion!=5){
            System.out.println("1. Mirar Funciones");
            System.out.println("2. Mirar Productos");
            System.out.println("3. Mirar Promociones");
            System.out.println("4. Mirar Carrito");
            System.out.println("5. Cerrar Sesion");

            
            System.out.println("\nSelecciona una opcion: ");
            opcion = input.nextInt();
        }
        return opcion;
    }

    public void ejecutarMenu(int opcion) {
        switch(opcion) {
            case 1:
                System.out.println("Funciones:");
                //for (Pelicula pelicula : listaPeliculas) {

                }



        }


    } // fin menuClient

