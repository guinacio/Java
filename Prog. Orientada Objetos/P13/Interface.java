import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{	
	}
	
	public double askC()
	{
		String sC = JOptionPane.showInputDialog("Qual o criterio de aprov.?");
	    int c = Integer.parseInt(sC);
	    while(c < 0 && c >10)
		{
			sC = JOptionPane.showInputDialog("Qual o criterio de aprov.?");
			c = Integer.parseInt(sC);
		}
		
		return c;
	}
	
	public int askQtt()
	{
		String sQtt = JOptionPane.showInputDialog("Qual a qtd de alunos?");
	    int qtt = Integer.parseInt(sQtt);
	    if(qtt == 0)
	    	System.exit(0);
	    while(qtt < 0)
		{
			sQtt = JOptionPane.showInputDialog("Qual a qtd de alunos?");
			qtt = Integer.parseInt(sQtt);
			if(qtt == 0)
				System.exit(0);
		}
		
		return qtt;
	}
	
	public Aluno createAluno()
	{
		String sNome = JOptionPane.showInputDialog("Qual o nome?");
		
		Aluno t =  new Aluno(sNome);
		
		String sPf = JOptionPane.showInputDialog("Qual a nota da Prova Final?");
		double pf = Double.parseDouble(sPf);
		while(!(t.setPf(pf)))
		{
			sPf = JOptionPane.showInputDialog("Qual a nota da Prova Final?");
		    pf = Double.parseDouble(sPf);
		}
		
		String sQTestes = JOptionPane.showInputDialog("Qual a quant. de testes do aluno?");
		int qTestes = Integer.parseInt(sQTestes);
		while(qTestes < 0 && qTestes >20)
		{
			sQTestes = JOptionPane.showInputDialog("Qual a quant. de testes do aluno?");
			qTestes = Integer.parseInt(sQTestes);
		}
		
		for(int i = 1; i <= qTestes; i++)
		{
			String sNt = JOptionPane.showInputDialog("Qual a nota da Prova " + i + "?");
			double nt = Double.parseDouble(sNt);
			while(!(t.setNt(nt)))
			{
				sNt = JOptionPane.showInputDialog("Qual a nota da Prova " + i + "?");
		    	nt = Double.parseDouble(sNt);
			}
		}
		
		return t;
	}
	
	public void displayA(Aluno a, double c)
	{
		String s = "\nNome: " + a.getName();
		s = s + "\nNumero de Testes: " + a.getN();
		s = s + "\nProva Final: " + a.getPf();
		int nProv = a.getN()-1;
		while(nProv >= 0)
		{
			s = s + "\nProva " + nProv + ":" + a.getNTeste(nProv);
			nProv--;
		}
		s = s + "\nNota mais baixa: " + a.getLowestN();
		s = s + "\nMedia das Notas das provas: " + a.getAverageN();
	    s = s + "\nMedia final: " + a.finalGrade();
	    if(a.aprov(c))
	    {
	    	s = s + "\nAluno Aprovado!";
	    }
	    else
	    	s = s + "\nAluno Reprovado!";
	    
	    JOptionPane.showMessageDialog(null,s);
		
	}
	
	public void showAp(int q)
	{
		JOptionPane.showMessageDialog(null,"O numero de aprovados é: " + q);
	}
}