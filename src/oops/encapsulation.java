package oops;


class encp
{
	private String name;
	private String destination;
	public String getName()
	{
		return name;
	}
	public void SetName(String name)
	{
		this.name=name;
		
	}
	public String getDestination()
	{
		return destination;
	}
	public void setDestination(String destination)
	{
		this.destination=destination;
	}
}


public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		encp ob=new encp();
		ob.SetName("nkm");
		System.out.println(ob.getName());
		ob.setDestination("Tester");
		System.out.println(ob.getDestination());
	}

}
