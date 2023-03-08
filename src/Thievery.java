import java.util.HashMap;
import java.util.Map;

public class Thievery {
	
	public int longFibonacci(int n)
	{
		if(n<0)
		{
			System.out.println("NO SUCH NEGATIVE INDEX EXISTS");
		}
		if(n==0 || n==1)
		{
			return n;
		}
		
		return longFibonacci(n-1) + longFibonacci(n-2);
	}
	
	private Map<Integer, Integer> memo = new HashMap<>();
	public int longFibonacciMemo(int n)
	{
		if(n<0)
		{
			System.out.println("NO SUCH NEGATIVE INDEX EXISTS");
		}
		if(n==0 || n==1)
		{
			return n;
		}
		if(memo.containsKey(n))
		{
			return memo.get(n);
		}
		int last = longFibonacciMemo(n-1) + longFibonacciMemo(n-2);
		memo.put(n, last);
		return last;
	}
	
	public int pascal(int row, int col)
	{
		if(row==0 || col==0)
		{
			return 1; 
		}
		return pascal(row-1, col) + pascal(row, col-1);
	}
	
	private Map<Integer, Integer> memoNum = new HashMap<>();

	public int numPaths(int[][] grid)
	{
		return numPathsHelper(grid, 0,0);
				
	}
	private int numPathsHelper(int[][] grid, int row, int col)
	{
		if(row == grid.length && col == grid[0].length)
		{
			return 0;
		}
		if(memoNum.containsKey(grid[row][col]))
		{
			return memoNum.get(grid[row][col]);
		}
		int last = numPathsHelper(grid, row+1, col) + numPathsHelper(grid, row, col+1);
		memoNum.put(grid[row+1][col], last);
		memoNum.put(grid[row][col+1], last);
		return last;
	}
	
	private Map<Integer, Integer> memoCoins = new HashMap<>();

	public int minCoins(int total, int[] coins)
	{
		
		return total;
		
	}

}
