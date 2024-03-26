package qa_guru;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

@Tag("remote_test")
public class TestWithRemoteDriver extends TestBase{
    @Test
    void searchSelenideInYandex(){
        open("https://github.com/");

        sleep(5000);

        $$(".HeaderMenu-item").get(1).hover();
    }
}
