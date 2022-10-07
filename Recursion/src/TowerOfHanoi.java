
public class TowerOfHanoi {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int disks=5;
		
		TOH(disks,1,2,3) ;
		
		System.out.println(count);
	}
	
	public static void TOH(int n,int source,int helper,int destination) {
		
		count++;
		if(n==1) {
			System.out.println(source+"---> "+destination+" using "+helper);
			return ;
		}
			
		TOH(n-1,source,destination,helper);
		System.out.println(source+"---> "+destination+" using "+helper);
		TOH(n-1,helper,source,destination);
	}

}
