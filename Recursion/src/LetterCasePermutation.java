
public class LetterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "a1B2";
		String output = "";
		solve(input,output);
	}

	private static void solve(String in,String op) {
		if(in.length()==0) {
			System.out.println(op);
			return;
		}
		if(Character.isAlphabetic(in.charAt(0))){  //alphabet 2 choices
			String op1=op;
			String op2=op;
			op1+=in.substring(0,1).toLowerCase();
			op2+=in.substring(0,1).toUpperCase();
			solve(in.substring(1),op1);
			solve(in.substring(1),op2);
		}
		else {
			String op1=op;
			op1+=in.charAt(0);
			solve(in.substring(1),op1);  // for digits only one choice input smaller output just add
		}
		return;
	}
}
