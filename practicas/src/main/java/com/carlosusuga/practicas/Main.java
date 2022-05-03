package com.carlosusuga.practicas;

import sun.security.krb5.internal.SeqNumber;

public class Main {
    public static void main(String[] args){
//        System.out.println("Hola Mundo");
        final short enteroCorto = 120;
        int enteroNormal;
        long enteroLargo;
        float decimalCorto = 45.25f;
        double decimalLargo = 37.28165;
        char caracter = 'a';
        boolean esValido = true;

        enteroNormal = 32;
        enteroLargo = 121546876251L;

        System.out.println(enteroCorto);
        System.out.println(decimalLargo);
        System.out.println(decimalCorto);
        System.out.println(enteroLargo);
        System.out.println(enteroNormal);
        System.out.println(caracter);
        System.out.println(esValido);
        
        String[] nombres = new String[]{"Carlos", "Andres", "Usuga", "Jaramillo"};

        System.out.println();
        nuevoTema("Arrelgos:");
        System.out.println();
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);

        System.out.println();
        nuevoTema("Ciclos y Condiciones");
        if (enteroLargo > 500){
            System.out.println("Es mayor");
        } else if (enteroLargo == 500){
            System.out.println("Es igual");
        } else {
            System.out.println("Es menor");
        }

        System.out.println();
        nuevoTema("Operador ternario");
        System.out.println(enteroLargo > 1000? "Es mayor" : "Es menor");

        System.out.println();
        nuevoTema("Ciclo for");

        for(int i = 0; i < 3; i++){
            System.out.println("Posicion: " + i);
        }

        System.out.println();
        for (String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println();
        nuevoTema("Ciclo swicht");
        int index = (int) (Math.random()) * 5;
        String nombreAleatorio = index <4? nombres[index] : "Anonimo";
        System.out.println("El valor de index es: " + index);
        switch (nombreAleatorio){
            case "Raul":
                System.out.println("Soy yo!");
                break;
            case "Carlos":
            case "Andres":
            case "Usuga":
                System.out.println("Es " + nombreAleatorio);
                break;
            default:
                System.out.println("Este usuario no existe en nuestro listado");

        }
    }

    private static void nuevoTema(String title){
        System.out.println("\n===============> " + title + ": ");
    }
}