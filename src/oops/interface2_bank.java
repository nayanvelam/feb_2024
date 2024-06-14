package oops;


interface bank1
{
	void deposite();
	void withdraw();
}
interface bank2
{
	void interest();
	void balance();
	
}
class ICICI implements bank1,bank2
{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("interest");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("balance");
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("deposite");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("withdraw");
	}
	
}

public class interface2_bank {
	public static void main(String args[]) {
		ICICI ic=new ICICI();
		ic.balance();
		ic.deposite();
		ic.interest();
		
		
	}

}








