package menu;

import cine.Cine;
import funcion.Funcion;
import java.util.Scanner;
import producto.Producto;

public class MenuCliente {
    final Scanner input = new Scanner(System.in);
    Cine cine = new Cine();

    public void mostrarMenuCliente(){
    int opcion;
        do {
            System.out.println("\n--- Menú Cliente ---");
            System.out.println("1. Comprar Boleto");
            System.out.println("2. Comprar Productos");
            System.out.println("3. Ver Películas Disponibles");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para comprar boleto
                    System.out.println("Funciones: ");
                    System.out.println("TITULO\tHORARIO\tID");
                    for (Funcion f : cine.listaFunciones) {
                        System.out.println(f.getPelicula().getTitulo() + "\t" + f.getHorario() + "\t" + f.getId());
                    }
                    System.out.print("Ingresar Id: ");
                    String id = input.next();
                    // Comprobar id
                    for (Funcion f : cine.listaFunciones) {
                        if (id.equals(String.valueOf(f.getId()))) {
                            // Seleccionar el asiento
                            int cont=0;
                            int comprarOtro=3;
                            while(cont==0||comprarOtro==1)
                            System.out.println("Elegir tipo de asiento:\n1.VIP\n2.PREMIUM\n3.NORMAL");
                            int tipoAsiento = input.nextInt();

                            if (tipoAsiento >= 1 || tipoAsiento <=3) {
                                //int precioBoleto;
                                //switch (tipoAsiento) {
                                    //case 1 -> continue;
                                            

                                    //case 2 -> ;
                                    //case 3 -> ;
                                //}
                            } else {
                                System.out.println("Opcion no incluida");
                            }

                            System.out.println("Seleccionar fila: ");
                            int fila = input.nextInt();

                            System.out.println("Seleccionar columna: ");
                            int columna = input.nextInt();

                            char letraColumna = 'x';
                            switch (columna) {
                                case 1:
                                letraColumna = 'A';
                                    break;
                                case 2:
                                letraColumna = 'B';
                                    break;
                                case 3:
                                letraColumna = 'C';
                                    break;
                                case 4: 
                                letraColumna = 'D';    
                                    break;
                                case 5:
                                letraColumna = 'E';    
                                    break;
                                case 6:
                                letraColumna = 'F';    
                                    break;
                                case 7:
                                letraColumna = 'G';    
                                    break;
                                case 8:
                                letraColumna = 'H';    
                                    break;
                                case 9:
                                letraColumna = 'I';    
                                    break;
                                case 10: 
                                letraColumna = 'J';    
                                    break;
                                case 11:
                                letraColumna = 'K';    
                                    break;
                                case 12:
                                letraColumna = 'L';    
                                    break;
                                
                            }
                            System.out.println("¿Desea comprar otro boleto?");
                            System.out.println("1. SI");
                            System.out.println("2. NO");
                            comprarOtro = input.nextInt(); 
                            if (comprarOtro != 1) {
                                System.out.println("Tu boleto comprado es el "+ letraColumna + fila);
                                return;
                            }
                            System.out.println("Tu boleto comprado es el"+ letraColumna + fila);
                        }
                    }
                    System.out.println("Id no encontrado");
                    break;
                case 2:
                    System.out.println("Producto\tPrecio\tId");
                    for (Producto p : cine.listaProductos) {
                        System.out.println(p.getNombre() + "\t--" + p.getPrecio() + "\t--" + p.getId());
                    }
                    System.out.print("Ingrese id del producto: ");
                    String idProducto = input.next();
                    
                    System.out.println("Producto agregado al carrito");
                    break;
                case 3:
                    // Lógica para ver películas disponibles
                    System.out.println("Funciones: ");
                    System.out.println("TITULO\tHORARIO\tID");
                    for (Funcion f : cine.listaFunciones) {
                        System.out.println(f.getPelicula().getTitulo() + "\t" + f.getHorario() + "\t" + f.getId());
                    }
                    break;
                case 4:
                    System.out.println("Hasta luego cliente, vuelva pronto");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");               
            }
        } while (opcion != 4);
    }
}
