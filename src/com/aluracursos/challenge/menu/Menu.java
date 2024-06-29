package com.aluracursos.challenge.menu;

import com.aluracursos.challenge.funcion.ConsultaMoneda;
import com.aluracursos.challenge.modelo.Moneda;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {

        String menu = """
                **************************************************************
                                
                🌟 Bienvenido/a al conversor de moneda 🌟
                Elija una de las siguientes opciones por favor:
                                
                1 - Convertir dolar (USD) a peso argentino (ARS)
                2 - Convertir peso argentino (ARS) a dolar (USD)
                3 - Convertir dolar (USD) a real brasileño (BRL)
                4 - Convertir real brasileño (BRL) a dolar (USD)
                5 - Convertir dolar (USD) a peso colombiano (COP)
                6 - Convertir peso colombiano (COP) a dolar (USD)
                7 - Otro
                8 - Salir
                 
                **************************************************************
                """;
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        ConsultaMoneda consulta = new ConsultaMoneda();

        while (opcion != 8) {
            System.out.println(menu);
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1 -> {
                    try {
                        System.out.println("Escribe el monto a convertir:");
                        double monto = lectura.nextDouble();

                        Moneda moneda = consulta.convertirMoneda("USD", "ARS", monto);
                        System.out.println(monto + " [USD] equivale a " + moneda.conversion_result() + " [ARS]\n");

                    } catch (Exception e) {
                        System.out.println("No se pudo realizar la converion: " + e.getMessage());
                    }
                }
                case 2 -> {
                    try {
                        System.out.println("Escribe el monto a convertir:");
                        double monto = lectura.nextDouble();

                        Moneda moneda = consulta.convertirMoneda("ARS", "USD", monto);
                        System.out.println(monto + " [ARS] equivale a " + moneda.conversion_result() + " [USD]\n");

                    } catch (Exception e) {
                        System.out.println("No se pudo realizar la converion: " + e.getMessage());
                    }
                }
                case 3 -> {
                    try {
                        System.out.println("Escribe el monto a convertir:");
                        double monto = lectura.nextDouble();

                        Moneda moneda = consulta.convertirMoneda("USD", "BRL", monto);
                        System.out.println(monto + " [USD] equivale a " + moneda.conversion_result() + " [BRL]\n");

                    } catch (Exception e) {
                        System.out.println("No se pudo realizar la converion: " + e.getMessage());
                    }
                }
                case 4 -> {
                    try {
                        System.out.println("Escribe el monto a convertir:");
                        double monto = lectura.nextDouble();

                        Moneda moneda = consulta.convertirMoneda("BRL", "USD", monto);
                        System.out.println(monto + " [BRL] equivale a " + moneda.conversion_result() + " [USD]\n");

                    } catch (Exception e) {
                        System.out.println("No se pudo realizar la converion: " + e.getMessage());
                    }
                }
                case 5 -> {
                    try {
                        System.out.println("Escribe el monto a convertir:");
                        double monto = lectura.nextDouble();

                        Moneda moneda = consulta.convertirMoneda("USD", "COP", monto);
                        System.out.println(monto + " [USD] equivale a " + moneda.conversion_result() + " [COP]\n");

                    } catch (Exception e) {
                        System.out.println("No se pudo realizar la converion: " + e.getMessage());
                    }
                }
                case 6 -> {
                    try {
                        System.out.println("Escribe el monto a convertir:");
                        double monto = lectura.nextDouble();

                        Moneda moneda = consulta.convertirMoneda("COP", "USD", monto);
                        System.out.println(monto + " [COP] equivale a " + moneda.conversion_result() + " [USD]\n");

                    } catch (Exception e) {
                        System.out.println("No se pudo realizar la converion: " + e.getMessage());
                    }
                }
                case 7 -> {
                    try {
                        System.out.println("Escribe las siglas de la moneda base:");
                        String monedaBase = lectura.next().toUpperCase();

                        System.out.println("Escribe las siglas de la moneda a convertir");
                        String monedaAConvertir = lectura.next().toUpperCase();

                        System.out.println("Escribe el monto a convertir:");
                        double monto = lectura.nextDouble();

                        Moneda moneda = consulta.convertirMoneda(monedaBase, monedaAConvertir, monto);
                        System.out.println(monto + " [" + monedaBase + "] equivale a " + moneda.conversion_result() + " [" + monedaAConvertir + "]\n");

                    } catch (Exception e) {
                        System.out.println("No se pudo realizar la converion: " + e.getMessage());
                    }
                }
                case 8 -> {
                    System.out.println("Gracias por utilizar nuestros servicios, que tenga una buena jornada! 🤗");
                    System.exit(0);
                }
                default ->
                        System.out.println("Opcion no valida, ingrese otra opcion por favor\n");
            }
        }
        lectura.close();
    }
}
