package TP7.EJ_1;

public class Principal {
    public static void main(String[] args) {
        EmpresaAgricola EmpresaAgricola = new EmpresaAgricola("Empresa Agricola Tandil");

        ProductoQuimico ProductoQuimico1 = new ProductoQuimico("Insecticida");
        ProductoQuimico1.addEstadoPatologicoTrata("Roturas");
        ProductoQuimico1.addEstadoPatologicoTrata("Ramas Rotas");

        ProductoQuimico ProductoQuimico2 = new ProductoQuimico("Hormiguicida");
        ProductoQuimico2.addEstadoPatologicoTrata("Roturas");

        Enfermedad Enfermedad1 = new Enfermedad("Hojas rotas");

        Enfermedad1.addEstadoPatologico("Roturas");
        Enfermedad1.addEstadoPatologico("Ramas Rotas");

        EmpresaAgricola.addProductoQuimico(ProductoQuimico1);
        EmpresaAgricola.addProductoQuimico(ProductoQuimico2);

        EmpresaAgricola.addEnfermedad(Enfermedad1);
        Cultivo c1 = new Cultivo("Cultivo 1");
        c1.addEnfermedadFrecuente(Enfermedad1);

        CondicionDeBusqueda cond1 = new CondicionPorEnfermedad(Enfermedad1);
        CondicionDeBusqueda cond2 = new CondicionPorCultivo(Enfermedad1, c1);
        CondicionDeBusqueda cond3 = new CondicionPorCultivosUsables(c1);

        CondicionDeBusqueda condAND = new CondicionAnd(cond1, cond2);

        CondicionDeBusqueda condANDCompleta = new CondicionAnd(condAND, cond3);

        System.out.println(
                "Lista de agroquimicos que pueden ser utilizados en la enfermedad: " + Enfermedad1.getNombre() + " " + EmpresaAgricola.productoQuimicoTrata(cond1));

        System.out.println("Productos quimicos que pueden tratar la enfermedad: " + Enfermedad1.getNombre()
                + " y pueden ser usados por el cultivo: " +
                c1.getNombre() + " y no tienen prohibido ser utilizados en el cultivo mencionado." +
                EmpresaAgricola.productoQuimicoTrata(condANDCompleta));

    }
}