package d18_09_2023;

public class QualityOptimizerControl extends Control {
    private double brzinaNeta;

    public QualityOptimizerControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitet=this.brzinaNeta * 10.1;
        if (kvalitet<=144) {
            videoPlayer.setKvalitetVidea(144);}
        else if(kvalitet<=240){
            videoPlayer.setKvalitetVidea(240);}
        else if(kvalitet<=360){
            videoPlayer.setKvalitetVidea(360);}
        else if(kvalitet<=480){
            videoPlayer.setKvalitetVidea(480);}
        else if(kvalitet<=720){
            videoPlayer.setKvalitetVidea(720);}
        else if(kvalitet<=1080){
            videoPlayer.setKvalitetVidea(1080);
            }

        }

    public double getBrzinaNeta() {
        return brzinaNeta;
    }

    public void setBrzinaNeta(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }
}

