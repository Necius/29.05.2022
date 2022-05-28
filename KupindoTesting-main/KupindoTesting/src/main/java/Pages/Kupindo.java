package Pages;

public class Kupindo {

    private HomePage homePage;
    private PrijavaPage prijavaPage;
    private SportskaOpremaPage sportskaOpremaPage;
    private ListaZeljaPage listaZeljaPage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public PrijavaPage getPrijavaPage() {
        if (prijavaPage == null) {
            prijavaPage = new PrijavaPage();
        }
        return prijavaPage;
    }

    public SportskaOpremaPage getSportskaOpremaPage() {
        if (sportskaOpremaPage == null) {
            sportskaOpremaPage = new SportskaOpremaPage();
        }
        return sportskaOpremaPage;
    }

    public ListaZeljaPage getListaZeljaPage() {
        if (listaZeljaPage == null) {
            listaZeljaPage = new ListaZeljaPage();
        }
        return listaZeljaPage;
    }


}

