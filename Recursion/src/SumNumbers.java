
public class SumNumbers {

	public static void main(String[] args) {
		sumNums(10);
//		int res = sumNums(10) ;
//		System.out.println(res);
	}
	
	private static void sumNums(int n) {
		
		if(n==0)
		  return ;
		sumNums(n-1);
//		if(number==0)
//			return 0;
		System.out.print(n);
//		return number+sumNums(number-1);
	}

}
