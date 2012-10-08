public class Principal
{
	public static void main(String[] par)
	{
		Interface aI = new Interface();
		ColecaoInteiros c = new ColecaoInteiros(15);
		int[] a = {4,2,-9,3};
		int valor = 3;
		int valor2 = -9;
		int pos = 1;
		ColecaoInteiros d = new ColecaoInteiros(a);
		int l = d.getN();
		int v = d.getPosV(pos);
		if(v == Integer.MAX_VALUE)
			aI.dispMessage("Posiçao Inexistente na coleção");
		int lower = d.getLower();
		int higher = d.getHigher();
		
		aI.dispMessage("O N é: " + l);
		aI.dispMessage("A posicao "+ pos +" é: " + v);
		aI.dispMessage("O menor valor é: " + lower);
		aI.dispMessage("O maior valor é: " + higher);
		aI.dispMessage(d.toString());
		aI.dispMessage("A soma é: " + d.getSum());
		aI.dispMessage("O num. de negativos é: " + d.getQttNegativ());
		aI.dispMessage("Contém o valor " + valor +"? " + d.contemValor(3));
		int posFO = d.posFOcc(-9);
		if(posFO == -1)
			aI.dispMessage("O valor " + valor2 + " não existe");
		else
		    aI.dispMessage("Posiçao de primeira ocorrencia de " + valor2 +":  " + posFO);
		if(d.putValue(8))
			aI.dispMessage("Valor Inserido.");
		else
			aI.dispMessage("Cheio.");
		aI.dispMessage(d.toString());
		d.putAlways(-22);
		aI.dispMessage(d.toString());
		ColecaoInteiros neg = new ColecaoInteiros(d.getNegatives());
		aI.dispMessage(neg.toString());
		if(d.deleteFOcc(-22))
			aI.dispMessage("Valor Eliminado.");
		else
			aI.dispMessage("Nao foi possivel.");
		aI.dispMessage(d.toString());
		
	}
}