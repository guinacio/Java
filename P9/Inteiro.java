public class Inteiro
{
	private int n;
	
	public Inteiro(int num)
	{
	  if(num<0)
	  {
	  	n = -1*num;
	  }
	  else
	  	n = num;
	  if(num==0)
	  {
	    n = 1;
	  }
	}
	
	public int retornaN()
	{
		return n;
	}
	
	public boolean ePar()
	{
		if(n%2 == 0)
		  return true;
		else
		  return false;
	}
	
	public int somaPares()
	{
		int soma = 0;
		int aux;
		
		if(this.ePar())
		{
			aux = n-2;
			while(aux>0)
			{
				soma = soma + aux;
				aux = aux-2;
			}
			
			return soma;
		}
		else
		{
		
			aux = n-1;
			while(aux>=1)
			{
				soma = soma + aux;
				aux = aux-2;
			}
			
			return soma;
    	}
	}
	
	public int fatorial()
	{
		int aux = n;
		int fat = 1;
		
		while(aux>0)
		{
			fat = fat*aux;
			aux--;
		}
		
		return fat;
				
	}
	public int fatorial(int num)
	{
		int aux = num;
		int fat = 1;
		
		while(aux>0)
		{
			fat = fat*aux;
			aux--;
		}
		
		return fat;
				
	}
	
	public int valorIntermediario()
	{
		return (int)(Math.random()*n);		
	}
	
	public double fun1()
	{
		double i;
		double s = 0;
		int aux = n;
		
		for(i=1.0;i<=n;i++)
		{
			s = s + (i/aux);
			aux--;
		}
		return s;
	}
	
	public String retornaUltimoDigito()
	{
		int aux = n;
		int dig = aux%10;
		
		switch (dig)
		{
			case 0:
				return "Zero";
			case 1:
				return "Um";
			case 2:
				return "Dois";
			case 3:
				return "Três";
			case 4:
				return "Quatro";
			case 5:
				return "Cinco";
			case 6:
				return "Seis";
			case 7: 
				return "Sete";
			case 8:
				return "Oito";
			default:
				return "Nove";				
		}
	}
	
	public int somaDigitos()
	{
		int aux = n;
		int digito;
		int soma=0;
		int i;
		while(aux!=0)
		{
			digito = aux%10;
			soma = soma + digito;
			aux = aux/10;
		}
		return soma;
	}
	
	public char comparaInteiros(Inteiro outro)
	{
		if(n < outro.retornaN())
		{
			return '<';
		}
		else if(n > outro.retornaN())
		{
			return '>';
		}
		else
			return '=';
	}
	
	public Inteiro somaInteiros(Inteiro outro)
	{
		int soma = n + outro.retornaN();
		return new Inteiro(soma);
	}
	
	public Inteiro difInteiros(Inteiro outro)
	{
		int dif = n - outro.retornaN();
		if(dif < 0)
		 System.out.println("Diferença é negativa, valor dado em modulo");
		if(dif==0)
		 System.out.println("Diferença é 0, resposta é 1 por default");
		return new Inteiro(dif);
	}
	
	public double fun2(int parc)
	{
		int aux = n;
		int i;
		double s = 0;
		
		for(i=1;i<=parc;i++)
		{
			s = s + (-1.0*Math.pow((-1.0),i)*Math.pow(n,i))/(this.fatorial(i));
		}
		return s;
	}
	
	public boolean ePrimo()
	{
		int aux = (int) Math.sqrt(n);
		int cont = 3;
		if(n==1)
		{
		  return false;
		}
		if(n==2 || n==3)
		{
		  return true;
		}
		if(n%2 == 0)
		{
		  return false;
		}
		while(cont <= aux)
		{
			if(n%cont == 0)
			  return false;
			cont = cont + 2;
		}
		return true;
				
	}
	
	public int multiplosDe3()
	{
		int i;
		int soma=0;
		for(i=0;i<n;i=i+3)
		{
			soma = soma + i;
		}
		
		return soma;
	}
	
	public Inteiro fazIgual()
	{
		int valor = n;
		return new Inteiro(valor);
	}
	
}