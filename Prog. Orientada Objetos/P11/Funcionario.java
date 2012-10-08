
public class Funcionario extends Pessoa {
	
	protected double salBase;
	protected double prod;
	protected int nd;
	
	public Funcionario(String vNome, char vS, int vI, double vSB, double vP, int vND)
	{
		super(vNome, vS, vI); //Primeiro comando sempre deve ser uma chamada ao const. da superclasse
		                      // tem como objetivo inicializar os atrib. da superclasse
		salBase= vSB;
		if(salBase < 0)
			salBase = 0;
		prod = vP;
		if(prod < 0)
			prod = 0;
		nd = vND;
		if(nd < 0)
			nd = 0;
	}
	
	public double getSB()
	{
		return salBase;
	}
	
	public double getProd()
	{
		return prod;
	}
	
	public int getND()
	{
		return nd;
	}
	
	public void setSB(double vSB)
	{
		if(vSB > 0)
			salBase = vSB;
	}
	
	public void setProd(double vProd)
	{
		if(vProd > 0)
			prod = vProd;
	}
	
	public void setND(int vND)
	{
		if(vND > 0)
			nd = vND;
	}
	
	public double calcSalBruto()
	{
		return salBase + prod;
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
	
	public double retornaSalLiq()
	{
		return this.calcSalBruto() - this.calcImposto();
	}
	
}
