
public class Apoio extends Funcionario {
	//Assinatura é nome do metodo, numero, ordem e tipos dos parametros
	
		public Apoio(String vNome, char vS, int vI, double vSB, double vP, int vND)
		{
			super(vNome, vS, vI, vSB, vP, vND);
		}
		
		public double fornecaAE()
		{
			if(nd <= 5)
			  return nd*60.00;
			else
			  return 5*60.00;	
		}
		
		public double calcSalBruto()
		{
			return salBase + prod + this.fornecaAE();
		}

}
