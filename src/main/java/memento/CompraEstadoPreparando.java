package memento;

public class CompraEstadoPreparando implements CompraEstado {

    private CompraEstadoPreparando() {};
    private static CompraEstadoPreparando instance = new CompraEstadoPreparando();
    public static CompraEstadoPreparando getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Preparando";
    }

}
