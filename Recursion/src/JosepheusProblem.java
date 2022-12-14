import java.util.ArrayList;
import java.util.List;

public class JosepheusProblem {

	public static void main(String[] args) {
	    int n = 40, k = 7;
	    int index = 0, ans = -1;
	    List<Integer> soldiers = new ArrayList<>();

	    for (int i = 1; i <= n; i++) {
	      soldiers.add(i);
	    }
	    int res = solve(soldiers, k, index, ans);
	    System.out.println("Last soldier standing is: " + res);
	  }

	  private static int solve(List<Integer> soldiers, int k, int index, int ans) {
	    if (soldiers.size() == 1) {
	      ans = soldiers.get(0);
	      return ans;
	    }
	    index = (index + k - 1) % soldiers.size();
	    System.out.println("Soldier " + soldiers.remove(index) + " killed");

	    return solve(soldiers, k, index, ans);
	  }
}
