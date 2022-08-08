
public class Palindromes {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("kayak is kayak") );
	}
	
	private static boolean isPalindrome(String input) {
		// TODO Auto-generated method stub
		if(input.length()==0 || input.length()==1) {
			return true;
		}
		
		return input.charAt(0) == input.charAt(input.length()-1)
				&& isPalindrome(input.substring(1,input.length()-1));
		
//		if(input.charAt(0) == input.charAt(input.length()-1)) {
//			System.out.println(input.substring(1,input.length()-1));
//				return isPalindrome(input.substring(1,input.length()-1));
//		}
//		return false;
	}
	
}
