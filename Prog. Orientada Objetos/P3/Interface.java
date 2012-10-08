import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{
	}
	public double recebeValor()
	{
		String valorDigitado = JOptionPane.showInputDialog("Digite valor do raio");
		double valor = Double.parseDouble(valorDigitado);
		
		return valor;
	}	
	public void mostraArea(String nome, double area, double perimetro)
	{
		JOptionPane.showMessageDialog(null,"A área do circulo "+ nome +" é " + area);
		JOptionPane.showMessageDialog(null,"O perimetro do circulo " + nome +" é " + perimetro);
	}
	public Circulo pecaCirculo()
	{
		double vRaio = this.recebeValor();
		Circulo cir = new Circulo(vRaio);
		
		return cir;
	}
	public void mostraCirculo(Circulo cir)
	{
		double area = cir.calculaArea();
		double per = cir.calculaPerimetro();
		
		this.mostraArea("D",area, per);
	}	
}