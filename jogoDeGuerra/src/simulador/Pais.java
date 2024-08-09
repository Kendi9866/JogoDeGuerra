package simulador;

public class Pais {
	
	//construtor(nome,quantidade de soldados, boolean armamento)
	//regra para declarar a guerra metodo declararGuerra
	private int quantidadeSoldados;
	private String nome;
	private boolean armaNuclear;
	private Strategy estrategia;
	
	public Pais(int quantidade, String nome, boolean armaNuclear) {
		super();
		this.quantidadeSoldados = quantidade;
		this.nome = nome;
		this.armaNuclear = armaNuclear;
	}
	
	public void setEstrategia(Strategy estrategia) {
		this.estrategia = estrategia;
	}
	
	public void declararGuerra(Pais inimigo) {
		this.estrategia.atacar(inimigo);
		this.estrategia.concluir(inimigo);
	}

	public int getQuantidade() {
		return quantidadeSoldados;
	}

	public void setQuantidade(int quantidade) {
		this.quantidadeSoldados = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isArmaNuclear() {
		return armaNuclear;
	}

	public void setArmaNuclear(boolean armaNuclear) {
		this.armaNuclear = armaNuclear;
	}

	public Strategy getEstrategia() {
		return estrategia;
	}
	
	

}
