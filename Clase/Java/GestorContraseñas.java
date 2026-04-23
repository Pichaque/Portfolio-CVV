import java.util.HashMap;
import java.util.Scanner;
import java.util.HashMap;

public class GestorContraseñas {
    public static void showMenu() {
        System.out.println("\n===== GESTOR DE CONTRASEÑAS =====");
        System.out.println("1- Añadir contraseña");
        System.out.println("2- Borrar contraseña");
        System.out.println("3- Modificar contraseña");
        System.out.println("4- Mostrar contraseña");
        System.out.println("5- Salir");
        System.out.print("Seleccione una opción: ");
    }
    public static void addPassword(HashMap<String, String> passwords, String url, String password) {
        if (passwords.containsKey(url)) {
            System.out.println("La URL ya existe. No se puede añadir.");
        } else {
            passwords.put(url, password);
            System.out.println("Contraseña añadida correctamente.");
        }
    }
    public static void removePassword(HashMap<String, String> passwords, String url) {
        if (!passwords.containsKey(url)) {
            System.out.println("La URL no existe. No se puede borrar.");
        } else {
            passwords.remove(url);
            System.out.println("Contraseña eliminada correctamente.");
        }
    }
    public static void modifyPassword(HashMap<String, String> passwords, String url, String newPassword) {
        if (!passwords.containsKey(url)) {
            System.out.println("La URL no existe. No se puede modificar.");
        } else {
            passwords.put(url, newPassword);
            System.out.println("Contraseña modificada correctamente.");
        }
    }
    public static void showPassword(HashMap<String, String> passwords, String url) {
        if (!passwords.containsKey(url)) {
            System.out.println("La URL no existe.");
        } else {
            System.out.println("Contraseña de " + url + ": " + passwords.get(url));
        }
    }
    public static boolean doesThisUrlExist(HashMap<String, String> passwords, String url) {
        if (passwords.containsKey(url)) {
            return true;
        } else {
            System.out.println("La URL no existe.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> passwords = new HashMap<>();
        int opcion;

        do {
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la URL: ");
                    String urlAdd = sc.nextLine();
                    System.out.print("Introduce la contraseña: ");
                    String passAdd = sc.nextLine();
                    addPassword(passwords, urlAdd, passAdd);
                    break;

                case 2:
                    System.out.print("Introduce la URL que deseas borrar: ");
                    String urlRemove = sc.nextLine();
                    removePassword(passwords, urlRemove);
                    break;

                case 3:
                    System.out.print("Introduce la URL que deseas modificar: ");
                    String urlMod = sc.nextLine();
                    if (doesThisUrlExist(passwords, urlMod)) {
                        System.out.print("Introduce la nueva contraseña: ");
                        String newPass = sc.nextLine();
                        modifyPassword(passwords, urlMod, newPass);
                    }
                    break;

                case 4:
                    System.out.print("Introduce la URL de la que deseas ver la contraseña: ");
                    String urlShow = sc.nextLine();
                    showPassword(passwords, urlShow);
                    break;

                case 5:
                    System.out.println("👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println(" Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}
