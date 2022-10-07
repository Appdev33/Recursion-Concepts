
public class KthGrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=4;
		int K=2;
		System.out.println((KthGramm(N,K)) );

	}
	
	public static int KthGramm(int N,int K) {
		
		int ans;
		if(N==1 && K==1)
			return 0;
		
		int mid = (int) (Math.pow(2, N-1)/2);
		
		if(K<=mid) {
			ans = KthGramm(N-1,K);
			return ans;
		}
		else {
			ans = KthGramm(N-1,K-mid);
			return ans==1?0:1;
		}

		
	}
}
