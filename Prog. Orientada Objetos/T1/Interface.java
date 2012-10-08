import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{
	}

	public double recebeValorBase()
	{
		String aux1 = JOptionPane.showInputDialog("Digite valor da base: ");
		double vBase = Double.parseDouble(aux1);

	    return vBase;
	}

	public double recebeValorAltura()
	{
		String aux2 = JOptionPane.showInputDialog("Digite valor da altura: ");
		double vAltura = Double.parseDouble(aux2);

	    return vAltura;
	}

	public Retangulo fazRetangulo()
	{
		double base = this.recebeValorBase();
		double altura = this.recebeValorAltura();
		Retangulo ret = new Retangulo(base, altura);

		return ret;
	}

	public void mostraRetangulo(Retangulo r)
	{
		double area = r.calculaArea();
		double perimetro = r.calculaPerimetro();

		JOptionPane.showMessageDialog(null,"A área do retângulo é: " + area);
		JOptionPane.showMessageDialog(null,"O perimetro do retângulo é: " + perimetro);
	}
}