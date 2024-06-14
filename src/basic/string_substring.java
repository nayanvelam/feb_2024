package basic;

public class string_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s1="rogersoft"; 
		System.out.println(s1.substring(2,4));//returns va 
		System.out.println(s1.substring(2));//returns vatpoint*/
		String s1="java string split method by rogersoft"; 
		String[] words=s1.split("\\s");//splits the string based on whitespace 
		//using java foreach loop to print elements of string array 
		for(String w:words){ 
		System.out.println(w);
		}
	}

}
