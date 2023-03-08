import java.util.HashMap;
import java.util.Map;

public class Pair {
	
	public HashMap<Pair, Integer> memo = new HashMap<>();

	private int row;
	private int col;
	public Pair(int r, int c)
	{
		row = r;
		col = c;
		pascal(row, col);
	}
	
	public int pascal(int r, int c)
	{
		if(r==0 || r==0)
		{
			return 1; 
		}
		if(memo.containsKey(new Pair(r,c)))
		{
			return memo.get(new Pair(r,c));
		}
		int last = pascal(r-1, c) + pascal(r, c-1);
		memo.put(new Pair(r-1,c), last);
		memo.put(new Pair(r,c-1), last);
		return last;
		
	}
	

}
