import java.util.HashSet;
import java.util.Set;

public class UniqueSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aab";
		Set<String> res = new HashSet<String>();
		solve(input,"",res);
		
		System.out.println(res);
	}

	private static void solve(String input, String output,Set<String> res) {
		if(input.length()==0) {
//			System.out.println(output);
			res.add(output);
			return ;
		}
		
		//Copy same output from previous step and work on it
		String op1  =  output; 
		String op2  =  output;
		
		op2+=input.charAt(0);        // make choice here at output
		input = input.substring(1);  //make input smaller
		
		solve(input,op1,res);
		solve(input,op2,res);	
	}
}
