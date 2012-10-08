public class Principal
{
	public static void main(String[] par)
	{
		Interface aInter = new Interface();
		int np = aInter.getNumPessoas();
		int contIdade = 0;
		int contMulheres = 0;
		int somaIdadeF = 0;
		Pessoa maisJovem = new Pessoa("Fulano",'*',999);
		Pessoa maisVelha = new Pessoa("Ciclano",'*',0);
		
		for(int i = 1; i <= np;i++)
		{
			Pessoa p = aInter.criaPessoa();
			int idade = p.getAge();
			if(idade >= 12 && idade <= 18)
				contIdade++;
			if(p.getGender() == 'F')
			{
			  somaIdadeF = somaIdadeF + p.getAge();
			  contMulheres++;
			}
			if(p.getAge() < maisJovem.getAge())
			{
				maisJovem = p;
			}
			if(p.getAge() > maisVelha.getAge())
			{
				maisVelha = p;
			}
			
		}
		
		aInter.showMessage("A Quantidade de Pessoas com idade entre 12 e 18 é " + contIdade);
		aInter.mostraMediaF(somaIdadeF,contMulheres);
		aInter.mostraNova(maisJovem);
		aInter.mostraVelha(maisVelha);
	}
}