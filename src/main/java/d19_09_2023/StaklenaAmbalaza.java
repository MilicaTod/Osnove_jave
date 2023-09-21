package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza{
    private double kaucija;
    private boolean placaSe;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barKod, String nazivArtikla, double neto, double bruto, double kaucija, boolean placaSe, double osnovnaCena) {
        super(barKod, nazivArtikla, neto, bruto);
        this.kaucija = kaucija;
        this.placaSe = placaSe;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        if(placaSe){
            return this.osnovnaCena*1.2;
        }
        return cena();
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.getBarKod());
        System.out.println("Naziv artikla: " + this.getNazivArtikla());
        System.out.println("Tezina: " + this.tezinaPakovanja());
        System.out.print("Da li se placa kaucija za flasu: ");
        if(this.placaSe) {
            System.out.println(" da");
        } else {
            System.out.println(" ne");
        }
        System.out.println("Cena: " + this.cena());
        System.out.println();

    }

    public double getKaucija() {
        return kaucija;
    }

    public boolean isPlacaSe() {
        return placaSe;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }
}
