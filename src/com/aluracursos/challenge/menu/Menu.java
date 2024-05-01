package com.aluracursos.challenge.menu;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu(){

        String menu = """
                **************************************************************
                Bienvenido/a al conversor de moneda
                Elija una de las siguientes opciones por favor:
                
                1 - Convertir dolar (USD) a peso argentino (ARS)
                2 - Convertir peso argentino (ARS) a dolar (USD)
                3 - Convertir dolar (USD) a real brasileño (BRL)
                4 - Convertir real brasileño (BRL) a dolar (USD)
                5 - Convertir dolar (USD) a peso colombiano (COP)
                6 - Convertir peso colombiano (COP) a dolar (USD)
                7 - Otro
                7 - Salir
                 
                **************************************************************
                """;
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Opcion 1\n");
                case 2 -> System.out.println("Opcion 2\n");
                case 3 -> System.out.println("Opcion 3\n");
                case 4 -> System.out.println("Opcion 4\n");
                case 5 -> System.out.println("Opcion 5\n");
                case 6 -> System.out.println("Opcion 6\n");
                case 7 -> System.out.println("Opcion 7\n");
                default -> System.out.println("Opcion no valida, ingrese otra opcion por favor\n");
            }
        }
        teclado.close();
    }
}
