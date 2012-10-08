public class Principal
{
	public static void main(String[] par)
	{
		Aluno melhor = new Aluno("ninguem",-1.0,0.0,0.0);
		Interface aInterface = new Interface();
		//int n = aInterface.pedeNumAlunos();
	    int rep=0;
	    int aprov=0;
	    char resp = 'S';
	    int qtd = 0;
	    double sum = 0;
	    
		while(resp == 's' || resp == 'S')
		{ 
			Aluno a = aInterface.criaAluno();
			aInterface.mostraNotas(a);
		    aInterface.mostraMelhorNota(a);
		    if(aInterface.mostraAprovacao(a,6.0))
				rep++;
		    else 
				aprov++;
		    
		    if(a.informeMedia() > melhor.informeMedia())
				melhor = a;
			
			sum = sum + a.informeN1();
			
			resp = aInterface.perguntaOutro();
			qtd++;
		}
		
		aInterface.mostraMediaTurma(sum,qtd);
		aInterface.mostraMelhorAluno(melhor);
		aInterface.mostraReprovados(rep);		
		aInterface.mostraAprovados(aprov);
		 	
	}
}