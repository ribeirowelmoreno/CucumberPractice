package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class WebViewChooserListPage {
    private AppiumDriver driver;
    public WebViewChooserListPage(AppiumDriver driver)  {this.driver = driver;}

    public WebViewPopupPage openPopupWebViewChooser(){
        driver.findElement(By.id("io.selendroid.testapp:id/spinner_webdriver_test_data")).click();

        return new WebViewPopupPage(driver);
    }
}
