
// TODO update comment by adding a description of the game (link), in english
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
	 */
	private int maxY;

	// TODO write comment
	private int maxX;

	// TODO write comment
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
		
		grid = new Element[y + 1][x + 1];
		
		// TODO rename loop counters
		for (int i = 1; i <= y; i++)
		{
			for (int j = 1; j <= x; j++)
			{
				grid[i][j] = new Element("P_S_E", i, j);
				System.out.println(grid[i][j].coordinateToString());
			}
		}
	}

	// TODO fix comment by detailing the main algorithm
	/**
	 * Plays the game It contains the main algorithm that allows the user to
	 * play.
	 * 
	 * @return true if win, false if loose
	 */
	// TODO add visibility
	// TODO rename method (is is not only about starting the game)
	boolean Start()
	{
		System.out.println(grid[maxY][maxX].getName());

		return false;
	}

}