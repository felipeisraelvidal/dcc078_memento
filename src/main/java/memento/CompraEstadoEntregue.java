package memento;

public class CompraEstadoEntregue implements CompraEstado {

    private CompraEstadoEntregue() {};
    private static CompraEstadoEntregue instance = new CompraEstadoEntregue();
    public static CompraEstadoEntregue getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Entregue";
    }

}
