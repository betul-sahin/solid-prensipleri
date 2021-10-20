package com.betulsahin.solid.openclosed;

public class JsonFormatter extends PrettyFormatProvider {

    private JsonValidator validator = new JsonValidator();

    @Override
    public String format(String input) {

        if(!validator.isValid(input)){
            throw new RuntimeException("Error!");
        }

        return "<Json formatlanmis metin>";
    }
}
