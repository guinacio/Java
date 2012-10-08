import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{
	}
	
	public Pessoa criaPessoa()
	{
		String nome = JOptionPane.showInputDialog("Digite nome: ");
		String sSexo = JOptionPane.showInputDialog("Digite sexo: ");
		char sexo = sSexo.charAt(0);
		int idade;
		String sIdade;
		while(sexo != 'M' && sexo != 'F')
		{
			sSexo = JOptionPane.showInputDialog("Digite sexo: ");
			sexo = sSexo.charAt(0);
		}
		sexo = Character.toUpperCase(sexo);
		sIdade = JOptionPane.showInputDialog("Digite idade: ");
		idade = Integer.parseInt(sIdade);
		while(idade < 0)
		{
			sIdade = JOptionPane.showInputDialog("Digite idade: ");
			idade = Integer.parseInt(sIdade);
		}
				
		return new Pessoa(nome,sexo,idade);
	}
	
	public int getNumPessoas()
	{
		String num = JOptionPane.showInputDialog("Digite o num. de Pessoas a serem cadastradas: ");
		int qtd = Integer.parseInt(num);
		while(qtd <= 0)
		{
			JOptionPane.showMessageDialog(null,"Quantidade inválida, digite numero positivo");
			num = JOptionPane.showInputDialog("Digite o num. de Pessoas a serem cadastradas: ");
			qtd = Integer.parseInt(num);
		}
		
		return qtd;		
	}
	
	public void showMessage(String msg)
	{
		JOptionPane.showMessageDialog(null,msg);
	}
	
	public void mostraMediaF(int soma, int cont)
	{
		if(cont == 0)
			JOptionPane.showMessageDialog(null,"Numero de mulheres é 0");
		else
			JOptionPane.showMessageDialog(null,"Idade média das mulheres é " + soma/cont);
	}
	
	public void mostraNova(Pessoa nova)
	{
		JOptionPane.showMessageDialog(null,"A pessoa mais nova é \n" + nova.toString());
	}
	
	public void mostraVelha(Pessoa velha)
	{
		JOptionPane.showMessageDialog(null,"A pessoa mais velha é \n" + velha.toString());
	}
}