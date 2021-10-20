package com.betulsahin.solid.interfacesegregation;

/**
 * Genel kullanım amaçlı tek bir kontrat yerine daha özelleşmiş
 * birden çok kontrat oluşturmayı tercih etmeliyiz.
 */
public class Client {
    public static void main(String[] args) {
        XmlValidator xmlValidator = new XmlValidator();
        System.out.println(xmlValidator.isValid("metin")?"Valid":"Valid degil");

        XmlSchemaValidator xmlSchemaValidator = new XmlSchemaValidator();
        System.out.println("Semasina gore denetim yapilacak: " +xmlSchemaValidator.getSchema());
        System.out.println("Valid mi: " + xmlSchemaValidator.isValid("metin"));
    }
}
