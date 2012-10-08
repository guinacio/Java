 public class Carro
{
	private String marca;
	private int ano;
	private double preco; 
	
	public Carro(String sMarca, int vAno, double vPreco)
	{
		if(Carro.eMarcaValida(sMarca))
			marca = sMarca;
		else
			marca = "Marca Invalida";
		if(vAno >= 1980 && vAno <= 2013)
			ano = vAno;
		else
			ano = 0;
		if(vPreco >= 0)
			preco = vPreco;
		else
			preco = -1.00;
	}
	
	public static boolean eMarcaValida(String tMarca)
	{
		String[] marcas = {"FORD","FIAT","GM","VW","HONDA","CITROËN","RENAULT","KIA","TOYOTA"};
		tMarca = tMarca.trim();
		int tam = marcas.length;
		for(int i=0;i<tam;i++)
		{
			if(marcas[i].equalsIgnoreCase(tMarca))
				return true;
		}
		
		return false;
	}
	
	public boolean setAno(int vAno)
	{
		if(vAno >= 1980 && vAno <= 2013)
		{
			ano = vAno;
			return true;
		}
		
		return false;
	}
	
	public boolean setMarca(String sMarca)
	{
		if(Carro.eMarcaValida(sMarca))
		{
			marca = sMarca;	
			return true;
		}
		
		return false;
	}
	
	public boolean setPreco(int vPreco)
	{
		if(vPreco >= 0)
		{
			preco = vPreco;
			return true;
		}
		
		return false;
	}
	
	public int getAno()
	{
		return ano;
	}
	
	public double getPreco()
	{
		return preco;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public String toString()
	{
		return "Marca: " + marca + "\nAno :" + ano + "\nPreço: " + preco;
	}
}