public class Principal
{
	public static void main(String[] par)
	{
		Inteiro numero = new Inteiro(3);
		Inteiro outroNumero = new Inteiro(10);
			
		if(numero.ePar())
		  System.out.println("Par");
		else
		  System.out.println("�mpar");
		System.out.println("A soma dos pares menores que N �: " + numero.somaPares());
		System.out.println("O fatorial de N �: " + numero.fatorial());
		System.out.println("0 < x <= N �: " + numero.valorIntermediario());
		System.out.println("A fun��o S �: " + numero.fun1());
		System.out.println("O �ltimo d�gito �: " + numero.retornaUltimoDigito());
		System.out.println("A soma dos d�gitos de "+ numero.retornaN() +" �: " + numero.somaDigitos());
		System.out.println("O valor " + numero.retornaN() +" � " + numero.comparaInteiros(outroNumero) + " que o valor " + outroNumero.retornaN());
		Inteiro maisUm = numero.somaInteiros(outroNumero);
		System.out.println("A soma dos dois �: " + maisUm.retornaN());
	    System.out.println("A fun��o S �: " + numero.fun2(4));
		if(numero.ePrimo())
		   System.out.println("� primo");
		else
		   System.out.println("N�o � Primo");
		System.out.println("A soma dos multiplos de 3 �: " + numero.multiplosDe3());
		Inteiro maisOutro = numero.fazIgual();
		System.out.println("Testando igual " + maisOutro.retornaN());
		Inteiro maisOutro2 = numero.difInteiros(outroNumero);
		System.out.println("A dif. dos dois �: " + maisOutro2.retornaN());
	}
}