public class Retangulo
{
	private double base;
	private double altura;

	public Retangulo(double vBase,double vAltura)
	{
		base = vBase;
		altura = vAltura;
	}

	public double calculaArea()
	{
		return base*altura;
	}

	public double calculaPerimetro()
	{
		return 2*(base + altura);
	}
}