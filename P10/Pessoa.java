public class Pessoa
{
	private String name;
	private char gender;
	private int age;
	
	public Pessoa(String vName, char vGender, int vAge)
	{
		name = vName;
		vGender = Character.toUpperCase(vGender);
		if(vGender == 'M' || vGender == 'F')
			gender = vGender;
		else
		  gender = '*';
	    age = vAge;
	    if(age < 0)
	      age = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String vName)
	{
		name = vName;
	}
	
	public void setGender(char vGender)
	{
		vGender = Character.toUpperCase(vGender);
		if(vGender == 'M' || vGender == 'F')
		gender = vGender;
	}
	
	public void setAge(int vAge)
	{
		if(age >= 0)
	      age = vAge;
	}
	
	public void anniversary()
	{
		age++;
	}
	
	public String toString()
	{
		String s = "Nome: " + name;
		s = s + "\n Sexo: " + gender;
		s = s + "\n Idade: " + age;
		
		return s;
	}
}