import javax.swing.JOptionPane;

public class Interface
{
	public Interface()
	{
	}
	
	public Vendedor criaVendedor()
	{
		String nome = this.pedeNome();
		char sexo = this.pedeSexo();
		double salarioFixo = this.pedeSalarioFixo();
		double valorVendas = this.pedeVendas();
		
		return new Vendedor(nome,sexo,salarioFixo,valorVendas);
	}
	
	public String pedeNome()
	{
		String name = JOptionPane.showInputDialog("Digite o nome do vendedor: ");
		
		return name;
	}
	
	public char pedeSexo()
	{
		String sexo = JOptionPane.showInputDialog("Digite o sexo do vendedor: ");
		
		return sexo.charAt(0);
	}
	
	public double pedeSalarioFixo()
	{
		String salarioF = JOptionPane.showInputDialog("Digite o sal�rio fixo do vendedor: ");
		
		return Double.parseDouble(salarioF);
	}
	
	public double pedeVendas()
	{
		String vendas = JOptionPane.showInputDialog("Digite o total de vendas do vendedor: ");
		
		return Double.parseDouble(vendas);
	}
	
	public char perguntaOutro()
    {
    	char res;
    	
    	do 
    	{
    		String buffer1 = JOptionPane.showInputDialog("H� mais vendedores? Digite Sim ou N�o :");
    		res = buffer1.charAt(0);
    		if(res != 'S' && res != 's' && res != 'N' && res != 'n')
    		{
    			JOptionPane.showMessageDialog(null,"Resposta Inv�lida");
    		}
    	}
    	while(res != 'S' && res != 's' && res != 'N' && res != 'n');
    	
    	return res;
    }
    
    public void mostraVendedor(Vendedor vend)
    {
    	JOptionPane.showMessageDialog(null,"Vendedor Cadastrado: \n  Nome: " + vend.informeNome() + "\n Sal�rio Fixo: " 
	  	+ vend.informeSalarioFixo() + "\n Comiss�o: " + vend.informeComissao() + "\n Sal�rio Total: " + vend.informeSalarioTotal());   
    }
    
     public void mostraMenorSalario(Vendedor vend)
    {
    	JOptionPane.showMessageDialog(null,"Vendedor com menor sal�rio fixo: \n  Nome: " + vend.informeNome() + "\n Sal�rio Fixo: " 
	  	+ vend.informeSalarioFixo() + "\n Comiss�o: " + vend.informeComissao() + "\n Sal�rio Total: " + vend.informeSalarioTotal());   
    }
    
    public void mostraSalarioMedioMulheres(int c, double soma)
    {
    	if(c == 0)
    	{
    		JOptionPane.showMessageDialog(null,"N�o h� vendedoras cadastradas");
    	}
    	else
    		JOptionPane.showMessageDialog(null,"M�dia de sal�rio das vendedoras �: " + soma/c);    	
    }
    
}