package com.abnamro.action;

import com.abnamro.drivers.DriverFactory;
import com.abnamro.helper.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.abnamro.action.Home.LINK_HOME_PAGE;
import static com.abnamro.helper.TestData.email;
import static com.abnamro.helper.TestData.password;

public class Login {

    public static final By INPUT_EMAIL = By.id("email");
    public static final By INPUT_PASSWORD = By.id("password");
    public static final By BUTTON_LOG_IN =By.xpath("//input[@id='login']");
    private final WebDriver driver = DriverFactory.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver,500);

    public void login(String role) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(BUTTON_LOG_IN)));
        TestData.getCredentials(role);
        driver.findElement(INPUT_EMAIL).sendKeys(email);
        driver.findElement(INPUT_PASSWORD).sendKeys(password);
        driver.findElement(BUTTON_LOG_IN).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(LINK_HOME_PAGE)));
    }

}
