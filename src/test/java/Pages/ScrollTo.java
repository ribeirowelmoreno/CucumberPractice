package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ScrollTo {
    private AppiumDriver driver;

    public ScrollTo (AndroidDriver driver) {this.driver = driver;};

    public ScrollTo scrollToText(String startText, String endText){
        //Identify Elememt using Text
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().className("+startText+")).scrollIntoView("
                        + "new UiSelector().text("+endText+"))"));

        //Perform the action on the element
        element.click();

//        "android.view.View"

//        "Some text"
        return this;
    }
}
