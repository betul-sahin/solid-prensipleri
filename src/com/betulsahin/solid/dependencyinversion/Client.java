package com.betulsahin.solid.dependencyinversion;

/**
 * Katmanlı mimarilerde üst seviye modüller alt seviyedeki modüllere doğruda bağımlı olmamalıdır.
 */
public class Client {
    public static void main(String[] args) {
        PrettyFormatter formatter = new PrettyFormatter(new HtmlFormatter());
        System.out.println(formatter.format("metin"));
    }
}
