package date.API_one;

import java.util.Locale;

/**
 * Класс Locale позволяет создать объект, описывающий географический
 * или культурный регион, обеспечивая возможность создания многонациональных
 * программ с учётом региональных настроек дат, времён, чисел, валюты и т.д.

 Существуют готовые константы для популярных стран, например,
 Locale.ITALIAN и т.д. Россия константой не представлена.

 В одной стране могут использоваться несколько языков и диалектов,
 поэтому существует несколько конструкторов, учитывающих эти особенности.

 Locale(String language) - указывается язык
 Locale(String language, String country) - указывается язык и страна
 Locale(String language, String country, String variant) - указывается язык,
 страна и вспомогательная информация
 Метод setDefault() устанавливает используемые по умолчанию региональные данные.

 Для отображения на экране названий страны, языка и полного описания
 региональных данных в читабельном виде можно использовать методы
 getDisplayCountry(), getDisplayLanguage(), getDisplayName().
 https://examples.javacodegeeks.com/core-java/util/locale/java-util-locale-example/
 */
public class ExLocale {
    public static void main(String[] args) {
        // Creates a locale object using one parameter to constructor
        Locale locale = new Locale("fr");
        System.out.println("locale: "+locale);

        // Create a locale object using two parameters constructor
        Locale locale2 = new Locale("fr", "CANADA");
        System.out.println("locale2: "+locale2);

        // Create a locale object using three parameters constructor
        Locale locale3 = new Locale("no", "NORWAY", "NY");
        System.out.println("locale3: "+locale3);

        // A local object from Locale.Builder
        Locale localeFromBuilder = new Locale.Builder().setLanguage("en").setRegion("GB").build();
        System.out.println("localeFromBuilder: "+localeFromBuilder);

        //Locale from forLanguageTag method
        Locale forLangLocale = Locale.forLanguageTag("en-GB");
        System.out.println("forLangLocale: "+forLangLocale);

        //Using Locale Contant
        Locale localeCosnt = Locale.FRANCE;
        System.out.println("localeCosnt: "+localeCosnt);
    }

}
