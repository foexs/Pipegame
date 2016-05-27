import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * Player input
 * @author foexs
 *
 */
public interface Player {
	

	/**
	 * Ask the user for a tile's coordinate
	 * @param playerInput a scanner
	 * @return a tile's coordinate to set 
	 */
	public Dot AskForTile();
	
}
