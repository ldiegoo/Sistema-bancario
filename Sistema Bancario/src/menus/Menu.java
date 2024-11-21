package menus;

import usuario.cliente.Cliente;
import usuario.empleado.Empleado;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);


   /* public void login(){
        Administrador admin = new Administrador (
                "001",
                "Admin",
                "Supremo",
                LocalDate.of(2004,9,17),
                "4452234568",
                "12354",
                10000,
                "refad678",
                2);
        cine.listaAdmin.add(admin);
        int intentos =5;
        Boolean bandera = true;


        while (intentos != 0 ) {
            System.out.println("Ingrese id: ");
            String id = sc.next();
            System.out.println("Ingrese contraseña: ");
            String contrasenia = sc.next();

            // Verificar Admins
            /*for (Administrador a : banco.listaAdmin) {
                if (a.getId().equals(id) && a.getContraseña().equals(contrasenia)) {
                    System.out.println("Bienvenido, administrador " + a.getNombre() + " " + a.getApellido());
                    MenuAdmin menuAdmin = new MenuAdmin();
                    menuAdmin.ejecutarMenu();
                }
            }*/
    /*
            // Verificar Trabajadores
            for (Empleado a : banco.listaTrabajadores) {
                if (a.getId().equals(id) && a.getContraseña().equals(contrasenia)) {
                    System.out.println("Bienvenido, trabajador " + a.getNombre() + " " + a.getApellido());
                    return;
                }
            }
            // Verificar Clientes
            for (Cliente a : c.listaClientes) {
                if (a.getId().equals(id) && a.getContraseña().equals(contrasenia)) {
                    System.out.println("Bienvenido, cliente " + a.getNombre() + " " + a.getApellido());
                    return;
                }
            }
            System.out.println("Id o contrasenia incorrecta");
            intentos--;
            System.out.println("Intentos: " + (intentos));
        }
        System.out.print("Límite de intentos");
    }
}*/
}
