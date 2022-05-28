package tests;

import driver.Driver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LoginTest extends BaseTest {

    @Before
    public void testSetup() {
        Driver.getBrowser().get("https://www.kupindo.com/");
    }

    @Test
    public void test01_LoginWithValidCredentials() {
        try {
            assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());

            kupindo.getHomePage().click(kupindo.getHomePage().getUlazButton());
            assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());

            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getKorisnickoImeField());
            kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

            assertEquals("https://www.kupindo.com/", Driver.getBrowser().getCurrentUrl());
            assertTrue(kupindo.getHomePage().getIzlazButton().isDisplayed());
            assertTrue(kupindo.getHomePage().getClanLink().isDisplayed());
            assertTrue(kupindo.getHomePage().getClanLink().isEnabled());

        } finally {
            Driver.getBrowser().quit();
        }
    }

    @Test
    public void test02_LoginWithInvalidCredentials() {
        try {
            assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());
            assertTrue(kupindo.getHomePage().getUlazButton().isEnabled());
            kupindo.getHomePage().click(kupindo.getHomePage().getUlazButton());
            assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("1234");

            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getLozinkaField().sendKeys("1234");

            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

            assertTrue(kupindo.getPrijavaPage().getPogresnoKorisnickoImeIliLozinka().isDisplayed());
        }finally {
            Driver.getBrowser().quit();
        }
    }

    @Test
    public void test03_Logout() {
        try {
            kupindo.getHomePage().getUlazButton().click();
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getKorisnickoImeField());
            kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

            kupindo.getHomePage().click(kupindo.getHomePage().getIzlazButton());

            assertEquals("https://www.kupindo.com/Odjava", Driver.getBrowser().getCurrentUrl());
            assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());
        }finally {
            Driver.getBrowser().quit();
        }
    }

}

