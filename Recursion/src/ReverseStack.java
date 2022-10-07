import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack();
		int ar[] = {5,1,0,2,5,6,9,21};
		
		for(int i: ar) 
			st.push(i);
		
		reverseStack(st);
		
		System.out.println(st);
		
	}

	private static Stack<Integer> reverseStack(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.size()==1) {
			return st;
		}
			
		int temp = st.pop(); 
		reverseStack(st);
		
		insert(st,temp);
		
		return st;
	}

	private static Stack<Integer> insert(Stack<Integer> st, int temp) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			st.push(temp);
			return st;
		}
		
		int val = st.pop();
		insert(st,temp);
		
		st.add(val);
		return st;
	}
}

/*
 class Solution {
    public static void reverse(Stack<Integer> st) {
        // Base Condition
        if(st.size() == 1) return st;
        
        // Hypothesis
        int temp = st.pop() // removing 5 from stack
		reverse(st); // reversing the stack
        insert(st, temp); // func. call
    }
    public static Stack<Integer> solve(Stack<Integer> st, int temp) {
        // Base Condition
        if(st.size() == 0){
            st.push(temp);
            return st;
        }
        
        // Hypothesis
        int val = st.pop(); // removing 1 from stack
        insert(st, temp); // inserting 5 to stack; 
        
		// Induction 
		st.push(val); // inserting 1 to stack
        return st;
    }
}
 */
