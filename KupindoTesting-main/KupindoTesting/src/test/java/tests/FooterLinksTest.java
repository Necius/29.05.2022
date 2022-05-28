package tests;

import driver.Driver;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FooterLinksTest extends BaseTest {

    @Before
    public void testSetup() {
        Driver.getBrowser().get("https://www.kupindo.com/");
    }

    @Test
    public void testCaseFooterLinks() throws NullPointerException {

        try {
            if (kupindo.getHomePage().getAcceptCookies() != null) {
                kupindo.getHomePage().click(kupindo.getHomePage().getAcceptCookies());
            }

//UniCredit Bank Link
            kupindo.getHomePage().click(kupindo.getHomePage().getUniCreditLink());
            ArrayList<String> tabs2 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs2.get(1));

//            assertEquals("https://www.unicreditbank.rs/rs/pi.html", Driver.getBrowser().getCurrentUrl());

            assertTrue("//*[@id='wraperForMobiles']/header/div[2]/div/div[2]/div[1]/a/img", true);
            Driver.getBrowser().close();

            Driver.getBrowser().switchTo().window(tabs2.get(0));

//AllSecure Link
            kupindo.getHomePage().getAllSecurelink().click();
            ArrayList<String> tabs3 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs3.get(1));

            assertEquals("https://www.allsecure.rs/", Driver.getBrowser().getCurrentUrl());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs3.get(0));

//MasterCard link
            kupindo.getHomePage().getMasterCardLink().click();
            ArrayList<String> tabs4 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs4.get(1));

            assertEquals("https://www.mastercard.us/en-us.html", Driver.getBrowser().getCurrentUrl());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs4.get(0));

//Visa link
            kupindo.getHomePage().getVisaLink().click();
            ArrayList<String> tabs5 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs5.get(1));

            assertEquals("https://rs.visa.com/rs/rs-rs/personal/security/onlineshopping.shtml", Driver.getBrowser().getCurrentUrl());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs5.get(0));

//Ipay link
            kupindo.getHomePage().getIpayLink().click();
            ArrayList<String> tabs6 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs6.get(1));

            assertEquals("https://www.ipay.rs/sr/", Driver.getBrowser().getCurrentUrl());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs5.get(0));


    } finally {
            Driver.getBrowser().quit();
        }
    }
}



