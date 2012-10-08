public class Principal
{
	public static void main(String[] p)
	{
		String ss = "Bla 2165 $#@!%";
		String sx = "Surpreendente";
		System.out.println(ManipulaString.quantLetras(ss));
		System.out.println(ManipulaString.temCaracter(ss,'!'));
		System.out.println(ManipulaString.eVogal('z'));
		System.out.println(ManipulaString.eConsoante('r'));
		System.out.println(ManipulaString.qtdConsoantes(ss));
		System.out.println(ManipulaString.temEV(ss));
		System.out.println(ManipulaString.temEV(sx));
		
		System.out.println(ManipulaString.geraSenha(10));
		System.out.println(ManipulaString.ePalindromo("Socorram-me subi no onibus em Marrocos"));
		
		String[] ssss = {"Exemplo","UFSC","INE","Sistemas"};
		
		System.out.println(ManipulaString.maiorString(ssss));
	}
	
	// PAra um arranjo de Strings, determine quantos strings começam e terminam com vogal
	//brancos no inicio e no fim decem ser desconsiderados;
}