package Pages;

import org.openqa.selenium.WebElement;

public class SportskaOpremaPage extends BasePage {

    private String sportskaOpremaLink = "//*[@id='home-categories-navbar-collapse']/ul/li[14]/h2/a";
    public WebElement getSportskaOpremaLink() {
        return findElement(sportskaOpremaLink);
    }

    private String opremaZaPecanje = "//*[contains(text(),'Oprema za pecanje')]";
    public WebElement getOpremaZaPecanje() {
        return findElement(opremaZaPecanje);
    }

    private String cenaRastuci = "//*[@id='container_right']/div[1]/div[1]/select/option[2]";
    public WebElement getCenaRastuci (){
        return findElement(cenaRastuci);
    }

    private String firstItem = "//*[@id='container_right']/div[3]";
    public WebElement getFirstItem(){
        return findElement(firstItem);
    }

    private String listaZeljaButton = "//*[@id='navbar-collapse-1']/ul/li[5]/a";
    public WebElement getListaZeljaButton(){
        return findElement(listaZeljaButton);
    }

    private String ubaciUListuZeljaButton = "//button[@class = 'btn btn-default btn-sm btn_padding']";
    public WebElement getUbaciUListuZeljaButton(){
        return findElement (ubaciUListuZeljaButton);
    }


    private String listaZeljaBadge = "//a[@class = 'badge']";
    public WebElement getListaZeljaBadge(){
        return findElement(listaZeljaBadge);
    }

    private String listaZeljaBadgeText = "//ul/li[6]/a[text()='1']";
    public WebElement getListaZeljaBadgeText (){
        return findElement(listaZeljaBadgeText);
    }

//    private String itemInListaZelja = "//div[@class = 'block_anc']";
//    public WebElement getItemInListaZelja (){
//        return findElement(itemInListaZelja);
//    }

    private String skiniSaListeButton = "//a[@class = 'delete']";
    public WebElement getSkiniSaListeButton (){
        return findElement(skiniSaListeButton);
    }

    private String daButton = "//button[@id = 'btnConfirm']";
    public WebElement getDaButton (){
        return findElement(daButton);
    }

    private String navbar = "//div[@class = 'menu_big']";
    public WebElement getNavbar (){
        return findElement(navbar);
    }

}
