import java.util.Scanner;
import java.util.ArrayList;

public class Cajaregistradora {
    static void menu(){
        System.out.println("1- Añadir pago");
        System.out.println("2- Mostrar suma total");
        System.out.println("3- Borrar pago");
        System.out.println("4- Salir");
    }
    static void Anadir(ArrayList<Integer> pagos, Integer pago){
      pagos.add(pago);
    }
    static void CalculoTotal(ArrayList<Integer> pagos){
        int total= 0;
        for(Integer pago: pagos){
            total+=pago;
        }
        System.out.println("El total es: "+total);
    }
    static void Borrar(ArrayList<Integer> pagos){
        pagos.clear();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0;
        ArrayList<Integer> pagos=new ArrayList<>();
        while(i<4){
            menu();
            i=sc.nextInt();
            if(i==1){
                System.out.println("Añade un pago:");
                int paga=sc.nextInt();
                Anadir(pagos, paga);
            }
            else if(i==2){
                CalculoTotal(pagos);
            }
            else if(i==3){
                Borrar(pagos);
            }
        }
    }
}
