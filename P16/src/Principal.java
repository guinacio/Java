/* Escrever classe que manipula matrizes; */

//M�todo que retorna com o maior elemento de cada coluna de uma matriz;

public class Principal
{
	public static void main(String[] p)
	{
		int[][] mat = Interface.fazMatriz();

		if(ManipulaMatriz.eQuad(mat))
			Interface.mostraMens("� Quadrada");
		else
			Interface.mostraMens("N�o � Quadrada");
	
		Interface.mostraInt(ManipulaMatriz.somaElem(mat),0);
		Interface.mostraInt(ManipulaMatriz.somaLin(mat,0),0);
		Interface.mostraInt(ManipulaMatriz.maiorSomaLinha(mat),2);
		//Interface.mostraMatriz(ManipulaMatriz.identidade(2));
		int[] vMaiores = ManipulaMatriz.maioresElemCol(mat);
		Interface.mostraArray(vMaiores);
	
    }
}