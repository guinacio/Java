public class Principal
{

	public static void main(String[] par)
	{
		Interface aInterface = new Interface();
		//double vRaio = aInterface.recebeValor();
		Circulo d = aInterface.pecaCirculo();
		aInterface.mostraCirculo(d);
		/* double areaD = d.calculaArea();
		double perD = d.calculaPerimetro();
		Circulo c;
		double areaC;
		double perC;
		
		aInterface.mostraArea("D",areaD, perD);
		*/
		/* d.recebaRaio(5.0);
		areaD = d.calculaArea();
		perD = d.calculaPerimetro();
				
		aInterface.mostraArea("D",areaD, perD);
		*/
		/*
		vRaio = aInterface.recebeValor();
		c = new Circulo(vRaio);
		areaC = c.calculaArea();
		perC = c.calculaPerimetro();
		
		aInterface.mostraArea("C",areaC, perC);
		*/
	}
}