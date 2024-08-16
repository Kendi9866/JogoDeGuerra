package simulador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pais pais01 = new Pais(200000, "Russia", true);
		Pais pais02 = new Pais(50000, "Ucrânia", false);
		
		if(pais01.isArmaNuclear() && pais02.isArmaNuclear()) {
			pais01.setEstrategia(new Diplomacia());
			pais01.declararGuerra(pais02);
		}
		
		if(pais01.getQuantidade() > pais02.getQuantidade() || pais01.isArmaNuclear() != pais02.isArmaNuclear() ){
			pais01.setEstrategia(new AtacarSozinho()); //estamos setando uma estrategia ao pais 01 que é uma classe
			pais01.declararGuerra(pais02);
			
		}
		else {
			pais01.setEstrategia(new Diplomacia());
			pais01.declararGuerra(pais02);
		}
	}

}




























