package d18_09_2023;

public class AudioControl extends Control {
    private boolean smanjeno;

    public AudioControl() {
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (smanjeno) {
            videoPlayer.setZvuk(videoPlayer.getZvuk()-1);
            if(videoPlayer.getDuzinaVidea()<0){
                videoPlayer.setDuzinaVidea(0);
            }
        } else {
            videoPlayer.setZvuk(videoPlayer.getZvuk() + 1);
        }
        if (videoPlayer.getDuzinaVidea()>100) {
            videoPlayer.setDuzinaVidea(100);
        }
    }

    public boolean isSmanjeno() {
        return smanjeno;
    }

    public void setSmanjeno(boolean smanjeno) {
        this.smanjeno = smanjeno;
    }
}
