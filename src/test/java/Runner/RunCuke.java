package Runner;

import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import java.io.File;

/**PRA RODAR OS TESTES PRECISA INSTALAR UM PLUGIN DO CUCUMBER FOR JAVA NO INTELLIJ**/
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"json:target/cucumber.json", "pretty", "html:target/cucumber","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
        ,features = {"src/test/java/Features"}
        ,glue={"steps"}
        //,monochrome=true
        /**Teags dos testes**/
        ,tags={"@Check-what-is-your-favorite-car--UserStory01,@Check-success-message-AcceptanceCriteria01"}


)

public class RunCuke {
    @BeforeClass
    public static void setup() {

        /**Saida do report**/
        ExtentCucumberFormatter.initiateExtentCucumberFormatter();
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/test/java/extent-config.xml"));
        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v49.0.1");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

    }

}
