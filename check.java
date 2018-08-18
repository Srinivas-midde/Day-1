
public class check {
	int ams(int n)
    {
    	int x=0;
		while(n>0)
		{
			int i=n%10;
						
			x=x+(i*i*i);
			n=n/10;
		}
		return x;
	}
	public static void main(String[] args)
	{
		int i,num,x;
		check a=new check();
		for(i=100;i<1000;i++)
		{
			num = i;
			x = a.ams(i);
			if(x==num)
				System.out.println(i+" ");
				
		}
	}
 
}
