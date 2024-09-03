package com.mycompany.traductorjava;

import java.util.HashMap;
import java.util.Scanner;

public class TraductorJava {

    private static HashMap<Integer, String> obtenerNumEspañol() {
        HashMap<Integer, String> numESP = new HashMap<>();

        numESP.put(1, "uno");
        numESP.put(2, "dos");
        numESP.put(3, "tres");
        numESP.put(4, "cuatro");
        numESP.put(5, "cinco");
        numESP.put(6, "seis");
        numESP.put(7, "siete");
        numESP.put(8, "ocho");
        numESP.put(9, "nueve");
        numESP.put(10, "diez");
        numESP.put(11, "once");
        numESP.put(12, "doce");
        numESP.put(13, "trece");
        numESP.put(14, "catorce");
        numESP.put(15, "quince");
        numESP.put(16, "dieciséis");
        numESP.put(17, "diecisiete");
        numESP.put(18, "dieciocho");
        numESP.put(20, "veinte");
        numESP.put(30, "treinta");
        numESP.put(40, "cuarenta");
        numESP.put(50, "cincuenta");
        numESP.put(60, "sesenta");
        numESP.put(70, "setenta");
        numESP.put(80, "ochenta");
        numESP.put(90, "noventa");
        numESP.put(100, "cien");

        for (int i = 21; i < 30; i++) {
            numESP.put(i, "veinti" + numESP.get(i - 20));
        }
        for (int i = 31; i < 100; i++) {
            int decena = (i / 10) * 10;
            int unidad = i % 10;
            if (unidad == 0) {
                numESP.put(i, numESP.get(decena));
            } else {
                numESP.put(i, numESP.get(decena) + " y " + numESP.get(unidad));
            }
        }

        return numESP;
    }

    private static HashMap<Integer, String> obtenerNumInglés() {
        HashMap<Integer, String> numENG = new HashMap<>();
        numENG.put(1, "one");
        numENG.put(2, "two");
        numENG.put(3, "three");
        numENG.put(4, "four");
        numENG.put(5, "five");
        numENG.put(6, "six");
        numENG.put(7, "seven");
        numENG.put(8, "eight");
        numENG.put(9, "nine");
        numENG.put(10, "ten");
        numENG.put(11, "eleven");
        numENG.put(12, "twelve");
        numENG.put(13, "thirteen");
        numENG.put(14, "fourteen");
        numENG.put(15, "fifteen");
        numENG.put(16, "sixteen");
        numENG.put(17, "seventeen");
        numENG.put(18, "eighteen");
        numENG.put(19, "nineteen");
        numENG.put(20, "twenty");
        numENG.put(30, "thirty");
        numENG.put(40, "forty");
        numENG.put(50, "fifty");
        numENG.put(60, "sixty");
        numENG.put(70, "seventy");
        numENG.put(80, "eighty");
        numENG.put(90, "ninety");
        numENG.put(100, "one hundred");

        for (int i = 21; i < 30; i++) {
            numENG.put(i, "twenty-" + numENG.get(i - 20));
        }

        for (int i = 31; i < 100; i++) {
            int decena = (i / 10) * 10;
            int unidad = i % 10;
            if (unidad == 0) {
                numENG.put(i, numENG.get(decena));
            } else {
                numENG.put(i, numENG.get(decena) + "-" + numENG.get(unidad));
            }
        }

        return numENG;
    }

    public static HashMap<Integer, String> obtenerNum(String idioma) {
        switch (idioma) {
            case "Espanol":
                return obtenerNumEspañol();
            case "English":
                return obtenerNumInglés();
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione el lenguaje/Select the language (Espanol/English:");
        String idioma = leer.next();
        HashMap<Integer, String> traduccion = obtenerNum(idioma);
        System.out.println("Escriba un numero entre 1 y 100:");
        int numero1 = leer.nextInt();
        System.out.println("Escriba otro numero entre 1 y 100:");
        int numero2 = leer.nextInt();
        int suma = numero1 + numero2;
        String num1 = traduccion.get(numero1);
        String num2 = traduccion.get(numero2);
        String resultado = traduccion.get(suma);
        if ("Espanol".equalsIgnoreCase(idioma)) {
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + resultado);
        } else if ("English".equalsIgnoreCase(idioma)){
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + resultado);
        }
    }
}

