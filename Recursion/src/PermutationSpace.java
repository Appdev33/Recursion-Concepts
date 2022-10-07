
public class PermutationSpace {

	public static void main(String[] args) {

		String str = "ABC";
		String input = ""+str.charAt(0);
		solve(input,str.substring(1));
	}

	private static void solve(String output, String input) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		
		String op1 = output;
		String op2 = output;
		
		op2+=" "+input.charAt(0);
		op1+=input.charAt(0);
		
		input = input.substring(1);
		
		solve(op1,input);
		solve(op2,input);
	}
}
