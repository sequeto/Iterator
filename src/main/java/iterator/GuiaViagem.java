package iterator;

import java.util.Iterator;

public class GuiaViagem {
	public static Integer contarPontosVisitados(Cidade cidade) {
        int quantidade = 0;
        for (PontoTuristico ponto : cidade) {
            if (ponto.isVisitado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTodosOsPontosTuristicos(Cidade cidade) {
        int quantidade = 0;
        for (Iterator pontos = cidade.iterator(); pontos.hasNext(); ) {
            quantidade++;
            pontos.next();
        }
        return quantidade;
    }
}
