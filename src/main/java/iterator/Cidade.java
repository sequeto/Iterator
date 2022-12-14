package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Cidade implements Iterable<PontoTuristico>{
	private List<PontoTuristico> pontosTuristicos = new ArrayList<PontoTuristico>();

    public Cidade(PontoTuristico... pontosTuristicos) {
        this.pontosTuristicos = Arrays.asList(pontosTuristicos);
    }

    public Iterator<PontoTuristico> iterator() {
        return pontosTuristicos.iterator();
    }
}
