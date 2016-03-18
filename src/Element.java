// TODO detail comment (what an element can be?)
/**
 * Represent an element from the game
 * 
 * @author foexs
 */
public class Element
{

	/**
	 * Create an invisible element using the type code
	 * 
	 * @param code 
	 * 1 = north-east
	 * 2 = north-south
	 * 3 = north-west
	 * 4 = south-east
	 * 5 = south-north
	 * 6 = east-west
	 */
	public Element(int code) {
		super();
		this.visibility=false;
		
	}

	/**
	 * True if the tile is visible, false if tile is hidden
	 */
	private boolean visibility = false;
	
	// TODO move the description, of what a pipe (?) is, above
	/**
	 * There are 6 kinds of pipes:
	 * P_S_E;P_O_E;P_N_S;P_S_O;P_N_O;P_N_E See the graph in the docs folder for
	 * details
	 * 
	 * @param code
	 *            A code acting as an identifier for each elements
	 * @param posY
	 *            Knows its own position in the grid
	 * @param posX
	 *            Knows its own position in the grid
	 */

	/**
	 * @return true if the element was discovered
	 */
	public boolean isVisible()
	{
		return this.visibility;
	}
	}