package d14_09_2023;

import java.util.ArrayList;

public class Student {
    private String brojIndeksa;
    private String imePrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(String brojIndeksa, String imePrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        ispiti.add(ispit);
    }

    public double izracunajProsek() {
        int brojPolozenihIspita = 0;
        int sumaOcena = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).isIspitPolozen()) {
                sumaOcena = sumaOcena + this.ispiti.get(i).getOcena();
                brojPolozenihIspita++;
            }
        }
        if (brojPolozenihIspita == 0) {
            return 0.0;
        } else {
            return (double) sumaOcena / brojPolozenihIspita;
        }
    }

    public void stampaj() {
        System.out.println(this.brojIndeksa + " - " + this.imePrezime + " - " + this.tipStudija);
        for (int i = 0; i < this.ispiti.size(); i++) {
            this.ispiti.get(i).stampajIspit();
        }
        System.out.println("Prosecna ocena: " + izracunajProsek());
    }}