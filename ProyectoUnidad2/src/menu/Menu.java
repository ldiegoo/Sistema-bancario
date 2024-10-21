package menu;

import cine.Cine;
import java.time.LocalDate;
import java.util.Scanner;
import usuario.Usuario;
import usuario.administrador.Administrador;
import usuario.cliente.Cliente;
import usuario.trabajador.Trabajador;
import utils.Rol;


    public class Menu {
        public Scanner sc = new Scanner(System.in);
        Cine cine = new Cine();
        public void login(){
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
            int intentosMaximos = 5, intentosUsuario = 0;
            Boolean bandera = true;
            
            while (bandera) {
                System.out.println("Bienvenido");
                System.out.println("Iniciar sesion para continuar");

                System.out.print("Ingresa tu usuario: ");
                String Id = sc.nextLine();

                System.out.print("Ingresa tu contraseña: ");
                String contrasenia = sc.nextLine();
                
                Usuario usuarioEnSesion = cine.validarInicioSesion(Id, contrasenia);

                if (usuarioEnSesion instanceof Usuario) {
                    if (usuarioEnSesion.getRol() == Rol.CLIENTES) {
                        Cliente clienteEnSesion = (Cliente) usuarioEnSesion;
                        MenuCliente menuCliente = new MenuCliente();
                        int opcion = 0;
                        while (opcion != 4) {
                            opcion = menuCliente.mostrarMenuCliente();
                            menuCliente.ejecutarMenu(opcion);
                        }
                        intentosUsuario = 0;

                    } else if (usuarioEnSesion.getRol() == Rol.CINEPOLITOS) {
                        Trabajador cinepolitoEnSesion = (Trabajador) usuarioEnSesion;
                        MenuCinepolito menuCinepolito = new MenuCinepolito();
                        
                        int opcion = 0;
                        while (opcion != 7) {
                            opcion = menuCinepolito.mostrarMenuCinepolito();
                            menuCinepolito.ejecutarMenu (opcion);
                        }
                        intentosUsuario = 0;

                    } else {
                        Administrador adminEnSesion = (Administrador) usuarioEnSesion;
                        MenuAdmin menuAdmin = new MenuAdmin();
                        int opcion = 0;
                        while (opcion != 7) {
                            opcion = menuAdmin.mostrarMenuAdmin();
                            menuAdmin.ejecutarMenu(opcion);
                        }
                        intentosUsuario = 0;

                    }
                } else {
                    intentosUsuario = mostrarErrorInicioSesion(intentosUsuario);
                }
                sc.nextLine();
                if (intentosUsuario == intentosMaximos){
                    System.out.println("Demasiados intentos de inicio de sesion. Intente mas tarde");
                    bandera = false;
                }
            }
        }
        private int mostrarErrorInicioSesion(int intentosUsuario) {
            System.out.println("\nUsuario o contraseña incorrectos, intenta de nuevo");
            return intentosUsuario +1;

        }
    }

