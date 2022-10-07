import java.util.Stack;

public class DeleteMidStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Stack<Integer> st = new Stack<>();
	    int ar[] = {5,1,2,5,6,9,21};
			
		for(int i: ar) 
			st.push(i);
		
		MidDel(st,st.size()/2+1);
		System.out.println(st);
	}

	private static Stack<Integer> MidDel(Stack<Integer> st,int len) {
		// TODO Auto-generated method stub
		if(st.size()==1 || st.size()==len) {
			st.pop();
			return st;
		}
		
		int val = st.pop();
		MidDel(st,len);
		
		st.push(val);
		
		return st;
	}

}


/*
 
 public static void midDel(Stack<Integer> st) {
        // Base Condition
        if(st.size() == 0) return st;
        
        // Hypothesis
        int k = st.size() / 2 + 1; // calculating mid
        solve(st, k); // func. call
    }
    public static Stack<Integer> solve(Stack<Integer> st, int k) {
        // Base Condition
        if(st.size() == 1){
            st.pop();
            return st;
        }
        
        // Hypothesis
        int temp = st.pop(); // removing 5 from stack
        solve(st, k - 1); 
        
		// Induction
        return st.push(temp);
 */
  
