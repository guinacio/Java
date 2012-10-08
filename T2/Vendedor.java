public class Vendedor
{
	private String nome;
	private char sexo;
	private double salarioFixo;
	private double valorVendas;	
	
   public Vendedor(String vNome, char vSexo, double vSalarioFixo, double vVendas)
   {
   	 nome = vNome;
   	 sexo = vSexo;
   	 salarioFixo = vSalarioFixo;
   	 valorVendas = vVendas;
   }
   
   public String informeNome()
   {
   		return nome;
   }
   
   public char informeSexo()
   {
   		return sexo;
   }
   
   public double informeSalarioFixo()
   {
   		return salarioFixo;
   }
   
   public double informeVendas()
   {
   		return valorVendas;
   }
   
   public void recebeNome(String vNome)
   {
   		nome = vNome;
   }
   
   public void recebeSexo(char vSexo)
   {
   		sexo = vSexo;
   }
   
   public void recebeSalarioFixo(double vSalarioFixo)
   {
   		salarioFixo = vSalarioFixo;
   }
   
   public void recebeVendas(double vVendas)
   {
   		valorVendas = vVendas;
   }
   
   public double informeComissao()
   {
   		if(valorVendas < 10000.00)
   		{
   			return valorVendas*0.05;
   		}	
   		else if(valorVendas >= 10000.00 && valorVendas <= 30000.00)
   		{
   			return valorVendas*0.07;
   		}
   		else  		
   		 return valorVendas*0.085;
   		
   }
   
   public double informeSalarioTotal()
   {
   		return (salarioFixo + this.informeComissao());
   }
   
}