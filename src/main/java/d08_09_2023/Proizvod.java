package d08_09_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;
    public void stampaj(){
        System.out.println(this.naziv+"-cena: "+this.cena+" din, tezina: "+ this.tezina+" g");
    }
    public void povecajCenu(double povecanje){
        this.cena = this.cena+ povecanje;
    }
    public double vratiCenuSaPopustom(int popust){
        double iznosPopusta = this.cena * popust/100;
        return this.cena = this.cena - iznosPopusta;
    }
    public int racunajPostarinu(){
        if(this.tezina <= 100)
            return 200;
        else if (this.tezina>100 && this.tezina <=500)
            return 400;
        else return 1000;
}}
