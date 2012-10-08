public class Ponto
{
	private double x;
	private double y;
	
	public Ponto(double cX,double cY)
	{
		x = cX;
		y = cY;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public void setX(double vX)
	{
		x = vX;
	}
	
	public void setY(double vY)
	{
		y = vY;
	}
	
	public double calculaDistancia(Ponto p2)
	{
		double x2 = p2.getX();
	    double y2 = p2.getY();
	    
	    return Math.sqrt(Math.pow((x - x2),2)+Math.pow((y - y2),2));
	}
}