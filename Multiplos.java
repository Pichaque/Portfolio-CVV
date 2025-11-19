package org.example;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce el primer número: ");
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("Introduce el segundo número: ");
            int num2 = Integer.parseInt(sc.nextLine());

            if (num1 == 0 || num2 == 0) {
                System.out.println("0 no puede ser múltiplo de ningún número.");
                return;
            }

            if (num1 % num2 == 0) {
                System.out.println(num1 + " es múltiplo de " + num2);
            } else if (num2 % num1 == 0) {
                System.out.println(num2 + " es múltiplo de " + num1);
            } else {
                System.out.println("No son múltiplos entre sí.");
            }

        } catch (Exception e) {
            System.out.println("No has introducido un número.");
            return;
        }
    }
}
