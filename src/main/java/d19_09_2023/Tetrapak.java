package d19_09_2023;

public class Tetrapak extends Ambalaza {
    private boolean zaReciklazu;
    private double osnovnaCena;
    //konstruktor

    public Tetrapak(String barKod, String nazivArtikla, double neto, double bruto, boolean zaReciklazu, double osnovnaCena) {
        super(barKod, nazivArtikla, neto, bruto);
        this.zaReciklazu = zaReciklazu;
        this.osnovnaCena = osnovnaCena;
    }
    //cena

    @Override
    public double cena() {
        if(zaReciklazu){
          return  this.osnovnaCena+(this.tezinaPakovanja()*1.5);
        }return this.osnovnaCena;
    }
    //stampa

    public void stampaj() {
        System.out.println("Barkod: " + this.getBarKod());
        System.out.println("Naziv artikla: " + this.getNazivArtikla());
        System.out.println("Tezina: " + this.tezinaPakovanja());
        System.out.print("Da li se moze reciklirati: ");
        if(this.zaReciklazu) {
            System.out.println(" da");
        } else {
            System.out.println(" ne");
        }
        System.out.println("Cena: " + this.cena());
        System.out.println();
    }


    //getter setter

    public boolean isZaReciklazu() {
        return zaReciklazu;
    }

    public void setZaReciklazu(boolean zaReciklazu) {
        this.zaReciklazu = zaReciklazu;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
}
