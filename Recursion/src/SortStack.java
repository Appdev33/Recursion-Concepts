import java.util.Stack;
/*
public class SortStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack();
		int ar[] = {5,1,0,2,5,6,9,21};
		
		for(int i: ar) {
			s.push(i);
		}
		
		System.out.println(Sort(s) );
	}
	
	public static Stack<Integer> Sort(Stack<Integer> s) {
		
		if(s.size()==1)
			return s;
		
		int val = s.pop();
		Sort(s);
		
		insert(s,val);
		
		return s;
	}

	private static Stack<Integer> insert(Stack<Integer> s, int val) {
		
		if(s.isEmpty() || val >= s.peek() ) {
			s.push(val);
			return s;
		}
		
		int temp = s.pop();
		insert(s, val);
		
		s.push(temp);
		return s;
	}
}*/


 class SortStack {
  // Main function call
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    int ar[] = {5,1,0,2,5,6,9,21};
		
	for(int i: ar) 
		st.push(i);
	

    System.out.println("\nStack after sorting:");
    Stack<Integer> sorted = sortStack(st);
    for (Integer i : sorted) {
      System.out.print(i + " ");
    }
  }
  // Actual work start's from here
  public static Stack<Integer> sortStack(Stack<Integer> st){
    if(st.size() == 1) return st; // Base Condition
    // Hypothesis
    int temp = st.pop(); // getting 2 out
    sortStack(st); // sorting the stack from [5,1,0] -> [0,1,5]

    return insertElementAtStack(st, temp);
  }
  public static Stack<Integer> insertElementAtStack(Stack<Integer> st, int temp){
    // Base Condition
    if(st.size() == 0 || temp >= st.peek()){ // checking if let say we have 6 in temp & 6 is greater then 5
      st.push(temp); // we will simply add it into our stack
      return st;
    }
    // Hypothesis
    int val = st.pop(); // getting 5 out stack becomes -> [0,1]
    insertElementAtStack(st, temp); // inserting 2 to [0,1] which becomes -> [0,1,2]
    // Induction
    st.push(val); // adding 5 to [0,1,2] which becomes -> [0,1,2,5]
    return st;
  }
} 
 
