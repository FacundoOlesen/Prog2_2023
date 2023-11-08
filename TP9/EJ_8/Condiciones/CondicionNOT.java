package TP9.EJ_8.Condiciones;
import TP9.EJ_8.Video;

public class CondicionNOT  extends Condicion {

    private Condicion c1;

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    
    }

    @Override
    public boolean cumple(Video v) {
        return !c1.cumple(v);
    }

}
