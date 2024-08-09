package simulador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pais pais1 = new Pais(200000, "Russia", true);
		Pais pais2 = new Pais(50000, "Ucrânia", false);
		
		if(pais1.getQuantidade()>pais2.getQuantidade()) {
			pais1.setEstrategia(new AtacarSozinho());
			pais1.declararGuerra(pais2);
		}else {
			pais1.setEstrategia(new Diplomacia());
			pais1.declararGuerra(pais2);
		}
	}

}
