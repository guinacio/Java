/*Exercicio:
  Escreva um programa que solicite do usuário 10 valores inteiros. Todos os 10 valores
  devem ficar armazenados na memoria, após:
  
  a) Calcule a media dos 10 valores.
  b) Determine o maior valor.


*/
public class Principal
{
	public static void main(String[] p)
	{
		Interface aInter = new Interface();
		
		int[] val = new int[10]; 
		for(int i = 0; n<=9; n++)
		  val[i] = aInter.askInt();
		
		int quant = val.length;
		int sum = 0;
		int bigger = val[0];
		
		for(int i=0; i <= (quant - 1); i++)
		{
			 sum = sum + val[i];
			 if(val[i] >= bigger)
			 	bigger = val[i];
		}
		
		
		aInter.showAverage(sum, quant);
		aInter.showAverage(bigger);
		
	
	}
}