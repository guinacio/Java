public class Circulo
{
	private double raio;
	
	public Circulo()
	{
		raio = 0.0;
	}
	public Circulo(double vR)
	{
		raio = vR;
	}
	public double calculaArea()
	{
		return 3.1415*raio*raio;
	}
	public double calculaPerimetro()
	{
		return 2*3.1415*raio;
	}
	public void recebaRaio(double vRaio)
	{
		raio = vRaio;
	}
}
