package com.betulsahin.solid.interfacesegregation;

/**
 * XmlSchemaValidator sınıfı daha özelleşmiş bir arayüz olan
 * IPrettyFormatSchemaValidator arayüzünden türetiliyor
 * ve ihtiyaç duyduğu Schema özelliğini kontrata uygun olarak barındırıyor.
 */
public class XmlSchemaValidator implements IPrettyFormatSchemaValidator{

    @Override
    public boolean isValid(String input) {
        return true;
    }

    @Override
    public String getSchema() {
        return "xsd";
    }
}
