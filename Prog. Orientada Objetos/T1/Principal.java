/* Objetivo: Escrever um programa que calcule a área e o perímetro de um retângulo
 * utilizando POO.
 *
 *Aluno: Guilherme S. Inácio
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