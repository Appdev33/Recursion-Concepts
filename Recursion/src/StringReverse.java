
public class StringReverse {
	
	public static void main(String[] args) {
		
		System.out.println(Reverse("Hello this is it") );
	}
	
	public static String Reverse(String input) {
		
		if(input.equals("")) {
			return  "";
		}
		
		return Reverse(input.substring(1))+ input.charAt(0);
	}
}
