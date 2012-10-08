/*Uma revendedora de automoveis tem p/ cada carro que está a venda, o ano de fabricação
 *marca e o preço de venda. Escreva um projeto que:
 *
 *a) Armazene todos os carros na memória
 *b) Determine o carro mais caro da revenda.
 *
 *Obs: Considere marcas válidas: FORD, FIAT, GM, VW, HONDA, CITROËN, RENAULT, KIA, TOYOTA
 *
 */
 
 public class Principal
 {
 	public static void main(String[] p)
 	{
 	 	int nCarros = Interface.quantCarros();
 	 	Carro[] c = new Carro[nCarros];
 	 	String[] marcas = {"FORD","FIAT","GM","VW","HONDA","CITROËN","RENAULT","KIA","TOYOTA"};
 	 	
 	 	
 	 	for(int i = 0; i<nCarros; i++)
 	 	{
 	 		c[i] = Interface.cadastraCarro();
 	 	}
 	 	
 	 	Carro maisCaro = Principal.encontraMaisCaro(c, nCarros);
 	 	Carro maisBarato = Principal.encontraMaisBarato(c, nCarros);
 	 	
 	 	Interface.dispCarros(c);
 	 	Interface.dispMaisCaro(maisCaro);
 	 	Interface.dispMaisBarato(maisBarato);
 	 	int[] quantM = Principal.quantMarca(c, marcas);
 	 	Interface.mostraQuantMarca(marcas, quantM);
 	 	
 	}
 	
 	public static Carro encontraMaisCaro(Carro[] c, int nCarros)
 	{
 		Carro maisCaro = c[0];
 		
 		for(int j = 1; j < nCarros; j++)
 	 	{
 	 		if(c[j].getPreco() > maisCaro.getPreco())
 	 			maisCaro = c[j];
 	 	}
 	 	
 	 	return maisCaro;
 	}
 	
 	public static Carro encontraMaisBarato(Carro[] c, int nCarros)
 	{
 		Carro maisBarato = c[0];
 		
 		for(int j = 1; j < nCarros; j++)
 	 	{
 	 		if(c[j].getPreco() < maisBarato.getPreco())
 	 			maisBarato = c[j];
 	 	}
 	 	
 	 	return maisBarato;
 	}
 	
 	public static int[] quantMarca(Carro[] c, String[] marcas)
 	{
 		
 		int[] cont = new int[marcas.length];
 		for(int i = 0; i<marcas.length;i++)
 		{
 			
 			for(int j = 0; j<c.length;j++)
 			{
 				if(marcas[i].equalsIgnoreCase(c[j].getMarca()))
 			  	    cont[i]++;
 			}
 			  
 		}	
 		
 		return cont;
 	}	
 		
 }
 