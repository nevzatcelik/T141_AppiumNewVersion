package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AndroidDriver appiumDriver;
    private static IOSDriver iosDriver;

    static final String TELEFONADI="Pixel 8 Pro";
    static final String ANDROIDVERSION="11.0";
    static final String PLATFORM="Android";
    static final String OTOMASYON_ISMI="UiAutomator2";

    public static AndroidDriver getAndroidDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http://127.0.0.1:4723/");
        } catch ( MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {

            UiAutomator2Options options=new UiAutomator2Options();
            options.setUdid("emulator-5554")
                    .setApp("C:\\Users\\ahmet\\IdeaProjects\\AppiumNewVersion_T141\\Apps\\Teknosa – Alışveriş, Teknoloji_7.2.6_APKPure.apk");

            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                appiumDriver = new AndroidDriver(appiumServerURL,options);
                appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            }else {

                assert appiumServerURL != null;
                iosDriver = new IOSDriver(appiumServerURL,options);
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
