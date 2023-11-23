package memento;

public class CompraEstadoEnviado implements CompraEstado {

    private CompraEstadoEnviado() {};
    private static CompraEstadoEnviado instance = new CompraEstadoEnviado();
    public static CompraEstadoEnviado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Enviado";
    }

}
