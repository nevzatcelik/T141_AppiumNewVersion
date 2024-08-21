package pages;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class EpttAvm {

    public EpttAvm(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }

    @FindBy(id = "com.pttem.epttavm:id/buttonOpenAccountPage")
    public WebElement accountButton;

    @FindBy(id = "com.pttem.epttavm:id/buttonSignUp")
    public WebElement signUpButton;

    @FindBy(id = "com.pttem.epttavm:id/editTextUserName")
    public WebElement isim;

    @FindBy(id = "com.pttem.epttavm:id/editTextUserSurname")
    public WebElement soyisim;

    @FindBy(id = "com.pttem.epttavm:id/editTextUserEmail")
    public WebElement email;

    @FindBy(id = "com.pttem.epttavm:id/editTextPassword")
    public WebElement sifre;

    @FindBy(id = "com.pttem.epttavm:id/editTextPasswordAgain")
    public WebElement tekrarSifre;

    @FindBy(id = "com.pttem.epttavm:id/checkBoxReadTerms")
    public WebElement metinKutu;
}
