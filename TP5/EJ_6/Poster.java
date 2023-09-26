package TP5.EJ_6;

public class Poster extends Trabajo {

    public Poster(){}

    @Override
    public boolean puedeAsignarseA(Evaluador evaluador) {
        for (int i = 0; i < evaluador.getTemas().size(); i++) {
            String temaI =evaluador.getTemas().get(i);
            if (this.temas.contains(temaI)) {
                return true;
            }
        }
        return false;
    }

    
    
}
