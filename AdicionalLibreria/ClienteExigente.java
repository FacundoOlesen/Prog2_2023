public class ClienteExigente extends Cliente {

    public ClienteExigente(String nombre, String apellido, int dNI, String direccion, double descuento) {
        super(nombre, apellido, dNI, direccion, descuento);
    }

    @Override
    public boolean leGusta(Articulo art) {
        if (super.leGusta(art)) {
            for (int i = 0; i < generosFav.size(); i++) {
                if (art.getGeneros().contains(generosFav.get(i)))
                    return true;
            }
        }
        return false;
    }

}
