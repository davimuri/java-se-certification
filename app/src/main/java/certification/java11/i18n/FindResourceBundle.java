package certification.java11.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class FindResourceBundle {

    public static void main(String[] args) {
        var CA = new Locale("en", "CA");
        Locale.setDefault(new Locale("en", "US"));
        var rb = ResourceBundle.getBundle("Employees", CA);
        System.out.println(rb.getString("name"));
        System.out.println(rb.getString("age"));
        System.out.println(rb.getString("salary"));
    }
}
