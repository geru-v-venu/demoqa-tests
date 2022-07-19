package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;


public class DemoqaFirstTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void formTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Chao");
        $("#userEmail").setValue("alexchao@email.com");

        $("[for=gender-radio-1]").click();

        $("#userNumber").setValue("1234567890");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--027:not(.react-datepicker__day--outside-month)").click();

        $("#subjectsInput").setValue("Math").pressEnter();

        $("[for=hobbies-checkbox-1]").click();

        $("#uploadPicture").uploadFromClasspath("img/1.png");

        $("#currentAddress").setValue("Some address");

        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

        $("#submit").pressEnter();

        $("[class=modal-body]").shouldHave(text("Alex"), text("Chao"), text("alexchao@email.com"), text("Male")
        ,text("1234567890"), text("27 July,2000"), text("Math"), text("Sports"), text("1.png"), text("Some address"), text("NCR Delhi"));

}}
