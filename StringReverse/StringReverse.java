//GECM30
//K.Venkata Shyam
//kuppalashyam@gmail.com
//9701399426
package pack1;

public class StringReverse {

	public static void main(String[] args) {
		String s=new String("hello");
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
		
	}
}
