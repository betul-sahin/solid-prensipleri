package com.betulsahin.solid.liskovsubstitution;

/**
 * Kodumuzda herhangi bir değişiklik yapmaya gerek kalmadan türetilmiş sınıfları (sub class)
 * türedikleri ata sınıfın (base class) yerine kullanabilmeliyiz.
 */
public class Client {
    public static void main(String[] args) {
        XmlFormatter formatter = new XmlFormatter(new XmlSchemaValidator("xsd"));
        System.out.println(formatter.format("metin"));
    }
}
