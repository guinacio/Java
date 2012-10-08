import javax.swing.JOptionPane;

public class Interface {
	
	public Interface()
	{
	}
	
	public int pedeNumFunc()
	{
		String sNf = JOptionPane.showInputDialog("Digite num. funcionarios: ");
		int nf = Integer.parseInt(sNf);
		while(nf<=0)
		{
			if(nf==0)
				System.exit(0);
			sNf = JOptionPane.showInputDialog("Digite num. funcionarios: ");
			nf = Integer.parseInt(sNf);
		}
		return nf;
	}
	
	public Funcionario criaFuncionario()
	{
		String vNome = JOptionPane.showInputDialog("Digite o nome do Funcionario: ");
		String sSexo = JOptionPane.showInputDialog("Digite o sexo: ");
		char cSexo = sSexo.charAt(0);
		cSexo = Character.toUpperCase(cSexo);
		while(cSexo != 'M' && cSexo != 'F')
		{
			sSexo = JOptionPane.showInputDialog("Digite o sexo: ");
			cSexo = sSexo.charAt(0);
			cSexo = Character.toUpperCase(cSexo);
		}
		String sIdade = JOptionPane.showInputDialog("Digite Idade: ");
		int idade = Integer.parseInt(sIdade);
		while(idade < 0)
		{
			sIdade = JOptionPane.showInputDialog("Digite Idade: ");
			idade = Integer.parseInt(sIdade);
		}
		
		String sSB = JOptionPane.showInputDialog("Digite Salario Base: ");
		double sb = Double.parseDouble(sSB);
		while(sb < 0)
		{
			sSB = JOptionPane.showInputDialog("Digite Salario Base: ");
			sb = Double.parseDouble(sSB);
		}
		
		String sP = JOptionPane.showInputDialog("Digite adic. Produtividade: ");
		double prod = Double.parseDouble(sP);
		while(prod < 0)
		{
			sP = JOptionPane.showInputDialog("Digite adic. Produtividade: ");
			prod = Double.parseDouble(sP);
		}
		
		String sND = JOptionPane.showInputDialog("Digite num. dependentes: ");
		int numDep = Integer.parseInt(sND);
		while(numDep < 0)
		{
			sND = JOptionPane.showInputDialog("Digite num. dependentes: ");
			numDep = Integer.parseInt(sND);
		}
		
		char escolha;
		String sEscolha = JOptionPane.showInputDialog("Digite Tipo do Funcionario: \n\nA = Apoio \nC = Chefe \nF = Funcionario");
		escolha = sEscolha.charAt(0);
		escolha = Character.toUpperCase(escolha);
		while(escolha != 'C' && escolha != 'A' && escolha != 'F')
		{
			sEscolha = JOptionPane.showInputDialog("Digite Tipo do Funcionario: \n\nA = Apoio \nC = Chefe \nF = Funcionario");
			escolha = sEscolha.charAt(0);
			escolha = Character.toUpperCase(escolha);
		}
		
		if(escolha == 'C')
		{
			String sGrat = JOptionPane.showInputDialog("Digite gratificação de chefia: ");
			double grat = Double.parseDouble(sGrat);
			while(grat < 0)
			{
				sGrat = JOptionPane.showInputDialog("Digite gratificação de chefia: ");
				grat = Double.parseDouble(sGrat);
			}
			
			return new Chefe(vNome, cSexo, idade, sb, prod, numDep, grat);
		}
		
		if(escolha == 'A')
		{
			return new Apoio(vNome, cSexo, idade, sb, prod, numDep);
		}
		
		return new Funcionario(vNome, cSexo, idade, sb, prod, numDep);
	}
	
	public void showDemonst(Funcionario f)
	{
		String s = "Nome: " + f.getName();
		s = s + "\nSexo: " + f.getSex();
		s = s + "\nIdade: " + f.getAge();
		s = s + "\nSalario Base: " + f.getSB();
		s = s + "\nProdutividade: " + f.getProd();
		s = s + "\nNum. Dependentes: " + f.getND();
		s = s + "\nImposto Pago: " + f.calcImposto();
		if(f instanceof Chefe)
		{
			s = s + "\nGratif. Chefia: " + ((Chefe) f).getGrat();
		}
		if(f instanceof Apoio)
		{
			s = s + "\nAuxilio Educação: " + ((Apoio) f).fornecaAE();
		}
		s = s + "\nSalario Liquido: " + f.retornaSalLiq();
		if(f instanceof Funcionario)
		{ 
			s = s + "\nÉ um funcionário comum. ";
		}
		if(f instanceof Apoio)
		{ 
			s = s + "\nÉ um funcionário de apoio. ";
		}
		if(f instanceof Chefe)
		{ 
			s = s + "\nÉ um funcionário chefe. ";
		}
		JOptionPane.showMessageDialog(null, s);
	}
	
	public void showNumFunc(int contFunComm)
	{
		JOptionPane.showMessageDialog(null,"O numero de funcionarios comuns é: " + contFunComm);
	}
	

}