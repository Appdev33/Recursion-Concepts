import java.util.ArrayList;

public class BinaryNumOnesmore {

	static ArrayList<String> temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		temp = new  ArrayList<String>();
		helper("",0,0,n,temp);
		
		System.out.println(temp);
	}

	private static void helper(String output,int ones, int zeroes,int n, ArrayList<String> temp) {
		
		if(n==0) {
			System.out.println(output);
			temp.add(output);
			return ;
		}
			
		
		String op1 = output+"1";
		helper(op1,ones+1,zeroes,n-1,temp);		
		
		
		if(ones>zeroes) {
			String op2 = output+"0";
			helper(op2,ones,zeroes+1,n-1,temp);
		}
		
//		if(n==0) {
//			System.out.println(output);
//			temp.add(output);
//			return;
//		}
//		
//		if(ones == zeroes) {
//			String op1 = output;
//			op1+="1";
//			helper(op1,ones+1,zeroes,n-1,temp);
//		}else {
//			String op1 = output;
//			String op2 = output;
//			op1+="1";
//			op2+="0";
//			helper(op1,ones+1,zeroes,n-1,temp);
//			helper(op2,ones,zeroes+1,n-1,temp);
//		}
	}
}
