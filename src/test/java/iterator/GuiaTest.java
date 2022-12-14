package iterator;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuiaTest {

	@Test
    public void deveContarPontosVisitadosNoRioDeJaneiro() {
        Cidade cidade = new Cidade(
                new PontoTuristico("Cristo Redentor", true),
                new PontoTuristico("Museu do amanhã", true),
                new PontoTuristico("Maracanã", false),
                new PontoTuristico("Parque Nacional da Tijuca", false)
        );
        assertEquals(2, GuiaViagem.contarPontosVisitados(cidade), 0);
    }

    @Test
    public void deveContarTodosOsPontosDeRoma() {
    	Cidade cidade = new Cidade(
                new PontoTuristico("Coliseu", true),
                new PontoTuristico("Panteão", true),
                new PontoTuristico("Fonte de Trevi", false),
                new PontoTuristico("Basílica de São pedro", false)
        );
        assertEquals(4, GuiaViagem.contarTodosOsPontosTuristicos(cidade), 0);
    }

}
