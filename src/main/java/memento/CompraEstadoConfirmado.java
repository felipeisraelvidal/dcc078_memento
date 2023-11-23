package memento;

public class CompraEstadoConfirmado implements CompraEstado {

    private CompraEstadoConfirmado() {};
    private static CompraEstadoConfirmado instance = new CompraEstadoConfirmado();
    public static CompraEstadoConfirmado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Confirmado";
    }

}
