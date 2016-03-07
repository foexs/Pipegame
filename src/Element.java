
// TODO rename class according to its description
/**
 * Represent a grid of a given size
 * @author foexs
 */
public class Element {
	// TODO write comment
	private final static int DEFAULT_HEIGHT=9;
	
	// TODO write comment
	private final static int DEFAULT_S_Y=DEFAULT_HEIGHT/2;//the middle of the right
	
	// TODO write comment
	private final static int DEFAULT_E_Y=1;
	
	// TODO write comment
	private int height;

	// TODO write comment
	private int width;
	
	// TODO fix comment by really commenting what this constructor creates
	/**
	 * Generate a default starting point in the middle of the right
	 */
	public Element(){
		this.height=DEFAULT_HEIGHT;
		this.width=DEFAULT_S_Y;
	}
}
