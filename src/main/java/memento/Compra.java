package memento;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private CompraEstado estado;
    private List<CompraEstado> memento = new ArrayList<CompraEstado>();

    public CompraEstado getEstado() {
        return this.estado;
    }

    public void setEstado(CompraEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<CompraEstado> getEstados() {
        return this.memento;
    }
}

