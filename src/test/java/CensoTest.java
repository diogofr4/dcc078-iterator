import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CensoTest {
    @Test
    void deveContarResidenteComCovidCasa() {
        Casa casa = new Casa(
                new Residente("Fulano", true),
                new Residente("Beutrano", false),
                new Residente("Cicrano", false),
                new Residente("Lorem", true),
                new Residente("Ipsum", true)
        );

        assertEquals(3, Censo.contarResidentesComCovidCasa(casa));
    }

    @Test
    void deveContarTotalAlunosCurso() {
        Casa casa = new Casa(
                new Residente("Fulano", true),
                new Residente("Beutrano", false),
                new Residente("Cicrano", false),
                new Residente("Lorem", true),
                new Residente("Ipsum", true)
        );
        
        assertEquals(5, Censo.contarTotalResidentesCasa(casa));
    }
}
