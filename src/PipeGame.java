
/**
 *PipeGame game
 * @author foexs
 */
public class PipeGame {
	private final static int DEFAULT_WATER_LEVEL=-5;
	private final static int DEFAULT_PIPE_LEVEL=1;
	private int	waterLevel;
	private int pipeLevel;
	private Element startingPoint;
	/**
	 * Prepare a blank game
	 */
	public PipeGame(){
		this.waterLevel=DEFAULT_WATER_LEVEL;
		this.pipeLevel=DEFAULT_PIPE_LEVEL;
		this.startingPoint=new Element();
	}
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