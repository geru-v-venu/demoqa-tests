package guru.qa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @Test
    void dragAndDrop(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));


    }
}
