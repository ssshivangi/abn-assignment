package com.abnamro.action;

import com.abnamro.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.abnamro.action.Login.BUTTON_LOG_IN;
import static com.abnamro.helper.TestData.CONTENT_DATA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Home {

    public static final By CONTENT = By.xpath("//*[@id='content']/div/p[1]");

    public static final By USER_ICON = By.id("user");

    public static final By BUTTON_SIGN_OUT =By.xpath("//*[@id='logout']/span");

    public static final By LINK_HOME_PAGE =By.className("home");

    private final WebDriver driver = DriverFactory.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver,500);

    public void verifyHomePageDisplayed() {
        assertTrue("Home link is not displayed",driver.findElement(LINK_HOME_PAGE).isDisplayed());
        assertTrue("User icon is not displayed",driver.findElement(USER_ICON).isDisplayed());
    }

    public void logoutUser(){
        driver.findElement(USER_ICON).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(BUTTON_SIGN_OUT)));

        driver.findElement(BUTTON_SIGN_OUT).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(BUTTON_LOG_IN)));
    }

    public void verifyHomePageContentValue() {
        assertEquals(driver.findElement(CONTENT).getText().trim(), CONTENT_DATA);
    }
}
