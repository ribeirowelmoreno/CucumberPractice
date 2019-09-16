package Steps;

import Pages.*;
import Support.NativeApp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import sun.security.util.PendingException;

import java.net.MalformedURLException;

public class RegisterUserSteps {
    private AndroidDriver driver;

    AssertionVerify mAssertionVerify;
    ClickWebViewPage mClickWebViewPage;
    MainPage mMainPage;
    ScrollTo mScrollTo;
    WebViewChooserListPage mWebViewChooserListPage;
    WebViewPopupPage mWebViewPopupPage;

    /** Instaciamento serve para não ter que ficar dando New sempre que for escrever um step. Nesse caso, fazendo direto, não se guarda o estado
     * do driver para ir para outra page, por exemplo
     */

    @Before
    public void setUP() throws MalformedURLException{
        driver = NativeApp.createApp();
        mMainPage = new MainPage(driver);
        mAssertionVerify = new AssertionVerify(driver);
        mClickWebViewPage = new ClickWebViewPage(driver);
        mScrollTo = new ScrollTo(driver);
        mWebViewChooserListPage = new WebViewChooserListPage(driver);
        mWebViewPopupPage = new WebViewPopupPage(driver);
    }


    @Given("^user access the Selendroid-test-app app$")
    public void user_access_the_Selendroid_test_app_app(){
    }

    @When("^user clicking in StartWebView button$")
    public void user_clicking_in_StartWebView_button(){
        mMainPage.ClickStartWebPageButton();
    }

    @When("^click on WebView chooser list$")
    public void click_on_WebView_chooser_list(){
        mWebViewChooserListPage.openPopupWebViewChooser();
    }

    @When("^select the WebView type$")
    public void select_the_WebView_type(String webPageType){
        mWebViewPopupPage.chooseWebViewType("Clicks");
    }

    @When("^click a link inside the page$")
    public void click_a_link_inside_the_page(){
        mClickWebViewPage.clickingIGoToATaget();
    }

    @Then("^user should be the text inside the text box$")
    public void user_should_be_the_text_inside_the_text_box(){
        mAssertionVerify.checkText();
    }
}
