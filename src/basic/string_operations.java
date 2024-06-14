package basic;

public class string_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="jmeter";
		String s1="performance testing tool";
		
		System.out.println("After concatinate string is : "+s.concat(s1));
		String j="java language is platform independent";
		System.out.println(j.contains("language"));
		if(j.contains("language"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
			
		String s3="selenium webdriver is used for webapplication testing";
		String words[]=s3.split(" ");
        for(String l:words)
        	
        {
        	System.out.println(l);
        	if(l.contains("webapplication"))
        	{
        		break;
        	}
        		
        	
        }

	}

}
