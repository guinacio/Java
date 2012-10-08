public class Pessoa {

	private String name;
	private char sex;
	private int age;
	
	public Pessoa(String vName, char vSex, int vAge)
	{
		name = vName;
		
		vSex = Character.toUpperCase(vSex);
		if(vSex == 'M' || vSex == 'F')
			sex = vSex;
		else
			sex = '*';
		
		if(vAge >= 0)
			age = vAge;
		else
			age = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public char getSex()
	{
		return sex;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String vName)
	{
		name = vName;
	}
	
	public void setSex(char vSex)
	{
		if(sex == 'M' || sex == 'F')
			sex = vSex;
	}
	
	public void setAge(int vAge)
	{
		if(age >= 0)
			age = vAge;
	}
	
	public void birthday()
	{
		age++;
	}
	
	public String toString()
	{
		String s = "Name: " + name;
		s = s + "\nGender: " + sex;
		s = s + "\nAge: " + age;
		
		return s;
	}
}
