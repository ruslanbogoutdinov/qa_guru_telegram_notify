package qa_guru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import qa_guru.helper.Attach;

import java.util.Map;

public class TestBase {
    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = System.getProperty("baseUrl");
        Configuration.browser = System.getProperty("browserName", "opera");
        Configuration.browserSize = System.getProperty("browserSize");
        Configuration.browserVersion = System.getProperty("browserVersion");

        // настройка для remote запуска
        // прописываем также логин и пароль в начале
        // при запуске данного теста, локальный браузер не должен запускаться

        Configuration.remote = "https://user1:1234@"+System.getProperty("selenoidUrl", "selenoid.autotests.cloud/wd/hub");

        //Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                // отображение работы браузера в окне
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener(){
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
