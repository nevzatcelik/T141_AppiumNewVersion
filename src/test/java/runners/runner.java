package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        // features kisminda birden fazla dosya yolu belirtebiliriz bunu {"content root","2.content root"} eklemesi yapilir
        glue = "stepDefinitions", // features dosyasinda yazilan sozlu metinlerin kod bolumune aktarildigi yer
        tags = "@ab",
        // calismasini istedigimiz herhangi bir feature ya da seneryo uzerine koydugumuz tag
        // ile hanginin calisacagina karar veririz bazen 1 den fazla ekleyebiliriz bunu @smoke or @system seklinde yapariz
        dryRun =false
        /* dry run true ise; features da yazilan seneryolar daki eksik adimlar belirlenmesi icin true da calistirilir
        eksik adimlar olusturuldaktan sonra testin passed olmasi gercek anlamda testimizin passed oldugunu degil
        eksik adim kalmadigini belirtir
         */
        /*
        false ise; artik eksik adim kalmadiginda testlerimizi kosturmak icin false alir testlerimizi baslatiriz
         */
)

public class runner {

}
