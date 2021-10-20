package com.betulsahin.solid.liskovsubstitution;

public class XmlFormatter extends PrettyFormatProvider{

    /*
        Bu düzenlemeler ile XmlFormatter sınıfını,
        çalışma anında ata sınıfın yerine türetilmiş sınıflardan
        nesneleri kullanarak ilgili işlevlere erişebilir hale getirdik.
     */
    private PrettyFormatValidator validator;
    public XmlFormatter(PrettyFormatValidator validator){
        this.validator = validator;
    }

    @Override
    public String format(String input) {
       if(!validator.isValid(input)){
           throw new RuntimeException();
       }

       return "<Xml formatlanan metin>";
    }
}
