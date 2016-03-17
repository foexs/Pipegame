// TODO detail comment (what an element can be?)
/**
 * Represent an element from the game
 * 
 * @author foexs
 */
public class Element
{

	// TODO write comment
	// TODO initialize value in constructor
	private boolean visibility = false;

	// TODO write comment
	private Pipe current;

	// TODO write comment
	private String name;

	// TODO move the description, of what a pipe (?) is, above
	/**
	 * A pipe is labeled by name There is 6 kind of pipes:
	 * P_S_E;P_O_E;P_N_S;P_S_O;P_N_O;P_N_E See the graph in the docs folder for
	 * details
	 * 
	 * @param givenName
	 *            A name acting as an identifier for each elements
	 * @param posY
	 *            Knows its own position in the grid
	 * @param posX
	 *            Knows its own position in the grid
	 */
	// TODO gather x and y in a Position object
	public Element(String givenName, int posY, int posX)
	{
		this.name = givenName;
		// TODO this is unsafe (ask why)
		// TODO think about using enumeration to represent king of pipes
		if (this.name == "P_S_E")
			current = new P_S_E(posY, posX);
	}

	// TODO fix comment
	/**
	 * @return the name of the object
	 */
	public String getName()
	{
		return name;
	}

	// TODO fix comment
	/**
	 * @return reference to the current element
	 */
	public Pipe getCurrent()
	{
		return current;
	}

	// TODO fix comment
	/**
	 * @return true if the element was discovered
	 */
	public boolean isVisible()
	{
		return visibility;
	}

	// TODO fix comment
	/**
	 * @return the line of the pipe
	 */
	public int getPosPipeY()
	{
		return current.posPipeY;
	}

	// TODO fix comment
	/**
	 * @return the column of the pipe
	 */
	public int getPosPipeX()
	{
		return current.posPipeX;
	}

	// TODO fix comment
	/**
	 * @return the Y position of one of the pipe's side
	 */
	public int getIPosPipeY()
	{
		return current.posIPipeY;
	}

	// TODO fix comment
	/**
	 * @return the X position of one of the pipe's side
	 */
	public int getIPosPipeX()
	{
		return current.posIPipeX;
	}

	// TODO fix comment
	/**
	 * @return the Y position of the other pipe's side
	 */
	public int getOPosPipeY()
	{
		return current.posOPipeY;
	}

	// TODO fix comment
	/**
	 * @return the X position of the other pipe's side
	 */
	public int getOPosPipeX()
	{
		return current.posOPipeX;
	}
	
	// TODO fix comment
	// TODO consider moving this elsewhre more relevant
	/**
	 * @return the position of the pipe and of the two I/O's in y,x form
	 */
	public String coordinateToString()
	{
		return current.toString();
	}
}
