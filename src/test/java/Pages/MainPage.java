package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.reporters.jq.Main;

public class MainPage {
    private AppiumDriver driver;

    //Construtor da classe:
    public MainPage (AppiumDriver driver) {this.driver = driver;}

    public void ClickStartWebPageButton (){
        driver.findElement(By.id("io.selendroid.testapp:id/buttonStartWebview")).click();
    }
}
