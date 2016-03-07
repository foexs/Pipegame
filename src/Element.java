
// TODO rename class according to its description(description changed)
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
	// TODO fix comment by really commenting what this constructor creates(not needed)
	/**
	 * An element is labeled by name
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
