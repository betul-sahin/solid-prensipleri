package com.betulsahin.solid.singleresponsibility;

/**
 * Single Responsibility : Sınıflarımızın iyi tanımlanmış tek bir sorumluluğu olmalı.
 */
public class Client {

    public static void main(String[] args) {
        JsonFormatter jsonFormatter = new JsonFormatter();
        System.out.println(jsonFormatter.format("bir metin"));
    }
}
