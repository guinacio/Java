
public class Principal {

	public static void main(String[] par)
	{
		Interface aInter = new Interface();
		Pessoa pYoungest = new Pessoa("Matusalem",'M',969);
		Pessoa pOldest = new Pessoa("Unborn",'*',0);
		int count = aInter.askQuantity();
		int countAge = 0;
		int countWomen = 0;
		int sumAgeF = 0;
		
		for(int i = 1; i <= count; i++)
		{
			Pessoa p = aInter.createPerson();
			int vAge = p.getAge();
			
			if(vAge >= 12 && vAge <= 18)
				countAge++;
			if(p.getSex() == 'F')
			{
				sumAgeF = sumAgeF + vAge;
				countWomen++;
			}
			if(vAge < pYoungest.getAge())
				pYoungest = p;
			if(vAge > pOldest.getAge())
				pOldest = p;
			
		}
		
		aInter.show12to18(countAge);
		aInter.showAverageAgeF(sumAgeF, countWomen);
		aInter.showYoungest(pYoungest);
		aInter.showOldest(pOldest);
	}
}
