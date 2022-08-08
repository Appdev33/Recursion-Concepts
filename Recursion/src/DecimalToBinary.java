
public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println( decToBin(9897,"") );
	}

	private static String decToBin(int decimal, String result) {
		
		if(decimal==0)
			return result;
		
		result = decimal%2 + result;
		return decToBin(decimal/2,result);
	}
}
