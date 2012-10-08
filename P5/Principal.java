public class Principal
{
	public static void main(String[] par)
	{
		Interface aInterface = new Interface();
		
		Ponto pA = aInterface.fazPonto();
		Ponto pB = aInterface.fazPonto();
		double dist = pA.calculaDistancia(pB);
		
		aInterface.mostraResultado(dist);
		
	}
	
	
}