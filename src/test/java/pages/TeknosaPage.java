package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TeknosaPage {
    public TeknosaPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }

    @FindBy(xpath = "//*[@text='Atla']")
    public WebElement atlaButonu;

    @FindBy(xpath = "//*[@text='Filtrele']")
    public WebElement filtereButonu;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement markaMetinKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[25]")
    public WebElement filtrelenmisMarkaKutucuk;

    @FindBy(xpath = "//*[@text='Sonuçları Göster']")
    public WebElement sonculariGoster;

    @FindBy(xpath = "//*[@text='Sırala']")
    public WebElement siralaButton;

    @FindBy(xpath = "//*[@text='Marka']")
    public WebElement markaButonu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[13]")
    public WebElement enPahaliFiyat;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[19]")
    public WebElement enUcuzFiyat;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[7]")
    public  WebElement enUcuzTcl;

    @FindBy(xpath = "(//*[@text='Sepete Ekle'])")
    public WebElement sepeteEkleButton;

    @FindBy(xpath = "(//*[@text='Sepetime Git'])")
    public WebElement sepeteGitButton;

    @FindBy(xpath = "//*[@text='+']")
    public WebElement artiButonu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[7]")
    public WebElement fiyatText;




}
