public class ManipulaString
{
	public ManipulaString()
	{
	}
	
	public static int quantLetras(String s)
	{
		int tam = s.length();
		int cont=0;
		for(int i=0; i< tam; i++)
		{
			char c = s.charAt(i);
			if(Character.isLetter(c))
				cont++;
		}
		
		return cont;
	}
	
	public static boolean temCaracter(String s, char cc)
	{
		int tam = s.length();
		
		for(int i = 0; i < tam; i++)
		{
			char c = s.charAt(i);
			if(c == cc)
				return true;	
		}
		
		return false;
	}
	
	public static boolean eVogal(char cc)
	{
		cc = Character.toUpperCase(cc);
		
		if(cc == 'A' || cc == 'E' || cc == 'I' || cc == 'O' || cc == 'U')
			return true;
		return false;
	}
	
	public static boolean eConsoante(char cc)
	{
		return Character.isLetter(cc) && !(ManipulaString.eVogal(cc));
	}
	
	public static int qtdConsoantes(String s)
	{
		int cont = 0;
		int tam = s.length();
		
		for(int i = 0; i < tam; i++)
		{
			char c = s.charAt(i);
			if(ManipulaString.eConsoante(c))
				cont++;
		}
		
		return cont;
	}
	
	public static boolean temEV(String s)
	{
		int tam = s.length();
		
		for(int i = 0; i < (tam-1); i++)
		{
			char c1 = s.charAt(i);
			char c2 = s.charAt(i+1);
			
			if(ManipulaString.eVogal(c1) && ManipulaString.eVogal(c2))
				return true;	
		}
		
		return false;
	}
	
	public static String geraSenha(int tamanho)
	{
		String senha = "";
		for(int i=0; i<tamanho; i++)
		{
			int num = (int) ((Math.random()*94)+33);
			char c = (char) num;
			
			senha = senha + c; 
		}
		return senha;	
	}
	
	public static boolean ePalindromo(String s)
	{
		int tam = s.length();
		String sAux = "";
		for(int i = 0; i < tam; i++)
		{
			char c = s.charAt(i);
			c = Character.toUpperCase(c);
			if(Character.isLetter(c))
			{
				sAux = sAux + c;
			}
		}
		
		
		int tamAux = sAux.length();
		String aux2 = "";
		for(int j = (tamAux-1); j >= 0; j--)
		{
			char c2 = sAux.charAt(j);
			aux2 = aux2 + c2;
		}
		
		return sAux.equals(aux2);
	}
	
	public static String maiorString(String[] aStr)
	{
		int tam = aStr.length;
		
		String maior = aStr[0];
		for(int i = 1; i<tam; i++)
		{
			if(aStr[i].compareTo(maior) > 0)
				maior = aStr[i];
		}
		
		return maior;
	}
	
	// Aluno: Guilherme S. Inácio (09130039)
	public static int quantosComecameTerminamVogais(String[] s)
	{
	   int tam = s.length;
	   for(int i=0; i<tam; i++)
		   s[i] = s[i].trim();
	   
	   int cont = 0;
	   for(int j=0; j<tam;j++)
	   {
		 int tamString = s[j].length();
		 if(ManipulaString.eVogal((s[j].charAt(0))) && ManipulaString.eVogal((s[j].charAt(tamString-1))))
			 cont++;
	   }
	   
	   return cont;
	}
}
