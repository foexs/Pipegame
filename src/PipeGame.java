
// TODO update comment by adding a description of the game (link), in english
/**
 *Pipe Game game instance.
 *At the start of the game, click the covered tiles to reveal them, and swap the positions of two tiles. Slowly, the hot java will make its way through the course.
 * @author foexs 
 */
public class PipeGame {
	/**
	 * A grid starts at 1;1 and ends at maxY;maxX
	 */
	private int maxY;
	private int maxX;
	Element [][] grid;
	/**
	 * Initializes a new game and fills the grid by filling it with "Element"
	 * and makes the size of the grid [y+1,x+1]
	 * @param y Line number
	 * @param x Column number
	 */
	public PipeGame(int y,int x){
		this.maxY=y;
		this.maxX=x;
		grid= new Element[y+1][x+1];
		for(int i=1;i<=y;i++){
			for(int j=1;j<=x;j++){
				grid[i][j]=new Element("P_O_E",i,j);
			}
		}
	}
	
	// TODO fix comment by detailing the main algorithm
	/**
	 * Plays the game
	 * It contains the main algorithm that allows the user to play.
	 * @return true if win, false if loose
	 */
	boolean Start(){
		System.out.println(grid[maxY][maxX].getName());
		/**
		 * You loose
		 */
		return false;
	}

}