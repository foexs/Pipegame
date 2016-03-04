
/**
 * Represent a grid of a given size
 * @author foexs
 */
public class Element {
	private final static int DEFAULT_HEIGHT=9;
	private final static int DEFAULT_S_Y=DEFAULT_HEIGHT/2;//the middle of the right
	private final static int DEFAULT_E_Y=1;
	private int height;
	private int width;
	/**
	 * Generate a default starting point in the middle of the right
	 */
	public Element(){
		this.height=DEFAULT_HEIGHT;
		this.width=DEFAULT_S_Y;
	}
	/**
	 * Generate a x*y element
	 * @param x
	 * @param y
	 */
	public Element(int x, int y){
		this.height=x;
		this.width=y;
	}
}
