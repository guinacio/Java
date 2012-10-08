public class Aluno
{
	private String nome;
	private double n1;
	private double n2;
	private double n3;
	
   public Aluno(String vNome, double vN1, double vN2, double vN3)
   {
   	 nome = vNome;
   	 n1 = vN1;
   	 n2 = vN2;
   	 n3 = vN3;
   }
   
   public String informeNome()
   {
   	 return nome;
   }
   
   public double informeN1()
   {
   	 return n1;
   }
   
   public double informeN2()
   {
   	 return n2;
   }
   
   public double informeN3()
   {
   	 return n3;
   }
   
   public void recebeValorNome(String vNome)
   {
   	nome = vNome;
   }
   
   public void recebeValorN1(double vN1)
   {
   	n1 = vN1;
   }
   
   public void recebeValorN2(double vN2)
   {
   	n2 = vN2;
   }
   
   public void recebeValorN3(double vN3)
   {
   	n3 = vN3;
   }
   
   public double informeMedia()
   {
   	return (n1+n2+n3)/3;
   }
}