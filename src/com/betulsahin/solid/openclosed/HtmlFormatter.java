package com.betulsahin.solid.openclosed;

public class HtmlFormatter extends PrettyFormatProvider{

    private HtmlValidator validator = new HtmlValidator();

    @Override
    public String format(String input) {

        if(!validator.isValid(input)){
            throw new RuntimeException();
        }

        return "<Html formatlanmis metin>";
    }
}
