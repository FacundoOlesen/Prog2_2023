package TP9.EJ_8;

public class VideoClave extends Video {

    public VideoClave(String titulo, Usuario usuario, int duracion, int cantVisualizaciones, int cantMG, int cantNoMG,
            int anioPublicacion, String palabraClave) {
        super(titulo, usuario, duracion, cantVisualizaciones, cantMG, cantNoMG, anioPublicacion);
    }

    @Override
    public boolean contienePalabra(String palabra) {
        return true;
    }

    
    
}
