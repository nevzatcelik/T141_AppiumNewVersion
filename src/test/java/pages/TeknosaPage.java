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
}
