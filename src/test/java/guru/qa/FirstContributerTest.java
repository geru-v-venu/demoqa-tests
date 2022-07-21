package guru.qa;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;

public class FirstContributerTest {

    @Test
    void firstContributerShouldBeSolntsev(){

        open("https://github.com/selenide/selenide");

        $(".Layout-sidebar").$(byText("Contributors"));

    }
}
