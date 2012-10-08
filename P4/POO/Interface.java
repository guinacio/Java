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
		double nota;
		
		if(aux == 1)
		{
			String buffer1 = JOptionPane.showInputDialog("Digite a nota N1: ");
			nota = Double.parseDouble(buffer1);
		}
		else if(aux == 2)
		{
		    String buffer2 = JOptionPane.showInputDialog("Digite a nota N2: ");
			nota = Double.parseDouble(buffer2);
		}
		else
		{
			String buffer3 = JOptionPane.showInputDialog("Digite a nota N3: ");
			nota = Double.parseDouble(buffer3);
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
	
}