/* Objetivo: Escrever um programa que calcule a �rea e o per�metro de um ret�ngulo
 * utilizando POO.
 *
 *Aluno: Guilherme S. In�cio
 *
 */

public class Principal
{
	public static void main(String[] par)
	{
		Interface aInterface = new Interface();
		Retangulo r = aInterface.fazRetangulo();

		aInterface.mostraRetangulo(r);
	}
}