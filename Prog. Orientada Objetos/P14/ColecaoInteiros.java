public class ColecaoInteiros
{
	private int n;
	private int[] x;
	
	public ColecaoInteiros(int cap)
	{
		n = 0;
		x = new int[cap];
	}
	public ColecaoInteiros(int[] z)
	{
		n = z.length;
		x = new int[n];
		for(int i = 0; i < n; i++)
			x[i] = z[i];
	}
	
	public int getN()
	{
		return n;
	}
	
	public int getPosV(int pos)
	{
		if(pos >= 0 && pos < n)
			return x[pos];
		return Integer.MAX_VALUE;
	}
	
	public int getSum()
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
			sum = sum + x[i];
		
		return sum;
	}
	
	public int getLower()
	{
		int lwr = x[0];
		for(int i = 1; i < n; i++)
		{
			if(lwr > x[i])
				lwr = x[i];
		}
		
		return lwr;
	}
	
	public int getHigher()
	{
		int high = x[0];
		for(int i = 1; i < n; i++)
		{
			if(high < x[i])
				high = x[i];
		}
		
		return high;
	}
	
	public int getQttNegativ()
	{
		int count = 0;
		for(int i = 0; i < n; i++)
		{
			if(x[i] < 0)
				count++;
		}
		
		return count;
	}
	
	public boolean contemValor(int valor)
	{
		for(int i = 0; i < n; i++)
		{
			if(valor == x[i])
			{
				return true;
			}
		}
		
		return false;
	}
	
	public String toString()
	{
		String s = "";
		for(int i = 0; i < n ; i++)
			s += x[i] + " ";
		return s;
	}
	
	public int posFOcc(int v)
	{
		for(int i = 0; i<n; i++)
		{
			if(x[i] == v)
				return i;
		}
		
		return -1;
	}
	
	public boolean putValue(int value)
	{
		if(n == x.length)
		   return false;
		
		x[n] = value;
		n++;
		
		return true;
	}
	
	public void putAlways(int value)
	{
		if(x.length == n)
		{
			int[] aux = new int[n+10];
			for(int i = 0; i<n;i++)
				aux[i] = x[i];
			x = aux;
		}
		
		x[n] = value;
		n++;
	}
	
	public int[] getNegatives()
	{
		
		int p = 0; 
		for(int i = 0; i<n; i++)
		{
			if(x[i] < 0)
			{
				p++;
			}		
		}
		int[] aux = new int[p];
		p = 0;
		for(int i = 0; i<n; i++)
		{
			if(x[i] < 0)
			{
				aux[p] = x[i];
				p++;
			}		
		}
		
		
		return aux;
	}
	
	public boolean deleteFOcc(int value)
	{
		int p = this.posFOcc(value);
		if(p == -1)
			return false;
		
		for(int i = p; p > n-1; i++)
		{
			x[i] = x[i+1];
		}
		n--;
		return true;
	}
}