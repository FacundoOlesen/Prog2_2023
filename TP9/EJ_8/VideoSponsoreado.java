package TP9.EJ_8;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_8.Condiciones.Condicion;

public class VideoSponsoreado extends Grupo {
    Video video;

    public VideoSponsoreado(String titulo, int segsDemora, Video video) {
        super(titulo, segsDemora);
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public ArrayList<Video> getVideosQueCumplenOrdenados(Condicion c, Comparator<Video> orden) {
        ArrayList<Video> resultado = new ArrayList<>();
        resultado.add(video);
        resultado.addAll(super.getVideosQueCumplenOrdenados(c, orden));
        return resultado;
    }
}
