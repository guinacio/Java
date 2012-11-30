import java.io.*;

public class Leitor {
	
private FileReader arquivo;

	public Leitor(String endereco)
	{
		try{
		FileReader arq = new FileReader(endereco);
		arquivo = arq;
		}catch (IOException e) 
  		{
  			System.err.printf("Erro na abertura do arquivo: %s.\n",
  			e.getMessage());
  		}
	}
	
	public void ler()
	{
	  try{
		Tela t = new Tela();
		BufferedReader lerArq = new BufferedReader(arquivo);
		
		String linha = lerArq.readLine(); // lê a primeira linha
	    String separador = " ";
	    String[] sTamM;
	    int nLin;
		int nCol;
	      
	    sTamM = linha.split(separador);
	      
	    nLin = Integer.parseInt(sTamM[0]);
	    nCol = Integer.parseInt(sTamM[1]);
	      
	    t.mostraString("A matriz é: " + nLin + "x" + nCol + "\n");
	    
	    double[][] matrix = new double[nLin][nCol];
	      String[] dados;
	      int linhaAtual = 0;
	    		  
	      while (linhaAtual < nLin) 
	      {
	    	
	    	linha = lerArq.readLine(); // lê da segunda até a última linha
	        dados = linha.split(separador);
	        
	        for(int i = 0; i < dados.length; i++)
	        {
	        	matrix[linhaAtual][i] = Double.parseDouble(dados[i]);
	        }
	        
	        linhaAtual++;
	      }
	      
	      t.mostraMatriz(matrix);
	      arquivo.close();
	      
	  	} catch (IOException e) 
	  		{
	  			System.err.printf("Erro na abertura do arquivo: %s.\n",
	  			e.getMessage());
	  		}
	}
}
