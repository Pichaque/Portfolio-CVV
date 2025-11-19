package org.example;

import java.util.Scanner;
import java.util.TreeSet;

public class DisHamming {

    public static void Hamm (TreeSet <String> diccionario, String b) {
        int distancia=0;
        int distanciapal=9999;
        String semejanza="";
        char[] dos = b.toCharArray();
        for(String i: diccionario) {
            String palabra = i;
            char[] uno = palabra.toCharArray();
            distancia = 0;
            if (uno.length <= dos.length) {
                for (int j = 0; j < uno.length; j++) {
                    if (uno[j] != dos[j]) {
                        distancia++;
                    }
                }
            } else {
                for (int j = 0; j < dos.length; j++) {
                    if (uno[j] != dos[j]) {
                        distancia++;
                    }
                }
            }
            distancia += Math.abs(uno.length - dos.length);

            if (distancia < distanciapal) {
                distanciapal = distancia;
                semejanza = i;
            }
        }
        System.out.print(semejanza + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> diccionario = new TreeSet<>();
        diccionario.add("Hola");
        diccionario.add("Ventana");
        diccionario.add("Tren");
        diccionario.add("Silla");
        diccionario.add("Tenedor");
        diccionario.add("Calendario");
        diccionario.add("Taza");
        diccionario.add("Boligrafo");
        diccionario.add("Meneo");
        diccionario.add("En");
        diccionario.add("un");
        diccionario.add("lugar");
        diccionario.add("de");
        diccionario.add("la");
        diccionario.add("Mancha");
        diccionario.add("cuyo");
        diccionario.add("nombre");
        diccionario.add("no");
        diccionario.add("quiero");
        diccionario.add("acordarme");
        System.out.println("Escribe una frase mal escrita:");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        System.out.println("Lo que buscas es:");

        for (String palabra : palabras) {
            Hamm(diccionario, palabra);
        }
    }
}
