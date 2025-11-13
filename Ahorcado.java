package clase;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 1;
        while (v <= 1) {
            int muñecajo = 0;
            String[] bombo = {"tender", "hablar", "esternocleidomastoideo", "cipuecano", "espantapajaros", "impajaritable", "arbitro", "mono", "fertil", "manzana"};
            System.out.println("Hay " + bombo.length + " palabras en el bombo");
            int random = (int) (Math.random() * bombo.length);
            char[] letras = bombo[random].toCharArray();
            int longitud = bombo[random].length();
            String vacio = "";
            for (int j = 0; j < longitud; j++) {
                System.out.print("_");
                vacio += "_";
            }
            char[] vacios = vacio.toCharArray();
            int b = 1;
            while (b <= 1) {
                boolean fallo = true;
                System.out.println("\nIntroduce la letra que quieras:");
                char letra = sc.next().charAt(0);
                for (int i = 0; i < letras.length; i++) {
                    if (letras[i] == letra) {
                        fallo = false;
                    }
                }
                if (fallo) {
                    for (int k = 0; k < letras.length; k++) {
                        System.out.print(vacios[k]);
                    }
                    String[] muñeco = {"\nI-----\n" +
                            "I    l\n" +
                            "I    o\n", "\nI-----\n" +
                            "I    l\n" +
                            "I    o\n" +
                            "     |", "\nI-----\n" +
                            "I    l\n" +
                            "I    o\n" +
                            "    ´|", "\nI-----\n" +
                            "I    l\n" +
                            "I    o\n" +
                            "    ´|`\n", "\nI-----\n" +
                            "I    l\n" +
                            "I    o\n" +
                            "    ´|`\n" +
                            "    ´", "\nI-----\n" +
                            "I    l\n" +
                            "I    o\n" +
                            "    ´|`\n" +
                            "    ´ `"};

                    System.out.println(muñeco[muñecajo]);
                    muñecajo = muñecajo + 1;
                }
                if (muñecajo == 6) {
                    System.out.println("Has perdido.\nSi quieres volver a jugar pulsa con otra palabara pulsa 1 y 2\nSi quieres probar otra vez la misma palabra pulsa 1 y 1\nSi quieres parar de jugar pulsa 2 dos veces");
                    v = sc.nextInt();
                    b = sc.nextInt();
                }
                if (!fallo) {
                    for (int j = 0; j < letras.length; j++) {
                        if (letras[j] == letra) {
                            vacios[j] = letras[j];
                        }
                        System.out.print(vacios[j]);
                    }
                }
                boolean victoria = false;
                for (int c = 0; c < vacios.length; c++) {
                    if (vacios[c] == '_') {
                        victoria = true;
                    }
                }
                if (!victoria) {
                    b = 2;
                }
            }
            System.out.println("\nHas ganado si quieres volver a jugar pulsa 1 si quieres dejar de jugar pulsa 2");
            v = sc.nextInt();
        }
    }
}




