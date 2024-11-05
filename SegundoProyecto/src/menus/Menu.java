package menus;


import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public void login(){
        int intentosMaximos= 5, intentosUsuario=0;
        Boolean bandera = true;
        while(bandera){
            System.out.println("Bienvenido al sistema");
            System.out.println("Inicia sesion");

            System.out.println("Ingrese su usuario");
            String usuario=input.nextLine();
            System.out.println("Ingrese su contraseña");
            String contrasenia=input.nextLine();

            //Usuario usuarioEnSesion = clasetronco.validarInicioSesion(usuario, contrasenia);
          /* if(usuarioEnSesion instanceof Usuario){
                if(usuarioEnSesion.getRol() == Rol."claseUsuario"){
                    ClaseUsuario claseUsuarioEnSesion = (claseUsuario) claseUsuarioEnSesion;
                    MenuClaseUsuario menuClaseUsuaerio = new menuClaseUsuario();
                    int opcion =0;

                    while(opcion != 4)
                }
            }*/
        }
    }
}
