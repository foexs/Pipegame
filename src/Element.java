/**
 * Represent an element from the game
 * @author foexs
 */
public class Element {
	// TODO write comment(removed)
	//private final static int DEFAULT_WIDTH=21;
	
	// TODO write comment(removed)
	//private final static int DEFAULT_HEIGHT=9;
	
	// TODO write comment(removed)
	//private final static int DEFAULT_S_X=DEFAULT_HEIGHT/2;
	
	// TODO write comment(removed)
	//private final static int DEFAULT_E_X=1;
	
	private String name;
	/**
	 * An element is labeled by name
	 * There is 6 kind of pipes:
	 * P_S_E;P_O_E;P_N_S;P_S_O;P_N_O;P_N_E
	 * See the graph in the docs folder for details
	 * @param givenName A name acting as an identifier for each elements
	 */
	public Element(String givenName){
		this.name=givenName;
	}
	/**
	 * @return the name of the object
	 */
	public String getName() {
		return name;
	}
}
