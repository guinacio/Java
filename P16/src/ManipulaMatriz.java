public class ManipulaMatriz
{
	public ManipulaMatriz()
	{
	}
	
	public static boolean eQuad(int[][] mat)
	{
		return mat.length == mat[0].length;
	}
	
	public static int somaElem(int[][] m)
	{
	  int nLin = m.length;
	  int nCol = m[0].length;
	  int soma = 0;
	  
	  for(int i = 0; i < nLin; i++)
	  {
	  	for(int j = 0; j < nCol; j++)
	  	{
	  		soma = soma + m[i][j];
		}
	  }
	  
	  return soma;
    
	}
	
	public static int somaLin(int[][] m, int lin)
    {
 	  int nCol = m[lin].length;
	  int soma = 0;
	  
	  for(int i = 0; i < nCol; i++)
	  {
		soma = soma + m[lin][i];
	  }
	  
	  return soma;
    }
    
    public static int maiorSomaLinha(int[][] m)
    {
    	int nLinhas = m.length;
    	int MSoma = ManipulaMatriz.somaLin(m,0);
    	int linha = 0;
    	for(int i = 1; i < nLinhas; i++)
    	{
    		int s = ManipulaMatriz.somaLin(m,i);
    		if(s > MSoma)
    		{
    			MSoma = s;
    			linha = i;
    		}
    			
    	}
    	
    	return linha;
    }
    
    public static int[][] identidade(int tam)
    {
    	int [][] ident = new int[tam][tam];
    	 
    	for(int i = 0; i < tam; i++)
    		ident[i][i] = 1;
    	
    	
    	return ident;
    }
    // Aluno: Guilherme S. Inácio (09130039)
    public static int[] maioresElemCol(int[][] m)
    {
    	int nLin = m.length;
  	    int nCol = m[0].length;
    	int[] maiores = new int[nLin];
    	
    	for(int i = 0; i < nLin; i++)
    	{
    		maiores[i] = m[i][0];
    		for(int j = 1; j < nCol; j++)
    		{
    			if(m[i][j] > maiores[i])
    				maiores[i] = m[i][j];
    		}
    	}
    	
    	return maiores;
    }
}

