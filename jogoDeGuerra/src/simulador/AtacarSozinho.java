package simulador;

public class AtacarSozinho implements Strategy{
	
	

	@Override
	public void atacar(Pais inimigo) {
		// TODO Auto-generated method stub
		System.out.println("\n Plantar evidências falsas \n Soltar bombas \n Derrubar governo");
	
	}

	@Override
	public void concluir(Pais inimigo) {
		// TODO Auto-generated method stub
		System.out.println("\n Estabelecer governo amigo");
		
	}

}
