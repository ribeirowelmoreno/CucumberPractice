package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AssertionVerify {
    private AndroidDriver driver;

    public AssertionVerify (AndroidDriver driver) {this.driver = driver;}

    public AssertionVerify checkText(){

        WebElement headingResult = driver.findElement(By.xpath("//android.view.View[contains(text(), 'A single line of text')]"));
        Assert.assertEquals(headingResult.getText(), "A single line of text");

        return this;
    }
}
