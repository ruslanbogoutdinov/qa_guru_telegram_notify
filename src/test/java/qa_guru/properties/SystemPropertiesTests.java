package qa_guru.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class SystemPropertiesTests {
    @Test
    @Tag("property_test")
    void simplePropertiesTest(){
        // устанавливаем значение
        //System.setProperty("browser", "opera");
        System.setProperty("browserVersion", "99.0");
        // считываем значение
        //String browserName = System.getProperty("browser", "mozilla");
        //String browserVersion = System.getProperty("browserVersion", "99");

        //System.out.println(browserName);
        //System.out.println(browserVersion);

        // пример с property
        // System.setProperty("user_name", "123");
        System.out.println(format("Hello, %s!", System.getProperty("user_name", "unknown user")));
    }
}
