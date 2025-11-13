package org.example;

import java.util.Scanner;
import java.util.TreeSet;

public class DisHamming {
    public static void Hamm (TreeSet <String> diccionario, String b) {
        int distancia=0;
        int distanciapal=0;
        String semejanza="";
        char[] dos = b.toCharArray();
        for(String i: diccionario) {
            String palabra= i;
            char[] uno=palabra.toCharArray();
            distancia=0;
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
            if(distancia< distanciapal){
                semejanza=i;
            }
            distanciapal=distancia;
        }
        System.out.println("La palabra que buscas es: "+ semejanza);
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
        diccionario.add("Gtifo");
        diccionario.add("Meneo");
        System.out.println("Escribe una palabra mal");
        String b = sc.nextLine();
        Hamm(diccionario,b);
    }
}