/* Considere que em uma disciplina...
 *
 *Determinar e mostrar todos os dados do melhor aluno.
 *Determinar a media da turma de alunos na prova final.
 *Para cada aluno, informar se progrediu ou não na disciplina. (notas crescentes)
 *
*/

public class Principal
{
	public static void main(String[] par)
	{
		Interface aI = new Interface();
				
		double c = aI.askC();
		int qtt = aI.askQtt();
		
		int cont = 0;
		for(int i = 1; i <= qtt; i++)
		{
			Aluno a = aI.createAluno();
			aI.displayA(a, c);
			if(a.aprov(c))
			{
				cont++;
			}
		}
		
		aI.showAp(cont);
		
	}
}