import javax.swing.JOptionPane;

public class Principal
{
	public static void main(String[] p)
	{
		String s = "Exemplo";
		int tam = s.length();
		
		System.out.println("O string " + s + " tem tamanho " + tam);
		
		s = "Universidade Federal";
		char c = s.charAt(4);
		
		System.out.println(c);
		
		String s1 = "Aula POO1";
		String s2 = "Classe POO";
		String s4 = "aula poo";
		//String s3 = JOptionPane.showInputDialog("Digite String: ");
		String s5 = "Jose";
		String s6 = "Josf";
		String s7 = "Josh";
		String s8 = "Jote";
		
		if(s1 == s4)
			System.out.println("Strings iguais metodo errado");
		if(s1.equals(s4))
			System.out.println("Strings iguais metodo certo");
		if(s1.equalsIgnoreCase(s4))
			System.out.println("Strings iguais case insensitive");
		System.out.println(s5.compareTo(s5));
		System.out.println(s5.compareTo(s6));
		System.out.println(s5.compareTo(s7));
		System.out.println(s5.compareTo(s8));
		String s9 = s2.substring(2,5);
		System.out.println(s9);
		
		String s10 = "  ufliictsc  ";
		System.out.print(s10.trim());
		System.out.println("sakhdjsao");
		if(Character.isDigit(s1.charAt(8)))
			System.out.println("É dígito");
		if(Character.isLetter(s1.charAt(7)))
			System.out.println("É letra");
		if(Character.isLowerCase(s10.charAt(3)))
			System.out.println("É minusculo");
		if(Character.isUpperCase(s8.charAt(0)))
			System.out.println("É maiusculo");	
					
	}
}