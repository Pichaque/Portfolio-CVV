package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int x) {
        int prim=0;
        int segu=1;
        int tercer;
        if (x>2) {
            System.out.print(prim + " " + segu + " ");
            for (int j = 0; j < x; j++) {
                tercer = prim + segu;
                System.out.print(tercer + " ");
                prim = segu;
                segu = tercer;
            }
        }
        else {
            System.out.print("Minimo tiene que ser 2");
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos digitos de la serie quieres?");
        int x=sc.nextInt();
        fibonacci(x);
    }
}
