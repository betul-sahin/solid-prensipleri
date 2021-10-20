package com.betulsahin.solid.singleresponsibility;

import javax.xml.bind.ValidationException;

/**
 * Bu sınıfın tek sorumluluğu verilen metni Format methodu ile formatlamak.
 */
public class JsonFormatter {
    // kural denetleme sorumluluğunu bu sinifa devrettik.
    private JsonValidator validator = new JsonValidator();

    public String format(String input){

        if(!validator.isValid(input)){
            throw new RuntimeException();
        }

        return "<formatlanan metin>";
    }

    /**
     * Json metinler belirli kurallara uygun olarak oluşturulması gereken metinlerdir.
     * Bu nedenle formatlama işleminin ön aşaması olarak verilen metnin geçerli bir
     * Json metin olup olmadığının da denetlenmesi (validation) gerekir.
     *
     * Bu metodun eklenmesi ile birlikte JsonFormatter sınıfında
     * Single Responsibility prensibinden uzaklaşmaya başlıyoruz.
     * Sınfımıza Json formatlama sorumluluğuna ilave olarak bir de Json kural denetimi
     * sorumluluğunu ekledik.
     */
    //private boolean isInputValid(String input){
    //    return true;
    //}
}
