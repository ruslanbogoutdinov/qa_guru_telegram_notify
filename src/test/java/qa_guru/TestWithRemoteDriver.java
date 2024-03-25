package qa_guru;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

//@Tag("remote_test")
@Tag("property_test")
public class TestWithRemoteDriver extends TestBase{
    @Test
    void searchSelenideInYandex(){

        $$(".HeaderMenu-item").get(1).hover();
        $("[aria-labelledby=solutions-for-heading]").$(byText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
        /*step("Открываем сайт Яндекс", ()->{
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
        });*/
    }
}
