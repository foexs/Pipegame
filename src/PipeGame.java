
/**
 *PipeGame game
 * @author foexs
 */
public class PipeGame {
	private final static int DEFAULT_WATER_LEVEL=-5;
	private final static int DEFAULT_PIPE_LEVEL=1;
	private int	waterLevel;
	private int pipeLevel;
	
	/**
	 * Prepare a blank game
	 */
	public PipeGame(){
		waterLevel=DEFAULT_WATER_LEVEL;
		pipeLevel=DEFAULT_PIPE_LEVEL;
		Grid grid=new Grid();
	}
	/**
	 * Start a new game
	 * @return true if win, false if loose
	 */
	boolean Start(){
		
		return false;
	}

}