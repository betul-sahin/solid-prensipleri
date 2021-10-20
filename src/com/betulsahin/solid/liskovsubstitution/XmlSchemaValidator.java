package com.betulsahin.solid.liskovsubstitution;

/**
 *  XML dokümanlarını basit ve genel XML söz dizimi kurallarına göre
 *  doğrulayabildiğimiz gibi verilen bir şemaya (XSD) göre de doğrulayabiliriz.
 *
 *  Bu sınıf, XmlFormatter sınıfının XSD şemaları ile kural denetimi
 *  yapmasını sağlar.
 */
public class XmlSchemaValidator extends PrettyFormatValidator{

    private String xsdSchema;
    public XmlSchemaValidator(String xsd){
        xsdSchema = xsd;
    }

    public boolean isValid(String input){
        return true;
    }
}
