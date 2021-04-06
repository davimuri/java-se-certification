package certification.java11.i18n;

import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.FRANCE);
        Locale en = new Locale.Builder().setLanguage("en").build();
        System.out.println(en);
        Locale ru = new Locale("ru");
    }
}
