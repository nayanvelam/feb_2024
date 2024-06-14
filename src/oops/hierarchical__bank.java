package oops;

public class hierarchical__bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sbi s=new sbi();
		hdfc h=new hdfc();
		s.deposit();
		s.withdraw();
		s.sbiinterest();
		h.deposit();
		h.withdraw();
		h.loan();
		
	}
}
class bank
{
	public void withdraw()
	{
		System.out.println("Withdraw.!")	;
	}
	public void deposit()
	{
		System.out.println("Deposite");
	}
}
class sbi extends bank
{
	public void sbiinterest()
	{
		System.out.println("sbi interest");
	}
}
class hdfc extends bank
{
	public void loan()
	{
		System.out.println("Loan");
	}
	
}