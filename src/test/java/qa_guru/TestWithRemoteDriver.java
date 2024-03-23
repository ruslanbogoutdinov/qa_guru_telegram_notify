package qa_guru;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("remote_test")
public class TestWithRemoteDriver extends TestBase{
    @Test
    void searchSelenideInYandex(){
        open("https://ya.ru/");
        $("#text").click();
        $("#text").setValue("Selenide");
        $("button[type='submit']").click();
    }
}
