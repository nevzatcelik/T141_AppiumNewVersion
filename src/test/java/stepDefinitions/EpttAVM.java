package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.EpttAvm;


public class EpttAVM {
          EpttAvm avmpage=new EpttAvm();
    @Given("hesabim bolumune gider")
    public void hesabim_bolumune_gider() {
        avmpage.accountButton.click();
    }
    @Given("uye ol sayfasina gider")
    public void uye_ol_sayfasina_gider() {
    avmpage.signUpButton.click();
    }
    @Given("kullanici istenen {string} {string} {string} {string} {string} bilgileri girer")
    public void kullanici_istenen_bilgileri_girer(String isim,String soyisim,String mail,String sifre,String sifre2) {
     avmpage.isim.sendKeys(isim);
     avmpage.soyisim.sendKeys(soyisim);
     avmpage.email.sendKeys(mail);
     avmpage.sifre.sendKeys(sifre);
     avmpage.tekrarSifre.sendKeys(sifre);
    }
    @Given("basarili bir sekilde uye olundugunu dogrular")
    public void basarili_bir_sekilde_uye_olundugunu_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("uygulamayi kapatir")
    public void uygulamayi_kapatir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("kayitli mail ile tekrar uye olunamadigini dogrular")
    public void kayitli_mail_ile_tekrar_uye_olunamadigini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("hatali bilgiler ile giris yapilamadigini dogrular")
    public void hatali_bilgiler_ile_giris_yapilamadigini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("kullanici en az bir  buyuk harf icermeli uyarisini dogrular")
    public void kullanici_en_az_bir_buyuk_harf_icermeli_uyarisini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("eslesmeyen sifreler ile giris yapilamadigini dogrular")
    public void eslesmeyen_sifreler_ile_giris_yapilamadigini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("data girmediginde bu bolumler bos birakilamaz oldugunu dogrular")
    public void data_girmediginde_bu_bolumler_bos_birakilamaz_oldugunu_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("aydinlatma metni onaylanmadiginda giris yapilamadigini dogrular")
    public void aydinlatma_metni_onaylanmadiginda_giris_yapilamadigini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
