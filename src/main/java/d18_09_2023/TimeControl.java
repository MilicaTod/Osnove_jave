package d18_09_2023;

public class TimeControl extends Control {
    private boolean napred;

    public TimeControl() {
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (napred)
            videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() + 15);
        if (videoPlayer.getDuzinaVidea() < videoPlayer.getTrenutnoVreme()) {
            videoPlayer.setTrenutnoVreme(videoPlayer.getDuzinaVidea());
        } else {
            videoPlayer.setTrenutnoVreme(videoPlayer.getTrenutnoVreme() - 15);
            if (videoPlayer.getTrenutnoVreme() < 0) {
                videoPlayer.setTrenutnoVreme(0);
            }
        }
    }

    public boolean isNapred() {
        return napred;
    }

    public void setNapred(boolean napred) {
        this.napred = napred;
    }
}
