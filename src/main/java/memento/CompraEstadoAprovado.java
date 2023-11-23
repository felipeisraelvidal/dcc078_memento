package memento;

public class CompraEstadoAprovado implements CompraEstado {

    private CompraEstadoAprovado() {};
    private static CompraEstadoAprovado instance = new CompraEstadoAprovado();
    public static CompraEstadoAprovado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aprovado";
    }

}
