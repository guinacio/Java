import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{
	}
	
	public Aluno criaAluno()
	{
	  String vNome = this.pedeNome();		
	  double vN1 = this.pedeNota(1);
	  double vN2 = this.pedeNota(2);
	  double vN3 = this.pedeNota(3);
	  
	  return new Aluno(vNome,vN1,vN2,vN3);
	}
	
	public String pedeNome()
	{
		String name = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
		
		return name;
	}
	
	public double pedeNota(int aux)
	{
		double nota = -1;
		
		if(aux == 1)
		{
			while(nota > 10 || nota < 0)
			{
			String buffer1 = JOptionPane.showInputDialog("Digite a nota N1: ");
			nota = Double.parseDouble(buffer1);
			
			if(nota > 10 || nota < 0)
			{
				buffer1 = JOptionPane.showInputDialog("Digite a nota N1: ");
				nota = Double.parseDouble(buffer1);
			}
			}
			
		}
		else if(aux == 2)
		{
			while(nota > 10 || nota < 0)
			{
			
		    String buffer2 = JOptionPane.showInputDialog("Digite a nota N2: ");
			nota = Double.parseDouble(buffer2);
			
			if(nota > 10 || nota < 0)
			{
				buffer2 = JOptionPane.showInputDialog("Digite a nota N2: ");
				nota = Double.parseDouble(buffer2);
			}
			}
			
		}
		else
		{
			while(nota > 10 || nota < 0)
			{
			
			String buffer3 = JOptionPane.showInputDialog("Digite a nota N3: ");
			nota = Double.parseDouble(buffer3);
			if(nota > 10 || nota < 0)
			{
				buffer3 = JOptionPane.showInputDialog("Digite a nota N3: ");
				nota = Double.parseDouble(buffer3);
			}
			}
			
		}
				
		return nota;
	}
	
	public void mostraNotas(Aluno alun)
	{
	  JOptionPane.showMessageDialog(null,"A nota N1 do aluno " + alun.informeNome() 
	  	+" é: " + alun.informeN1());
	  	
	  JOptionPane.showMessageDialog(null,"A nota N2 do aluno " + alun.informeNome() 
	  	+" é: " + alun.informeN2());
	  	
	  JOptionPane.showMessageDialog(null,"A nota N3 do aluno " + alun.informeNome() 
	  	+" é: " + alun.informeN3());
	  	
	  JOptionPane.showMessageDialog(null,"A média final do aluno " + alun.informeNome() 
	  	+" é: " + alun.informeMedia());
	}
	
	public void mostraMelhorNota(Aluno alun)
	{
		JOptionPane.showMessageDialog(null,"A nota Melhor nota do aluno " + alun.informeNome() 
	  	+" é: " + alun.maiorNota());
	}
	
	public void mostraMelhorAluno(Aluno a)
	{
		JOptionPane.showMessageDialog(null,"O melhor aluno é " + a.informeNome() 
	  	+" com a media: " + a.informeMedia());   
    }
    
    public boolean mostraAprovacao(Aluno alun, double criterio)
    {
      	if(alun.aprovado(criterio))
    	{
    		JOptionPane.showMessageDialog(null,"Aluno " + alun.informeNome() 
	  	+" foi aprovado ");
	  	
		return false;
    	}
    	else
    	{
    	 JOptionPane.showMessageDialog(null,"Aluno " + alun.informeNome() 
	  	 +" foi reprovado ");
	  	 
	  	 return true;
   	    }
    }
        
    public int pedeNumAlunos()
    {
    	String buffer1 = JOptionPane.showInputDialog("Digite o número de alunos: ");
		
		return Integer.parseInt(buffer1);
    }
    
    public void mostraReprovados(int rep)
    {
    	JOptionPane.showMessageDialog(null,"Numero de alunos reprovados é: " + rep);
    }
    public void mostraAprovados(int apro)
    {
    	JOptionPane.showMessageDialog(null,"Numero de alunos aprovados é: " + apro);
    }
    
    public char perguntaOutro()
    {
    	char res = 'x'; 
    	
    	while(res != 'S' && res != 's' && res != 'N' && res != 'n')
    	{
    		String buffer1 = JOptionPane.showInputDialog("Há mais alunos? Digite Sim ou Não :");
    		res = buffer1.charAt(0);
    		if(res != 'S' && res != 's' && res != 'N' && res != 'n')
    		{
    		JOptionPane.showMessageDialog(null,"Resposta Inválida");
    		}
    	}
    	
    	
    	return res;
    }
    
    public void mostraMediaTurma(double soma, int qtd)
    {
    	JOptionPane.showMessageDialog(null,"A media na prova 1 foi " + soma/qtd );
    }
}