import java.util.ArrayList;

public class Libreria {
    private String nombre;
    private ArrayList<Articulo> articulos;
    private ArrayList<Cliente> clientes;

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addArticulo(Articulo a) {
        if (!this.articulos.contains(a))
            this.articulos.add(a);
    }

    public void addCliente(Cliente c) {
        if (!this.clientes.contains(c))
            this.clientes.add(c);
    }

    public double getPrecioDescuento(Articulo articulo, Cliente cliente) {
        return articulo.getPrecio() - articulo.getPrecio() * cliente.getDescuento();
    }

    public ArrayList<Cliente> listarClientesConMeGusta(Articulo articulo) {
        ArrayList<Cliente> lista = new ArrayList<>();
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).leGusta(articulo))
                lista.add(clientes.get(i));
        }
        return lista;
    }
}
