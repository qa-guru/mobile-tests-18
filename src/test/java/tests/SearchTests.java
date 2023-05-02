package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchTests extends TestBase {

    @Test
    void successfulSearchTest() {
        $(AppiumBy.accessibilityId("Search Wikipedia")).click();
        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_container"))
                .shouldHave(sizeGreaterThan(0));
    }
}