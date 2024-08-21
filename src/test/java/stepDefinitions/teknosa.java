package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TeknosaPage;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;

public class teknosa {
   TeknosaPage page=new TeknosaPage();


    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
      Driver.getAndroidDriver();
    }
    @Given("Ilk ekran bolumunden atlaya tiklanir")
    public void ılk_ekran_bolumunden_atlaya_tiklanir() {
      page.atlaButonu.click();
    }
    @Given("footer bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumune_tiklanir(String footerSecim) {
     ReusableMethods.scrollWithUiScrollableAndClick(footerSecim);
    }
    @Given("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_telefon_bolumune_tiklanir(String kategoriSecim) {
    ReusableMethods.scrollWithUiScrollableAndClick(kategoriSecim);
    }
    @Given("telefon sayfasindan cihaz {string} secimi yapilir")
    public void telefon_sayfasindan_cihaz_secimi_yapilir(String cihazSecim) {
     ReusableMethods.scrollWithUiScrollableAndClick(cihazSecim);
    }
    @Given("filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {
         ReusableMethods.bekle(2);
        page.filtereButonu.click();
    }
    @Given("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String marka) {
           page.markaButonu.click();
           page.markaMetinKutusu.sendKeys(marka);
           ReusableMethods.bekle(2);
          page.filtrelenmisMarkaKutucuk.click();
          ReusableMethods.bekle(2);
          page.sonculariGoster.click();
    }
    @Given("siralama yapilirak {string} secilir")
    public void siralama_yapilirak_azalan_fiyat_secilir(String filtreSecimi) {
     ReusableMethods.bekle(2);
     page.siralaButton.click();
      ReusableMethods.scrollWithUiScrollableAndClick(filtreSecimi);


    }
    @Given("fiyatlarin azalan duzende oldugu test edilir")
    public void fiyatlarin_azalan_duzende_oldugu_test_edilir() {
     ReusableMethods.bekle(4);
     String enPahaliFiyat=page.enPahaliFiyat.getText();
     enPahaliFiyat=enPahaliFiyat.replaceAll("\\D","");
     System.out.println(enPahaliFiyat);
    // ReusableMethods.ekranKaydirmaMethodu(511,2037,750,511,639);
     ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,200);
     String enUcuzFiyat=page.enUcuzFiyat.getText();
     enUcuzFiyat=enUcuzFiyat.replaceAll("\\D","");
     System.out.println(enUcuzFiyat);
     Assert.assertTrue(Integer.parseInt(enPahaliFiyat)>Integer.parseInt(enUcuzFiyat));
    }

    @Given("en ucuz cihaz a tiklanir")
    public void en_ucuz_cihaz_a_tiklanir() {
      page.enUcuzTcl.click();
    }
    @Given("cihaz sepete eklenir")
    public void cihaz_sepete_eklenir() {
     page.sepeteEkleButton.click();
    }
    @Given("sepetime git bolumune tiklanir")
    public void sepetime_git_bolumune_tiklanir() {
      page.sepeteGitButton.click();
    }
    @Given("urunun sayisi arttirildiginda fiyatinin arttirildigi dogrulanir")
    public void urunun_sayisi_arttirildiginda_fiyatinin_arttirildigi_dogrulanir() {
       String urununIlkFiyati=page.fiyatText.getText(); // 2.169,00
       urununIlkFiyati=urununIlkFiyati.replaceAll("\\D",""); // 216900
       urununIlkFiyati=urununIlkFiyati.substring(0,urununIlkFiyati.length()-2);// 2169
       System.out.println(urununIlkFiyati);
       page.artiButonu.click();
       ReusableMethods.bekle(2);
       String urununIkinciFiyati=page.fiyatText.getText(); // 4.338,00 TL
       urununIkinciFiyati=urununIkinciFiyati.replaceAll("\\D",""); // 438800
       urununIkinciFiyati=urununIkinciFiyati.substring(0,urununIkinciFiyati.length()-2); // 4338
       System.out.println(urununIkinciFiyati);
       Assert.assertEquals(Integer.parseInt(urununIlkFiyati)*2,Integer.parseInt(urununIkinciFiyati));

    }
    @Given("kullanici ekran fotografi cekmek istedigi elementin {string} ekran fotografini ceker")
    public void kullanici_ekran_fotografi_cekmek_istedigi_elementin_ekran_fotografini_ceker(String ssText) throws IOException, InterruptedException {
     ReusableMethods.screenShotElement(ssText);
     ReusableMethods.koordinatTiklamaMethodu(150,1500,200);
    }
}
