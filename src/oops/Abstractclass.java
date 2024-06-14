package oops;


abstract class google
{
	abstract void message();
	public void search()
	{
		System.out.println("search details");
		
	}
	
}
class searchall extends google
{

	@Override
	void message() {
		
		System.out.println("searchall");
		// TODO Auto-generated method stub
		
	}
	
}
class searchimage extends google
{

	@Override
	void message() {
		System.out.println("search image");
		// TODO Auto-generated method stub
		
	}
	
}

class searchvideo extends google
{

	@Override
	void message() {
		System.out.println("searcha video");
		// TODO Auto-generated method stub
		
	}
	
}

public class Abstractclass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		searchall s=new searchall();
		s.message();
		s.search();
		searchimage si=new searchimage();
		si.message();
		si.search();
		searchvideo sv=new searchvideo();
		sv.message();
		sv.search();
	}

}
