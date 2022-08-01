package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitWikiTest {

    @Test
    void junitFinderInGitWiki(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("so");
        $(".Layout-sidebar").shouldHave(text("SoftAssertions"));

        $(".markdown-body").$(byText("Soft assertions")).click();

        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));



    }
}
