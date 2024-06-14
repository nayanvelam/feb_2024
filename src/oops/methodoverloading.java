package oops;





public class methodoverloading {
	
	public void add(int a ,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}

	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		methodoverloading mo=new methodoverloading();
		mo.add(2, 3);
		mo.add(2, 3,4);

	}

}
