package iterator;

public class PontoTuristico {
	private String nome;
    private boolean visitado;
    
    public PontoTuristico(String nome, boolean visitado) {
        this.nome = nome;
        this.visitado = visitado;
    }
    
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isVisitado() {
		return visitado;
	}
	
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
}
