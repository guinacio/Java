/* Escreva um programa que via interface solicite do usuário uma matriz de elementos
 * do tipo Int e que:
 *
 *a) Imprima na tela a Matriz;
 *b) Calcule a soma dos elementos da linha 0 da Matriz;
 *c) Encontre o maior elemento da Matriz;
 *
 */
 
 public class Principal
 {
 	public static void main(String[] p)
 	{
 		int[][] mat = Interface.fazMatriz();
 		
 		Interface.mostraMatriz(mat);
 		Interface.mostraInt(Principal.somaLin(mat,0),0);
 		Interface.mostraInt(Principal.maiorElem(mat),1);
 		
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
 
    public static int maiorElem(int[][] m)
    {
 	   int nLin = m.length;
	   int nCol = m[0].length;
		
	   int maior = m[0][0];
				
	   for(int i = 0; i < nLin; i++)
	   {
		   for(int j = 0; j < nCol; j++)
		   {
			   if(m[i][j] > maior)
			   {
				  maior = m[i][j];
			   }
		   }
			
	   }
	
	   return maior;
    }
 

 }
 
 