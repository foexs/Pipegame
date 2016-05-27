
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
	 * Is used to know the last position of the fluid.
	 */
	private Dot lastFluidPosition;

	/**
	 * The game's grid filled with game elements like pipes.
	 */
	private Element[][] grid;
	
	/**
	 * the number of turns before the liquid starts to flow
	 */
	private int freeTurnLeft;

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
		this.lastFluidPosition = new Dot(0,0);
		this.freeTurnLeft=4;
		
		// TODO No longer everything.
		
	}
	
	/**
	 * @return true if the game is over
	 */
	public boolean GameIsOver()
	{
		return false;
		//TODO
	}
	
	/**
	 * @return true if it succeeds
	 */
	public boolean liquidFlows(){
		/**
		 * A dot, the location of the first pipe's output
		 */
		Dot firstOut = this.grid[this.lastFluidPosition.y][this.lastFluidPosition.x].getPipeType().getOutput1().addDot(this.lastFluidPosition);
		/**
		 * A dot, the location of the second pipe's output
		 */
		Dot secondOut = this.grid[this.lastFluidPosition.y][this.lastFluidPosition.x].getPipeType().getOutput2().addDot(this.lastFluidPosition);
		System.out.println(firstOut.toString());
		System.out.println(secondOut.toString());

		/**
		 * Selected pipe used later, secondOut or firstOut
		 */
		Dot nextPipe=null;
		
		if (TileIsValid(firstOut)){
			//The first pipe's output is free
			nextPipe=firstOut;
		}
		else if (TileIsValid(secondOut)){
			//The second pipe's output is free
			nextPipe=secondOut;
		}
		else{
			//There is no valid output: YOU LOSE! Shame on you, noob! :p
			return false;
		}
		
		if (this.grid[nextPipe.y][nextPipe.x].getPipeType().getOutput1().addDot(nextPipe).equals(this.lastFluidPosition)
			||
			this.grid[nextPipe.y][nextPipe.x].getPipeType().getOutput2().addDot(nextPipe).equals(this.lastFluidPosition))
			{
				//next pipe is oriented so the liquid can flow ;)
				this.grid[nextPipe.y][nextPipe.x].setFull(true);
				this.lastFluidPosition=(new Dot(nextPipe.x,nextPipe.y));
				return true;
			}
		//The free pipe ahead is not well oriented, the liquid leaks, you lose.
		return false;
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
		return true;
	}
	
	/**
	 * @param currentTile current tile
	 * @return true if the tile is valid AND visible
	 */
	public boolean tileIsValidAndVisible(Dot currentTile){
		if(TileIsValid(currentTile)){
			if(this.grid[currentTile.y][currentTile.x].isVisible()){
				return true;
			}
		}
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
	 * @param firstTile  Dot that represents the first tile, on which the second'll be.
	 * @param secondTile  Dot that represents the second tile, on which the first'll be.
	 * Swap tiles.
	 */
	public void swapTiles(Dot firstTile, Dot secondTile){
		Element buffer = this.grid[firstTile.y][firstTile.x];
	    this.grid[firstTile.y][firstTile.x] = this.grid[secondTile.y][secondTile.x];
	    this.grid[secondTile.y][secondTile.x] = buffer;
	}
	/**
	 * Prints the grid to the screen in the console
	 */
	public void printGridToAscii(){
		//only works on linux (utf)
		int y=0;
		int x;
		String grid=" ";
		
		/**
		 *Display the HUD for X 
		 */
		for (x=0;x<this.maxX;x++){
			grid+=x;
		}
		
		/**
		 * 
		 */
		for (y=0;y<this.maxY;y++){
			grid+="\n"+y;
			for (x=0;x<this.maxX;x++){
				if (this.grid[y][x].isVisible()){
					grid+=this.grid[y][x].getPipeType().toAscii();
				}
				else if (this.grid[y][x].isFull()){
					grid+="#";
				}
				else{
					grid+="?";

				}
			}
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
		Player player=new Humain();
		
		Dot selectedTile=new Dot(-1,-1);
		while (!GameIsOver())
		{
			printGridToAscii();
			
			do
			{
				selectedTile= player.AskForTile();
				
			}
			while (!TileIsValid(selectedTile));
			     
			if (!this.grid[selectedTile.y][selectedTile.x].isVisible())
			{
				this.grid[selectedTile.y][selectedTile.x].discover();
			}
			else
			{
				Dot secondSelectedTile=new Dot(-1,-1);
			   	do
			   	{
					secondSelectedTile= player.AskForTile();
			   	}
			    while (!tileIsValidAndVisible(secondSelectedTile));
			    {
			    swapTiles(selectedTile, secondSelectedTile);
			    }
			}
			System.out.println(this.freeTurnLeft);
		    if (this.freeTurnLeft>0){
		    	this.freeTurnLeft--;
		    }
		    else{
				if(!liquidFlows()) return false;    
		    }
			
		}
		return false;
}


}