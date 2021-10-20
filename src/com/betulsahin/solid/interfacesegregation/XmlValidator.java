package com.betulsahin.solid.interfacesegregation;

/**
 * XmlValidator sınıfı IPrettyFormatValidator arayüzünden türetiliyor
 * ve ihtiyacı olmayan Schema özelliğini artık barındırmıyor.
 */
public class XmlValidator implements IPrettyFormatValidator{

    @Override
    public boolean isValid(String input) {
        return true;
    }
}
