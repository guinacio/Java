/*
 *Aluno: Guilherme S. Inácio (09130039)
 *
 */

public class Principal
{
	public static void main(String[] par)
	{
		Vendedor menorSalario = new Vendedor("fulano",'M',999999999.00,0);
		Interface aInterface = new Interface();
		
		char resp = 'S';
		int cont = 0;
		double sum = 0;
		
		while(resp == 's' || resp == 'S')
		{
			Vendedor v = aInterface.criaVendedor();
			aInterface.mostraVendedor(v);
			
			if(v.informeSalarioFixo() < menorSalario.informeSalarioFixo())
			{
				menorSalario = v;
			}
			if(v.informeSexo() == 'f' || v.informeSexo() == 'F')
			{
				sum = sum + v.informeSalarioTotal();
				cont++;
			}
			
			resp = aInterface.perguntaOutro();	
		}
		
		aInterface.mostraMenorSalario(menorSalario);
		aInterface.mostraSalarioMedioMulheres(cont,sum);
			 
	}
}