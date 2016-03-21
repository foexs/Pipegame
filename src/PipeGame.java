/**
 * Represents a Pipe Game game. At the start of the game, click the covered
 * tiles to reveal them, and swap the positions of two tiles. Slowly, the hot
 * java will make its way through the course.
 * 
 * @author foexs
 */
public class PipeGame
{

	// TODO fix comment (ask for advice)
	/**
	 * A grid starts at 1;1 and ends at maxY;maxX
	 * Game's grid line number
	 */
	private int maxY;
	/**
	 * Code for the pipe kind
	 *
	public static final int NORTH_EAST = 1;
	 *
	 * Code for the pipe kind
	 *
	public static final int	NORTH_SOUTH = 2;
	 *
	 * Code for the pipe kind
	 *
	public static final int	NORTH_WEST = 3;
	 *
	 * Code for the pipe kind
	 *
	public static final int	SOUTH_EAST = 4;
	 *
	 * Code for the pipe kind
	 *
	public static final int SOUTH_WEST =5;
	 *
	 * Code for the pipe kind
	 *
	public static final int	EAST_WEST =6;
	 *
	 * Game's grid column number
	 */
	private int maxX;

	/**
	 * The game's grid filled with game elements like pipes.
	 */
	Element[][] grid;

	// TODO
	/**
	 * Creates a new game, ready to be played
	 * 
	 * @param y
	 *            Line number
	 * @param x
	 *            Column number
	 */
	public PipeGame(int y, int x)
	{
		this.maxY = y;
		this.maxX = x;
		
		this.grid = new Element[y][x];
		
		// TODO Everything here
		for (int i = 1; i < y; i++)
		{
			for (int j = 1; j < x; j++)
			{
				this.grid[i][j] = new Element(PipeConnection.SOUTH_WEST);
			}
		}
	}

	// TODO fix comment by detailing the main algorithm
	/**
	 * Plays the game It contains the main algorithm that allows the user to play.
	 * @return true if win, false if loose
	 */
	public boolean play()
	{

		return false;
	}


}