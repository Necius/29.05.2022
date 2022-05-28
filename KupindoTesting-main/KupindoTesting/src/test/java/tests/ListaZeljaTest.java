package tests;

import driver.Driver;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ListaZeljaTest extends BaseTest{

    @Before
    public void testSetup() {
        Driver.getBrowser().get("https://www.kupindo.com/");
    }

    @Test
    public void testListaZelja (){

        try {

            kupindo.getHomePage().getUlazButton().click();
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getKorisnickoImeField());
            kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getSportskaOpremaLink());
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getOpremaZaPecanje());
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getCenaRastuci());
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getFirstItem());

            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getUbaciUListuZeljaButton());
            assertTrue(kupindo.getSportskaOpremaPage().getListaZeljaBadge().isDisplayed());
            assertTrue(kupindo.getSportskaOpremaPage().getListaZeljaBadge().isEnabled());
            assertTrue(kupindo.getSportskaOpremaPage().getListaZeljaBadgeText().isDisplayed());

            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getListaZeljaButton());

            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getSkiniSaListeButton());
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getDaButton());

            assertFalse("//a[@class = 'badge']", false);

        }finally {
            Driver.getBrowser().quit();
        }
    }


}
