package basic;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		int result=0;
		String calculator="addition";
		
		switch(calculator)
		{
		case "addition": 
			result=a+b;
			System.out.println(result);
		break;
		case "subtraction":
			result=a-b;
		break;
		case "multiplication":result=a*b;
		System.out.println(result);
		
		default:System.out.println("invalid");
		}
	}

}
