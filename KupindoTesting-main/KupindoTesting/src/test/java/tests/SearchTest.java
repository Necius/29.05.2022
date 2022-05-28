package tests;

import driver.Driver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SearchTest extends BaseTest {
    @Before
    public void testSetup() {
        Driver.getBrowser().get("https://www.kupindo.com/");
    }

    @Test
    public void searchAndTryToPurchaseWitoutLogin() throws NullPointerException{

        try {

            kupindo.getHomePage().click(kupindo.getHomePage().getTraziField());
            kupindo.getHomePage().getTraziField().sendKeys("asdfgnnsdlmaeofjldv");
            kupindo.getHomePage().click(kupindo.getHomePage().getTraziButton());
            assertTrue(kupindo.getHomePage().getNemaPredmeta().isDisplayed());

            kupindo.getHomePage().click(kupindo.getHomePage().getTraziField());
            kupindo.getHomePage().getTraziField().sendKeys("metallica");
            kupindo.getHomePage().click(kupindo.getHomePage().getTraziButton2());

//            assertTrue(kupindo.getHomePage().getBreadCrumb().isDisplayed());

            kupindo.getHomePage().click(kupindo.getHomePage().getFirstItem());

            if (kupindo.getHomePage().getPopupDaljeButton() != null) {
                kupindo.getHomePage().click(kupindo.getHomePage().getPopupDaljeButton());
            }

            kupindo.getHomePage().click(kupindo.getHomePage().getKupiOdmahButton());

            assertTrue(kupindo.getHomePage().getUlazTitle().isDisplayed());

        } finally {
            Driver.getBrowser().quit();
        }
    }

}