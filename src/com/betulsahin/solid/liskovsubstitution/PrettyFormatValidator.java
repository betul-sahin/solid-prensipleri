package com.betulsahin.solid.liskovsubstitution;

/*
PrettyFormatValidator‘ı artık XmlValidator ve XmlSchemaValidator
sınıflarının atası olarak kullanabiliriz.
 */
public abstract class PrettyFormatValidator {
    public abstract boolean isValid(String input);
}
