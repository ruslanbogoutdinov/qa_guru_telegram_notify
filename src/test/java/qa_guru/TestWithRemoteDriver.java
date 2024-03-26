package qa_guru;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

@Tag("remote_test")
public class TestWithRemoteDriver extends TestBase{
    @Test
    void searchSelenideInYandex(){
        Configuration.timeout = 10000;
        open("https://github.com/");

        $$(".HeaderMenu-item").get(1).hover();
    }
}
