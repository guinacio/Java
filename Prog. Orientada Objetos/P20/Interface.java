import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{
	}
	
	public static Carro cadastraCarro()
	{
		String marca = JOptionPane.showInputDialog("Digite a marca: ");
		while(!(Carro.eMarcaValida(marca)))
			marca = JOptionPane.showInputDialog("Digite marca válida");
		
		String sAno = JOptionPane.showInputDialog("Digite o ano: ");
		int ano = Integer.parseInt(sAno);
		while(!(ano >= 1980 && ano <= 2013))
		{
			sAno = JOptionPane.showInputDialog("Digite o ano: ");
			ano = Integer.parseInt(sAno);
		}
		
		String sPreco = JOptionPane.showInputDialog("Digite o preço: ");
		double preco = Double.parseDouble(sPreco);
		while(preco < 0)
		{
			sPreco = JOptionPane.showInputDialog("Digite o preço: ");
			preco = Double.parseDouble(sPreco);
		}
		
		return new Carro(marca, ano, preco);
	}
	
	public static int quantCarros()
	{
		String sQtd = JOptionPane.showInputDialog("Digite a quantidade de carros a cadatrar: ");
		int qtd = Integer.parseInt(sQtd);
		if(qtd == 0)
			System.exit(0);
		while(qtd < 0)
		{
			sQtd = JOptionPane.showInputDialog("Digite a quantidade de carros a cadatrar: ");
			qtd = Integer.parseInt(sQtd);
			if(qtd == 0)
				System.exit(0);
		}
		
		return qtd;
	}
	
	public static void dispCarros(Carro[] c)
	{
		int tam = c.length;
		String s = "";
		
		for(int i =0; i<tam;i++)
		{
			s = s + c[i].toString() + "\n\n";
		}
		
		JOptionPane.showMessageDialog(null, s);
		
	}
	
	public static void dispMaisCaro(Carro mc)
	{
		JOptionPane.showMessageDialog(null,"O CARRO MAIS CARO: \n\n" + mc.toString());
	}
	
	public static void dispMaisBarato(Carro mb)
	{
		JOptionPane.showMessageDialog(null,"O CARRO MAIS BARATO: \n\n" + mb.toString());
	}
	
	public static void mostraQuantMarca(String[] marcas, int[] quantM)
	{
		int tam = marcas.length;
	    String s = "Relatório de Carros por Marca: \n\n";
		for(int i = 0; i<tam; i++)
		{
			s = s + marcas[i] + ": " + quantM[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null,s);
	}
}