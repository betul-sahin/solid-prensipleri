package com.betulsahin.solid.dependencyinversion;

/**
 * JsonFormatter ve HtmlFormatter sınıflarını PrettyFormatProvider sınıfından türeterek
 * PrettyFormatter sınıfına kurucu fonksiyonu (constructor) vasıtası
 * ile dışarıdan verilmesini (constructor injection) sağlıyoruz.
 * Bu şekilde bağımlılığı ortadan kaldırıyoruz.
 */
public class PrettyFormatter {

    private PrettyFormatProvider provider;
    public PrettyFormatter(PrettyFormatProvider provider){
        this.provider = provider;
    }

    public String format(String input){
        return provider.format(input);
    }
}
