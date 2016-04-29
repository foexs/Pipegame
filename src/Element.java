/**
 * Represent an element from the game
 *
 * There are 6 kinds of pipes:
 * SOUTH_WEST;SOUTH_EAST... See the graph in the docs folder for
 * details
 *
 * @author foexs
 */
public class Element
{

	/**
	 * True if the tile is visible, false if tile is hidden
	 */
	private boolean visibility;
	
	/**
	 * The pipe's type
	 */
	private PipeConnection pipeType;
	
	/**
	 * If true, the pipe is Full.
	 */
	private boolean isFull;
	
	/**
	 * Create an invisible element using the type code
	 * @param connection name of the pipe's kind
	 * 
	 */
	public Element(PipeConnection connection) {
	this.visibility=false;
	this.setFull(false);
	this.pipeType=connection;
	}
		
	/**
	 * @return true if the element was discovered
	 */
	public boolean isVisible()
	{
		return this.visibility;
	}
	/**
	 * @return one of the PipeConnection
	 */
	public PipeConnection getPipeType() {
		return this.pipeType;
	}

	/**
	 * @return true if the pipe is full
	 */
	public boolean isFull() {
		return this.isFull;
	}

	/**
	 * @param isFull used to change the water level.
	 */
	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}
	}