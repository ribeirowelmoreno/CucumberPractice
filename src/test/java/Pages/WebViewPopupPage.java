package Pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class WebViewPopupPage {
    private AppiumDriver driver;
    public WebViewPopupPage(AppiumDriver driver) {this.driver = driver;}

    public ClickWebViewPage chooseWebViewType(String webType){
        /** o "//" serve pra checar em todo o arquivo*/
        driver.findElement(By.xpath("//android.widget.TextView[contains(text(), '"+webType+"')]")).click();

        return new ClickWebViewPage(driver);
    }
}
