package d18_09_2023;

public class VideoPlayer {
private int duzinaVidea;
private int trenutnoVreme;
private int zvuk;
private int kvalitetVidea;

    public VideoPlayer() {
    }

    public VideoPlayer(int duzinaVidea, int trenutnoVreme, int zvuk, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVreme = trenutnoVreme;
        this.zvuk = zvuk;
        this.kvalitetVidea = kvalitetVidea;
    }

    public void stampaj(){
        System.out.println("Trenutno vreme videa:"+this.trenutnoVreme);
        System.out.println("Jacina zvuka:"+this.zvuk);
        System.out.println("Kvalitet videa:"+this.kvalitetVidea);
    }

    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getZvuk() {
        return zvuk;
    }

    public void setZvuk(int zvuk) {
        this.zvuk = zvuk;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
}
