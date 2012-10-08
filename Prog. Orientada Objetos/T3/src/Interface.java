import javax.swing.JOptionPane;

public class Interface {
	
	public Interface()
	{
	}

	public int askQuantity()
	{
		String sNum = JOptionPane.showInputDialog("How many people would you like to register?");
		int num = Integer.parseInt(sNum);
		if(num == 0)
			System.exit(0);
		while(num < 0)
		{
			sNum = JOptionPane.showInputDialog("How many people would you like to register? \n\nP.S.: Make sure that you are entering a positive value.");
			num = Integer.parseInt(sNum);
			if(num == 0)
				System.exit(0);
		}
		
		return num;
	}
	
	public Pessoa createPerson()
	{
		String name = JOptionPane.showInputDialog("Name: ");
		
		String sSex = JOptionPane.showInputDialog("Gender: ");
		char sex = sSex.charAt(0);
		sex = Character.toUpperCase(sex);
		while(sex != 'M' && sex != 'F')
		{
			sSex = JOptionPane.showInputDialog("Enter a valid gender. \n\nExample: 'M' or 'F'");
			sex = sSex.charAt(0);
			sex = Character.toUpperCase(sex);
		}
		
		String sAge = JOptionPane.showInputDialog("Age: ");
		int age = Integer.parseInt(sAge);
		while(age < 0)
		{
			sAge = JOptionPane.showInputDialog("Enter a valid age. \n\nP.S.: Must be a positive value!");
			age = Integer.parseInt(sAge);
		}
		
		return new Pessoa(name, sex, age);
	}
	
	public void show12to18(int count)
	{
		JOptionPane.showMessageDialog(null,"People between 12 and 18 y.o.: " + count);
	}
	
	public void showAverageAgeF(int sum, int count)
	{
		if(count == 0)
			JOptionPane.showMessageDialog(null,"There is no woman registered.");
		else
			JOptionPane.showMessageDialog(null,"Average woman's age: " + (double)sum/count);
	}
	
	public void showYoungest(Pessoa p)
	{
		JOptionPane.showMessageDialog(null,"The youngest: \n\n" + p.toString());
	}
	
	public void showOldest(Pessoa p)
	{
		JOptionPane.showMessageDialog(null,"The oldest: \n\n" + p.toString());
	}
	
}
