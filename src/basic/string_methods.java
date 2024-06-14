package basic;

public class string_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="welcome";
		String S2="Nayana";
		int length=S.length();
		System.out.println(length);
		
	//join two strings
		
		System.out.println(S.concat(S2));
		System.out.println(1+2+S);
		System.out.println(S+1+2);	
		System.out.println(S.toLowerCase());
		System.out.println(S2.toUpperCase());
		
	//compare
		
		String a="Abc";
		String b="abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
	// to Remove white space
		
		String m="   hello";
		System.out.println(m);
		System.out.println(m.trim());
		
	// To extract a particular portion	
		
		String y="welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(0,4));
		
	// to check if a particular string is included in another string
		
		
		String x="welcome to the world";
		System.out.println(x.contains("world"));
		System.out.println(x.contains("old"));
		
	// to replace
		
		
		System.out.println(x.replace("el", "xy"));
		
	// to display particular character
		
		
		String z="welcome";
		System.out.println(z.charAt(4));
		
		String w="welcome to luminar";
        String words[]=w.split(" ");
        for(String l:words)
        {
        	System.out.println(l);
        }
		
		
        String f = "hello";
        char[] g = f.toCharArray();

        for (char c : g) {
            System.out.println(c);
        }

        /*String word[]=f.split("");
        for(String l:word)
        {
        	System.out.println(l);
        }*/
        
        
        
        
	}

}
