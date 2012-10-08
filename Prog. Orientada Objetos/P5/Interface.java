import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{
	}
	
	public Ponto fazPonto()
	{
		String aux1 = JOptionPane.showInputDialog("Digite valor da coordenada x:");
		String aux2 = JOptionPane.showInputDialog("Digite valor da coordenada y:");
		
		double vX = Double.parseDouble(aux1);
		double vY = Double.parseDouble(aux2);
		
		return new Ponto(vX, vY);
	}
	
	public void mostraResultado(double valor)
	{
		JOptionPane.showMessageDialog(null,"A distância entre os pontos é: "+ valor);
	}
	
}