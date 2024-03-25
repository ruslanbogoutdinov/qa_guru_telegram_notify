package qa_guru;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("remote_test")
public class TestWithRemoteDriver extends TestBase{
    @Test
    void searchSelenideInYandex(){
        step("Открываем сайт Яндекса", ()->{
            open("https://ya.ru/");
        });

        step("Кликаем по полю ввода", ()->{
            $("#text").click();
        });

        step("В поле ввода вводим поисковой запрос", ()->{
            $("#text").setValue("Selenide");
        });

        step("Кликаем по кнопке поиска", ()->{
            $("button[type='submit']").click();
        });
    }
}
