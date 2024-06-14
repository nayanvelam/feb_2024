 /*package basic;

public class string_reverse {
    public static void main(String[] args) {
        String str = "world";
        String reversed = reverse_String(str);
        System.out.println("String is : " + str);
        System.out.println("Reversed string is : " + reversed);
    }    
    public static String reverse_String(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        
        char[] reversedArray = new char[length];
      
        for (int i = 0; i < length; i++) {
            reversedArray[length - 1 - i] = charArray[i];
        }
        return new String(reversedArray);
    }
}
*/
package basic;
public class string_reverse {
    public static void main(String[] args) {
        String str = "world";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("String is : " + str);
        System.out.println("Reversed string is : " + reversed);
    }
}