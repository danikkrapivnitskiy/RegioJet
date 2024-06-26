package ui;

import io.qameta.allure.Step;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

@Slf4j(topic = "|Page with common methods|")
public class BaseDriverMethods extends WebDriverFactory{
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @Step("Setup page")
    protected void setupPageAndApplyCookies(String link, By cookies) {
        log.info("Navigate to page " + link);
        driver.get(link);
        if (cookies != null && !getListOfElements(cookies).isEmpty()) {
            clickOnElement(cookies);
        }
    }
    @Step("Click the element")
    public void clickOnElement(By locator) {
        log.info("Click on element " + locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    @Step("Send keys")
    public void sendKeys(By locator, CharSequence key) {
        log.info("Send key " + key + " to " + locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(key);
    }
    @Step("Submit element")
    public void submitElement(By locator) {
        log.info("Submit element " + locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).submit();
    }
    @Step("Get list of elements")
    protected List<WebElement> getListOfElements(By locator) {
        log.info("Get list of elements " + locator);
        return driver.findElements(locator);
    }

    protected String getTextOfElement(By locator) {
        log.info("Get text of element " + locator);
        return driver.findElement(locator).getText();
    }

}
