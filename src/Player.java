import java.util.Scanner;
/**
 * Player input
 * @author foexs
 *
 */
public abstract class Player {
	

	/**
	 * Ask the user for a tile's coordinate
	 * @return a tile's coordinate to set 
	 */
	public static Dot AskForTile()
	{
		Scanner playerInput = new Scanner( System.in );
		System.out.println("Entrez X\n");
		int inputX = playerInput.nextInt();
		System.out.println("\nEntrez Y\n");
		int inputY = playerInput.nextInt();
		playerInput.close();
		return new Dot(inputY,inputX);
		//TODO !!!!!!!!!!
	}
	
}
