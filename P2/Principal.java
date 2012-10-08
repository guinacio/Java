public class Principal
{
	public static void main(String[] par)
	{
		Interface aInterface = new Interface();
		int a = aInterface.soliciteValor();
		int quadrado = a*a;
		int b;
		int cubo;
		
		aInterface.mostraResultado(2,quadrado,a);
		
		b = aInterface.soliciteValor();
		cubo = b*b*b;
				
		aInterface.mostraResultado(3,cubo,b);
				
	}
}