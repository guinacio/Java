import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{
	}
	
	public static int[][] fazMatriz()
	{
		int nLin = Integer.parseInt(JOptionPane.showInputDialog("N. de Linhas:"));
		int nCol = Integer.parseInt(JOptionPane.showInputDialog("N. de Colunas:"));
		
		int[][] matx = new int[nLin][nCol];
		
		for(int i = 0; i < nLin; i++)
		{
			for(int j = 0; j < nCol; j++)
			{
				matx[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição " + "L: " + i +
					 "  C: " + j));
			}
		}
		
		return matx;
	}
	
	public static void mostraMatriz(int[][] m)
	{
		int nLin = m.length;
		int nCol = m[0].length;
		
		String s = "";
		
		for(int i = 0; i < nLin; i++)
		{
			for(int j = 0; j < nCol; j++)
			{
				s = s + m[i][j] + " ";
			}
			
			s = s + "\n"; 
		}
		
		JOptionPane.showMessageDialog(null, s);
	}
	
	public static void mostraInt(int val, int caso)
	{
		switch(caso)
		{
		   case 0:
		      JOptionPane.showMessageDialog(null,"Soma: " + val);
		      break;
		   default:
		   	  JOptionPane.showMessageDialog(null,"Maior: " + val);	
		}
			
		
	}
}