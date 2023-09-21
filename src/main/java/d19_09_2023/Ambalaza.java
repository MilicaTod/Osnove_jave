package d19_09_2023;

public abstract class Ambalaza {
    private String barKod;
    private String nazivArtikla;
    private double neto;
    private double bruto;
//konstruktori
    public Ambalaza() {
    }

    public Ambalaza(String barKod, String nazivArtikla, double neto, double bruto) {
        this.barKod = barKod;
        this.nazivArtikla = nazivArtikla;
        this.neto = neto;
        this.bruto = bruto;
    }
    //metoda tezina pakovanja
    public double tezinaPakovanja(){
       return this.bruto-this.neto;
    }
    //metoda cena artikla
    public abstract double cena();
    //metoda za stampu
    public abstract void stampaj();

    //getter setter

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double bruto) {
        this.bruto = bruto;
    }
}
