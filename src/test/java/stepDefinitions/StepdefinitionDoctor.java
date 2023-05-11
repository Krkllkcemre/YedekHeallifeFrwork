package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DoktorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMmethod;

public class StepdefinitionDoctor
{



    @Given("Browser açılır ve gerekli {string} gidilir.")
    public void browser_açılır_ve_gerekli_gidilir(String url)
    {

        Driver.getDriver().get(ConfigReader.getProperty("doktorLoginUrl"));

        ReusableMmethod.bekle(1);


    }
    @Then("Kullanıcı email ve password bilgileri girilip sing ın butonuna tıklanır.")
    public void kullanıcı_email_ve_password_bilgileri_girilip_sing_ın_butonuna_tıklanır()
    {


    }
    @Then("Dashboard sidebar'dan {string} linkine tıklanır.")
    public void dashboard_sidebar_dan_linkine_tıklanır(String string) {

    }
    @Then("Kullanıcı {string} bölüme geldigi dogrulanır")
    public void kullanıcı_bölüme_geldigi_dogrulanır(String string) {

    }

    @Then("The browser is closed.")
    public void the_browser_is_closed() {

    }




}
