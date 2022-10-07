import java.util.ArrayList;

public class PrintSubsets {
	
	static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String input ="123";
//		String output="";
//		
//		solve(input,output);
		
		int ar[] = {1,2,3};
		backTracking(ar,new ArrayList<>(),0);
		
		System.out.println(res);
	}

	private static void solve(String input, String output) {
		if(input.length()==0) {
			System.out.println(output);
			return ;
		}
		
		//Copy same output from previous step and work on it
		String op1  =  output; 
		String op2  =  output;
		
		op2+=input.charAt(0);        // make choice here at output
		input = input.substring(1);  //make input smaller
		
		solve(input,op1);
		solve(input,op2);	
	}
	
	public static void backTracking(int ar[], ArrayList<Integer> temp,int index) {
		
		if(!res.contains(temp)) 
			res.add(new ArrayList<>(temp));
		
		for(int i=index; i<ar.length; i++) {
			temp.add(ar[i]);
			backTracking(ar,temp,i+1);
			temp.remove(temp.size()-1);	
		}
	}
}
