package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class ClickWebViewPage {
    private AppiumDriver driver;
    public ClickWebViewPage(AppiumDriver driver) {this.driver = driver;}

    public ClickWebViewPage clickingIGoToATaget(){
        driver.findElement(By.id("otherframe[contains(text(), 'I go to a target')]")).click();



        return this;
    }
}
