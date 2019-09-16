package Support;

import gherkin.lexer.De;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class NativeApp {

    public static AndroidDriver createApp() throws MalformedURLException{
        File appCreation = new File(("D:\\Wellynton\\Projetos\\Appium\\appium\\App\\selendroid-test-app-0.17.0.apk"));
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

        //usado para instalar a aplicação no device e rodar
        capabilities.setCapability(MobileCapabilityType.APP, appCreation.getAbsolutePath());

        //usado para dar launch em uma aplicação já instalada no device
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.selendroid.testapp");
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".HomeScreenActivity");

        //comando pelo prompt para ver qual aplicaçaõ está rodando e pegar a activity e usá-la, caso necessário
        //adb shell
        //dumpsys window windows | grep -E 'mCurrentFocus'
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;
    }
}
