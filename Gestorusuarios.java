import java.util.Scanner;
import java.util.HashMap;

public class Gestorusuarios {

    static void Menu() {
        System.out.println("\n--- MENÚ DE GESTOR DE USUARIOS ---");
        System.out.println("1- Añadir Usuario");
        System.out.println("2- Borrar Usuario");
        System.out.println("3- Modificar Usuario");
        System.out.println("4- Salir");
    }

    static void Insertar(HashMap<String, String> usuarios, String usuario, String contraseña) {
        if (usuarios.containsKey(usuario)) {
            System.out.println("El usuario ya existe.");
        } else {
            usuarios.put(usuario, contraseña);
            System.out.println("Usuario añadido correctamente.");
        }
    }

    static void Eliminar(HashMap<String, String> usuarios, String usuario) {
        if (usuarios.containsKey(usuario)) {
            usuarios.remove(usuario);
            System.out.println("Usuario eliminado correctamente.");
        } else {
            System.out.println("Usuario no existe.");
        }
    }

    static void modifyUser(HashMap<String, String> usuarios, String user, String password) {
        if (usuarios.containsKey(user)) {
            usuarios.put(user, password);
            System.out.println("Usuario modificado correctamente.");
        } else {
            System.out.println(" El usuario '" + user + "' no existe. No se puede modificar.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        HashMap<String, String> usuarios = new HashMap<>();

        while (i != 4) {
            Menu();
            System.out.print("Elige una opción: ");
            i = sc.nextInt();
            sc.nextLine();

            if (i == 1) {
                System.out.print("Ingrese el nombre del usuario: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese la contraseña del usuario: ");
                String password = sc.nextLine();

                Insertar(usuarios, nombre, password);

            } else if (i == 2) {
                System.out.print("Ingrese el nombre del usuario a eliminar: ");
                String nombre = sc.nextLine();

                Eliminar(usuarios, nombre);

            } else if (i == 3) {
                System.out.print("Ingrese el nombre del usuario que desea modificar: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese la nueva contraseña: ");
                String password = sc.nextLine();

                modifyUser(usuarios, nombre, password);
            }
        }
    }
}
