
// TODO update comment by adding a description of the game (link), in english
/**
 *PipeGame game
 * @author foexs
 */
public class PipeGame {
	
	// TODO write comment
	private final static int DEFAULT_WATER_LEVEL=-5;
	
	// TODO write comment
	private final static int DEFAULT_PIPE_LEVEL=1;
	
	// TODO write comment
	private int	waterLevel;
	
	// TODO write comment
	private int pipeLevel;
	
	// TODO write comment
	private Element startingPoint;

	// TODO fix comment by detailing how is supposed to be a "blank" game
	/**
	 * Prepare a blank game
	 */
	public PipeGame(){
		this.waterLevel=DEFAULT_WATER_LEVEL;
		this.pipeLevel=DEFAULT_PIPE_LEVEL;
		this.startingPoint=new Element();
	}
	
	// TODO fix comment by detailing the main algorithm
	/**
	 * Start a new game
	 * @return true if win, false if loose
	 */
	boolean Start(){
		while(true){
			if (waterLevel==pipeLevel){
				return false;
			}
		}
	}

}