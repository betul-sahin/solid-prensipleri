package com.betulsahin.solid.openclosed;

/**
 * Sınıflarımız değişikliğe kapalı ancak yeni davranışların eklenmesine açık olmalı.
 */
public class Client {

    public static void main(String[] args) {
        PrettyFormatter formatter = new PrettyFormatter();
        System.out.println(formatter.format(new HtmlFormatter(), "metin"));
        System.out.println(formatter.format(new JsonFormatter(), "metin"));
    }
}
