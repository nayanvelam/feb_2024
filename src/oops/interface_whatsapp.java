package oops;

interface whatsappcalls
{
	void calls();
	void mute();
	void disconnect();
	
}
class audiocalls implements whatsappcalls
{

	@Override
	public void calls() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp calls");
		
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp calls muted");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp call disconnected");
	}
	
}


class videocalls implements whatsappcalls
{

	@Override
	public void calls() {
		// TODO Auto-generated method stub
		System.out.println("videocall");
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("videocall muted");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("videocall disconnected");
	}
	
}










public class interface_whatsapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		audiocalls a=new audiocalls();
		a.mute();
		a.disconnect();
		a.calls();
		videocalls v=new videocalls();
		v.mute();
		v.calls();
		v.disconnect();
		whatsappcalls ob=new audiocalls();
		ob.mute();
		ob.calls();
		ob.disconnect();
		ob=new videocalls();
		ob.mute();
		ob.calls();
		ob.disconnect();
		

	}

}
