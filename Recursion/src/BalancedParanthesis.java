import java.util.ArrayList;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		ArrayList<String> ar = new ArrayList<String>();
		generateAllBalencedParentheses("",n,n,ar);
		
		System.out.println(ar); 
		
	}

	public static void generateAllBalencedParentheses(String op,int open,int close,ArrayList<String> vec){
        if(open==0 && close==0){
            vec.add(op);
            return;
        }
        if(open!=0){
            String op1=op+"(";
            generateAllBalencedParentheses(op1,open-1,close,vec);
        }
        if(close>open){
            String op2=op+")";
            generateAllBalencedParentheses(op2,open,close-1,vec);
        }
    }
}
