package d12_09_2023;

public class Ugovor {
    private String danMesecGodina;
    private FizickoLice agent;
    private FizickoLice kupac;
    private double cenaNekretnine;
    private String adresaNekretnine;

    public Ugovor(String danMesecGodina, FizickoLice agent, FizickoLice kupac, double cenaNekretnine, String adresaNekretnine) {
        this.danMesecGodina = danMesecGodina;
        this.agent = agent;
        this.kupac = kupac;
        this.cenaNekretnine = cenaNekretnine;
        this.adresaNekretnine = adresaNekretnine;
    }

    public double zarada (){
        if (kupac.isPrethodnoKupovao()){
            return 0.02;
        }else {
            return 0.03;
        }
    }
    public double zaradaAgencije (){
        return 1000 + this.cenaNekretnine * this.zarada();
    }
    public void stampaj () {
        System.out.printf("Dana %sgod sklopljen je ugovor izmedju %s i %s o kupovini nekretnine %s po ceni od %.2f " +
                        "pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od %.2f",
                this.danMesecGodina,
                this.agent.getImePrezime(),
                this.kupac.getImePrezime(),
                this.adresaNekretnine,
                this.cenaNekretnine,
                this.zaradaAgencije());
    }}