
public class Chefe extends Funcionario {

	protected double gratChefia;
	
	public Chefe(String vNome, char vS, int vI, double vSB, double vP, int vND,double vGrat)
	{
		super(vNome, vS, vI, vSB, vP, vND);
		gratChefia = vGrat;
		if(gratChefia < 0)
			gratChefia = 0;
	}
	
	public double calcSalBruto()
	{
		return salBase + prod + gratChefia;
	}
	
	public double calcImposto()
	{
		double brut = this.calcSalBruto();
		if(brut <= 1000.00)
			return 0.00;
		if(brut <= 1800.00)
			return (brut*0.1 - 100.00);
		else
			return (brut*0.25 - 370.00);
	}
	
	public double getGrat()
	{
		return gratChefia;
	}
		

}
