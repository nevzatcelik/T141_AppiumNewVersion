
Feature: kullanici uygulama uzerindeki gorevleri yapar

  Scenario: Kullanici girmis oldugu bilgiler ve formatlar ile uye olabildigini dogrular

    * Uygulama baslatilir
    * hesabim bolumune gider
    * uye ol sayfasina gider
    * kullanici istenen "" "" "" "" "" bilgileri girer
    * basarili bir sekilde uye olundugunu dogrular
    * uygulamayi kapatir

  Scenario: Kullanici daha once uye olunmus bir hesapla yeni uyelik acilamadigini dogrular
    * Uygulama baslatilir
    * hesabim bolumune gider
    * uye ol sayfasina gider
    * kullanici istenen "" "" "" "" "" bilgileri girer
    * kayitli mail ile tekrar uye olunamadigini dogrular
    * uygulamayi kapatir

  @eptt
  Scenario Outline:  Kullanici yanlis bir email formati ile uye olmak istediginde uye olmamali
    * Uygulama baslatilir
    * hesabim bolumune gider
    * uye ol sayfasina gider
    * kullanici istenen "nevzat" "celik" "<mail>" "Nevzat12" "Nevzat12" bilgileri girer
    * hatali bilgiler ile giris yapilamadigini dogrular
    * uygulamayi kapatir
    Examples:
      | mail |
      | @gmail          |
      | nevzat@gmailcom |
      | nevzatgmail.com |
      | 13123123        |

  Scenario: Kullanici kucuk harfli 8 karakter bir sifre girdiginde en az bir harf buyuk kullanilmasini dogrular
     * Uygulama baslatilir
     * hesabim bolumune gider
     * uye ol sayfasina gider
     * kullanici istenen "" "" "" "" "" bilgileri girer
     * kullanici en az bir  buyuk harf icermeli uyarisini dogrular
     * uygulamayi kapatir

  Scenario: Kullanici birbirleriyle eslesmeyen password girdiginde uyusmama hatasi almali
    * Uygulama baslatilir
    * hesabim bolumune gider
    * uye ol sayfasina gider
    * kullanici istenen "" "" "" "" "" bilgileri girer
    * eslesmeyen sifreler ile giris yapilamadigini dogrular
    * uygulamayi kapatir

  Scenario: Kullanici herhangi bir paratmetre girmediginde bu bolumler bos birakilamaz hatalarini dogrular
    * Uygulama baslatilir
    * hesabim bolumune gider
    * uye ol sayfasina gider
    * kullanici istenen "" "" "" "" "" bilgileri girer
    * data girmediginde bu bolumler bos birakilamaz oldugunu dogrular
    * uygulamayi kapatir

   Scenario: Kullanici aydinlatma metnini onaylamadan uygualamaya giris yapilamamali
     * Uygulama baslatilir
     * hesabim bolumune gider
     * uye ol sayfasina gider
     * kullanici istenen "" "" "" "" "" bilgileri girer
     * aydinlatma metni onaylanmadiginda giris yapilamadigini dogrular
     * uygulamayi kapatir

