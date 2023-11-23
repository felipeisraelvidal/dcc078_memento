package memento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompraTest {

    @Test
    void deveArmazenarEstados() {
        Compra compra = new Compra();
        compra.setEstado(CompraEstadoAprovado.getInstance());
        compra.setEstado(CompraEstadoConfirmado.getInstance());
        assertEquals(2, compra.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Compra compra = new Compra();
        compra .setEstado(CompraEstadoAprovado.getInstance());
        compra .setEstado(CompraEstadoEnviado.getInstance());
        compra .restauraEstado(0);
        assertEquals(CompraEstadoAprovado.getInstance(), compra .getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Compra compra = new Compra();
        compra.setEstado(CompraEstadoAprovado.getInstance());
        compra.setEstado(CompraEstadoConfirmado.getInstance());
        compra.setEstado(CompraEstadoAprovado.getInstance());
        compra.setEstado(CompraEstadoEnviado.getInstance());
        compra.restauraEstado(2);
        assertEquals(CompraEstadoAprovado.getInstance(), compra.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Compra compra = new Compra();
            compra.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
