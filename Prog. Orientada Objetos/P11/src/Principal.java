
public class Principal {
	
	public static void main(String[] par)
	{
		Interface aInter = new Interface();
		int nf = aInter.pedeNumFunc();
		int contFunComm = 0;
		
		for(int i = 1;i <= nf; i++)
		{
			Funcionario f = aInter.criaFuncionario();
			aInter.showDemonst(f);
			if(!(f instanceof Chefe) && !(f instanceof Apoio))
				contFunComm++;
		}
		
		aInter.showNumFunc(contFunComm);
	}

}
