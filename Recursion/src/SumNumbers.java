
public class SumNumbers {

	public static void main(String[] args) {

		int res = sumNums(10) ;
		System.out.println(res);
	}
	
	private static int sumNums(int number) {
		if(number==0)
			return 0;
		
		return number+sumNums(number-1);
	}

}
