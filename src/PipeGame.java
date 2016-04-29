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
		this.grid = new Element[y][x];
		
		// TODO Everything here
		
	}
	/**
	 * @return true if the game is over
	 */
	public boolean GameIsOver()
	{
		//TODO
	}

	
	/**
	 * @param currentTile the coordinates of the 
	 * @return true if the element is in the grid and empty
	 */
	public boolean TileIsValid(Dot currentTile){
		
		if(currentTile.x<0 || currentTile.x>=this.maxX)
			return false;
		if (currentTile.y<0 || currentTile.y>=this.maxY)
			return false;
		if(this.grid[currentTile.y][currentTile.x].isFull())
			return false;
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

	
	/**
	 * In progress
	 * Fill the grid with tiles allowing the player to win
	 */
	public void fillProceduralGrid(){
		int colonneActuelle;
		int ligneActuelle;
		for (colonneActuelle = 0; colonneActuelle< this.maxY; colonneActuelle++){
			for(ligneActuelle = 0; ligneActuelle < this.maxX; ligneActuelle++){
						//TODO	
			}
		}
	}
	
	/**
	 * Prints the grid to the screen in the console
	 */
	public void printGridToAscii(){
		int y;
		int x;
		String grid="";
		
		for (x=0;x<this.maxX;x++){
			for (y=0;y<this.maxY;y++){
				grid=grid+this.grid[y][x].getPipeType().toAscii();
			}
			grid=grid+"\n";
		}
		System.out.println(grid);
		}
	
	/**
	 * Plays the game
	 * 
	 * while (<game is not over>)
	 * {
	 *    <display grid>
	 *  
	 *    do
	 *    {
	 *    	<ask player to select a tile>
	 *    }
	 *    while (tile is not valid)
	 *    
	 *    if (tile is not discovered)
	 *    {
	 *    	<discover the tile>
	 *    }
	 *    else
	 *    {
	 *     	do
	 *    	{
	 *    		<ask player to select a tile>
	 *    	}
	 *      while (tile is not valid)
	 *      <swap tiles>
	 *    }
	 *    <liquid flows>
	 * }
	 * 
	 * @return true if win, false if loose
	 */
	public boolean play()
	{
		randomGrid();
		Dot selectedTile;
		while (!GameIsOver())
		{
			printGridToAscii();
			
			do
			{
				selectedTile= Player.AskForTile();
			}
			while (!TileIsValid(selectedTile));
			     
			if (grid[selectedTile.y][selectedTile.x].isVisible())
			{
			  	//<discover the tile>
			}
			else
			{
			   	do
			   	{
			   		//<ask player to select a tile>
			   	}
			    while (!TileIsValid(selectedTile))
			    {
			    //   <swap tiles>
			    }
			 //<liquid flows>
			 }
		return false;
	}


}