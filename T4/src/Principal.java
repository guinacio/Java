/* 
 * Aluno: Guilherme Inácio (09130039)
 * 
 *
*/

public class Principal
{
	public static void main(String[] par)
	{
		Interface aI = new Interface();
		Aluno best = new Aluno("Fulano");
				
		double c = aI.askC();
		int qtt = aI.askQtt();
		
		int cont = 0;
		double sumPF = 0;
		boolean saveProgBest = false;
		for(int i = 1; i <= qtt; i++)
		{
			Aluno a = aI.createAluno();
			int aux=0;
			for(int j = 0; j < (a.getN()-1); j++)
			{
				if(a.getNTeste(j) < a.getNTeste(j+1))
				{
					aux++;
				}
			}
			if(a.getNTeste(a.getN()-1) < a.getPf())
				aux++;
			
			aI.displayA(a, c, 0,aux==a.getN());
			
			if(a.finalGrade() > best.finalGrade())
			{
				best = a;
				saveProgBest = aux==a.getN();
			}
			if(a.aprov(c))
			{
				cont++;
			}
			
			sumPF = sumPF + a.getPf();
		}
		
		aI.showAp(cont);
		aI.displayA(best, c, 1, saveProgBest);
		aI.showAvPF(sumPF, qtt);
		
	}
}