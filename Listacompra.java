
import java.util.Scanner;
import java.util.HashSet;

public class Listacompra {
    static void Menu(){
        System.out.println("1- Añadir Elemento");
        System.out.println("2- Borrar Elemento");
        System.out.println("3- Mostrar Elementos");
        System.out.println("4- Salir");
    }
    static void Introducir(HashSet<String> objetos, String objeto){
        objetos.add(objeto);
    }
    static void Eliminar(HashSet<String> objetos, String objeto){
        if(objetos.contains(objeto)){
            objetos.remove(objeto);
        }
        else{
            System.out.println("No existe el objeto");
        }
    }
    static void Mostrar(HashSet<String> objetos){
        System.out.println("Lista de La compra:" +objetos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        HashSet<String> objetos = new HashSet<>();
        String elemento;
        while(i<4){
            Menu();
            i=sc.nextInt();
            sc.nextLine();
            if(i==1){
                System.out.println("Ingresa elemento:");
                elemento = sc.nextLine();
                Introducir(objetos, elemento);
            }
            else if(i==2){
                System.out.println("Introduce el objeto que se quiere borrar:");
                elemento = sc.nextLine();
                Eliminar(objetos, elemento);
            }
            else if(i==3){
                Mostrar(objetos);
            }
        }
    }

}
