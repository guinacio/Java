import javax.swing.JOptionPane;

public class Interface
{
	//Declaração do construtor
	public Interface()
	{
	}
	
	public void mostraResultado(int selec, int resultado, int valor)
	{
		//System.out.println("O valor é : " + resultado);
		if(selec==2)
		{
			JOptionPane.showMessageDialog(null,"O quadrado de " + valor + " é:  "
			 + resultado);
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"O cubo de " + valor + " é:  "
			 + resultado);
		}
	}
	
	public int soliciteValor()
	{
		String valorDigitado = JOptionPane.showInputDialog("Digite valor inteiro");
		int valor = Integer.parseInt(valorDigitado);
		
		return valor;
	}		
}