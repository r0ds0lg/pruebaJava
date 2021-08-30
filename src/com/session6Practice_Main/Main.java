package com.session6Practice_Main;

public class Main {
    public static void main (String[] args) {
        PrecioVenta pastelDeChocolate = new PrecioVenta();
        int precioPastelChocolate = pastelDeChocolate.calculoPrecioVenta(100);

        System.out.print("El precio de venta del pastel es $" + precioPastelChocolate + " \u1f382");

    }
}
