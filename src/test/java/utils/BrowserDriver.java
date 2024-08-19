package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserDriver {


    private static AndroidDriver appiumDriver;
    private static IOSDriver iosDriver;

    static final String TELEFONADI="Pixel 4";
    static final String ANDROIDVERSION="10.0";
    static final String PLATFORM="Android";
    static final String OTOMASYON_ISMI="UiAutomator2";



    public static AndroidDriver getBrowserDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch ( MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {
            UiAutomator2Options options=new UiAutomator2Options();
            options.setDeviceName(TELEFONADI)
                    .setAutomationName(OTOMASYON_ISMI)
                    .setPlatformVersion(ANDROIDVERSION)
                    .setPlatformName(PLATFORM)
                    .withBrowserName("chrome")
                    .setChromedriverExecutable("");

            /* eger false olursa; her test baslangicinda kullanici datalari(tercihleri) sifirlanir ve uygulama
            her seferinde ilk yuklendigi haliyle calisir
             */
            // eger true olursa,kullanici datalari kaydedilir ve uygualama tekrardan basladiginda tercihler sorulmaz
            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                appiumDriver = new AndroidDriver(appiumServerURL,options);
                appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            }else {

                assert appiumServerURL != null;
                iosDriver = new IOSDriver (appiumServerURL,options);
                iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

                throw new UnsupportedOperationException("Dostum Ios kullanmaya calisiyorsun YAPMA!!");

            }

        }

        return appiumDriver;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.closeApp();
            appiumDriver = null;
        }
    }
}
