package simulador;

public class AliancaVizinho implements Strategy {

	@Override
	public void atacar(Pais inimigo) {
		// TODO Auto-generated method stub
		System.out.println("Vizinho ataca pelo norte e nos atacamos pelo Sul");
		
	}

	@Override
	public void concluir(Pais inimigo) {
		// TODO Auto-generated method stub
		System.out.println("Dividir espólios");
		
	}
	
	
	
	
}
