/**
 * Represent an element from the game
 * @author foexs
 */
public class Element {
	private boolean visibility=false;
	private Pipe current;	
	private String name;
	/**
	 * A pipe is labeled by name
	 * There is 6 kind of pipes:
	 * P_S_E;P_O_E;P_N_S;P_S_O;P_N_O;P_N_E
	 * See the graph in the docs folder for details
	 * @param givenName A name acting as an identifier for each elements
	 * @param posY Knows its own position in the grid
	 * @param posX Knows its own position in the grid
	 */
	public Element(String givenName, int posY, int posX){
		this.name=givenName;
		if (this.name=="P_S_E")
			current= new P_S_E(posY, posX);
	}
	/**
	 * @return the name of the object
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return reference to the current element
	 */
	public Pipe getCurrent() {
		return current;
	}
	/**
	 * @return true if the element was discovered
	 */
	public boolean isVisible() {
		return visibility;
	}
	/**
	 * @return the line of the pipe
	 */
	public int getPosPipeY() {
		return current.posPipeY;
	}
	/**
	 * @return the column of the pipe
	 */
	public int getPosPipeX() {
		return current.posPipeX;
	}
	/**
	 * @return the Y position of one of the pipe's side
	 */
	public int getIPosPipeY() {
		return current.posIPipeY;
	}
	/**
	 * @return the X position of one of the pipe's side
	 */
	public int getIPosPipeX() {
		return current.posIPipeX;
	}
	/**
	 * @return the Y position of the other pipe's side
	 */
	public int getOPosPipeY() {
		return current.posOPipeY;
	}
	/**
	 * @return the X position of the other pipe's side
	 */
	public int getOPosPipeX() {
		return current.posOPipeX;
	}
	/**
	 * @return the position of the pipe and of the two I/O's in y,x form
	 */
	public String coordinateToString(){
		return current.toString();
	}
}
