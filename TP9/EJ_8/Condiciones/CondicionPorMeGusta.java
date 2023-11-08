package TP9.EJ_8.Condiciones;
import TP9.EJ_8.Video;

public class CondicionPorMeGusta extends Condicion {

    private int MG;

    public CondicionPorMeGusta(int MG) {
        this.MG = MG;
    }

    @Override
    public boolean cumple(Video video) {
        return video.getCantMG() > MG;
    }

}
