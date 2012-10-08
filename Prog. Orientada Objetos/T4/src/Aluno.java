public class Aluno extends Pessoa
{
	private double pf;
	private double[] nt;
	private int n;
	
	public Aluno(String vNome)
	{
	    super(vNome,'*',0);
		pf = 0.0;
		n = 0;
		nt = new double[20];
	}
	
	public int getN()
	{
		return n;
	}
	
	public double getPf()
	{
		return pf;
	}
	
	public boolean setPf(double newPf)
	{
		if(newPf >= 0 && newPf <= 10)
		{
			pf = newPf;
			return true;
		}
		return false;
	}
	
	public boolean setNt(double v)
	{
		if(v >= 0 && v <= 10 && n < 20)
		{
			nt[n] = v;
			n++;
			return true;
		}
		return false;
	}
	
	public double getNTeste(int p)
	{
		if(p >= 0 && p < n)
		{
			return nt[p];
		}
		return -1.0;
	}
	
	public double getLowestN()
	{
		double lowest;
		lowest = nt[0];
		for(int i = 1; i < n; i++)
		{
			if(lowest > nt[i])
			{
				lowest = nt[i];
			}
		}
		
		return lowest;
	}
		
	public double getAverageN()
	{
		double soma = 0.0;
		for(int i = 0; i < n; i++)
		{
			soma = soma + nt[i];
		}
	    if(n>1)
		{
		   soma = soma - this.getLowestN();
		   return (soma/(n-1));
		}
		
		return nt[0];
		
	}
	
	public double finalGrade()
	{
		return this.getAverageN()*0.6 + pf*0.4;
	}
	
	public boolean aprov(double c)
	{
		return this.finalGrade() >= c;
	}
	
	

}