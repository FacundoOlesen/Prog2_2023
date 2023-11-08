package Examenes.Parcial2022;

import java.util.ArrayList;

import Examenes.Parcial2022.Condiciones.Condicion;

public abstract class Elemento {
    public abstract String getCategoria();
    public abstract ArrayList<String> getPalabrasClave();
    public abstract ArrayList<Noticia> buscar(Condicion c);
}
