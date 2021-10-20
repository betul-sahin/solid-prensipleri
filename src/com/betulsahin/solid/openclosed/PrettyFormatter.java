package com.betulsahin.solid.openclosed;

import com.betulsahin.solid.singleresponsibility.JsonFormatter;

/**
 * Bu sınıfın sorumluluğu seçilen metin tipi için formatlama işlevi sağlamak.
 * Birden fazla metin tipi (Json, Html, Xml vb) için formatlama işlevi sunmak.
 */
public class PrettyFormatter {

    public enum FormatTypes{
        Json,
        Html
    }

    // Her format tipi için bu islemleri tekrarlamamiz gerekecek.
    /*
       Bu sorunu gidermek için takip edilebilecek yöntemlerden birisi
       formatlama işlemini genel hatları ile tanımlayan ata bir sınıf oluşturup (PrettyFormatProvider)
       asıl işlevleri de türetilmiş sınıfların (JsonFormatter vb) sorumluluğu olarak tanımlayabiliriz.
     */
    //private JsonFormatter jsonFormatter = new JsonFormatter();
    //private HtmlFormatter htmlFormatter = new HtmlFormatter();

    public String format(/*FormatTypes inputType*/PrettyFormatProvider provider, String input){
        /*
        switch (inputType){
            case FormatTypes.Html:
                return HtmlFormatter.format(input);
            case FormatTypes.Json:
                return HtmlFormatter.format(input);
            default:
                throw new RuntimeException("Desteklenmeyen format tipi!");
        }
        */

        return provider.format(input);
    }
}
