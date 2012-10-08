public class Principal
{
	public static void main(String[] par)
	{
		Inteiro numero = new Inteiro(3);
		Inteiro outroNumero = new Inteiro(10);
			
		if(numero.ePar())
		  System.out.println("Par");
		else
		  System.out.println("Ímpar");
		System.out.println("A soma dos pares menores que N é: " + numero.somaPares());
		System.out.println("O fatorial de N é: " + numero.fatorial());
		System.out.println("0 < x <= N é: " + numero.valorIntermediario());
		System.out.println("A função S é: " + numero.fun1());
		System.out.println("O último dígito é: " + numero.retornaUltimoDigito());
		System.out.println("A soma dos dígitos de "+ numero.retornaN() +" é: " + numero.somaDigitos());
		System.out.println("O valor " + numero.retornaN() +" é " + numero.comparaInteiros(outroNumero) + " que o valor " + outroNumero.retornaN());
		Inteiro maisUm = numero.somaInteiros(outroNumero);
		System.out.println("A soma dos dois é: " + maisUm.retornaN());
	    System.out.println("A função S é: " + numero.fun2(4));
		if(numero.ePrimo())
		   System.out.println("É primo");
		else
		   System.out.println("Não é Primo");
		System.out.println("A soma dos multiplos de 3 é: " + numero.multiplosDe3());
		Inteiro maisOutro = numero.fazIgual();
		System.out.println("Testando igual " + maisOutro.retornaN());
		Inteiro maisOutro2 = numero.difInteiros(outroNumero);
		System.out.println("A dif. dos dois é: " + maisOutro2.retornaN());
	}
}