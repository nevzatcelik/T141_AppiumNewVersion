package stepDefinitions;

import io.cucumber.java.en.Given;
import utils.Driver;

import java.awt.dnd.DragGestureEvent;

public class deneme {

    @Given("kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {
        Driver.getAndroidDriver();
    }
}
