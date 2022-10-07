
public class PermutationCaseChange {

	public static void main(String[] args) {
		
		String str = "abc";
		String input = ""+str.charAt(0);
		solve("","ab");
	}

	private static void solve(String output, String input) {
		
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		
		solve(output+input.charAt(0),input.substring(1));
		solve(output+Character.toUpperCase(input.charAt(0)),input.substring(1));
	}

}
