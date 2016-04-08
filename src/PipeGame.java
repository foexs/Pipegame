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
		this.grid = new Element[x][y];
		
		// TODO Everything here
		
	}
	/**
	 * Method used to define the grid's content with random elements
	 */
	public void randomGrid()
	{
		for (int i = 0; i < this.maxY; i++)
		{
			for (int j = 0; j < this.maxX; j++)
			{
				
				this.grid[i][j]=new Element(PipeConnection.getRandomValue());
			}
		}
	}

	
	public void fillProceduralGrid(){
		int colonneActuelle;
		int ligneActuelle;
		for (colonneActuelle = 0; colonneActuelle< this.maxY; colonneActuelle++){
			for(ligneActuelle = 0; ligneActuelle < this.maxX; ligneActuelle++){
							
			}
		}
	}
	
	/**
	 * Prints the grid to the screen in the console
	 */
	public void printGridToAscii(){
		int i;
		String grid="";
		int j;
		
		for (i=0;i<this.maxX;i++){
			for (j=0;j<this.maxY;j++){
				grid=grid+this.grid[i][j].getPipeType().toAscii();
			}
			grid=grid+"\n";
		}
		System.out.println(grid);
		}
	/**
	 * Plays the game It contains the main algorithm that allows the user to play.
	 * @return true if win, false if loose
	 */
	public boolean play()
	{
		randomGrid();
		printGridToAscii();
		return false;
	}


}