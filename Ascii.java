package org.example;

import java.util.Scanner;

public class Ascii {
    public void Ascii(char letra) {
        int codigo = (int) letra;
        if(letra >= 65 && letra <= 90) {
            System.out.println("Tu letra está en Mayúscula");
        }
        else if(letra >= 97 && letra <= 122) {
            System.out.println("Tu letra está en Minúscula");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ascii conversor = new Ascii();
        System.out.print("Introduce una letra: ");
        try {
            String texto = sc.nextLine();
            if (texto.length() != 1) {
                System.out.println("Por favor introduce solo una letra.");
                return;
            }
            char letra = texto.charAt(0);
            if (!Character.isLetter(letra)) {
                System.out.println("No has introducido una letra.");
                return;
            }
            conversor.Ascii(letra);

        } catch (Exception e) {
            System.out.println("Algo ha salido mal");
        }
    }
}

