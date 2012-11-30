
public class Tela {
	
	public Tela()
	{
	}

	public void mostraMatriz(double[][] m)
	{
		int nLin = m.length;
		int nCol = m[0].length;
		
		String printM = "";
	      for(int i = 0; i < nLin; i++)
	      {
		    	for(int j = 0; j < nCol; j++)
		    	{
		    		printM = printM + m[i][j] + " ";
		    	}
		     printM = printM + "\n";
	      }
	      
	      System.out.println(printM);
	}
	
	public void mostraString(String s)
	{
		System.out.println(s);
	}
	
}
