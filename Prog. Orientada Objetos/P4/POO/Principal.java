public class Principal
{
	public static void main(String[] par)
	{
		Interface aInterface = new Interface();
		Aluno a = aInterface.criaAluno();
				
		aInterface.mostraNotas(a);
		
		a = aInterface.criaAluno();
		aInterface.mostraNotas(a);
		
		a = aInterface.criaAluno();
		aInterface.mostraNotas(a); 
			
	}
}