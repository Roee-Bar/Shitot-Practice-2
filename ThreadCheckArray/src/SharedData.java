import java.util.ArrayList;

/**
 * Class containing all of the shared information between the threads.
 */
public class SharedData 
{
	ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array
	 * @param b
	 * Sets B and Array parameters as the ones we got.
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * Return winArray Value
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Set the boolean array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * return array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * return B value
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * return Flag Value
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 * Sets value of the shared flag to the one we got.
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}