import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * Player input
 * @author foexs
 *
 */
public abstract class Player {
	

	/**
	 * Ask the user for a tile's coordinate
	 * @param playerInput a scanner
	 * @return a tile's coordinate to set 
	 */
	public static Dot AskForTile(Scanner playerInput)
	{
		int inputX=0;
		int inputY=0;
		System.out.println("Entrez X\n");
		try{
		inputX = playerInput.nextInt();
		System.out.println("X vaut "+inputX);
		System.out.println("\nEntrez Y\n");
		inputY = playerInput.nextInt();	
		}
		catch(InputMismatchException e){
			System.out.println("Entrée invalide");
			throw ;//todo create exception
		}		
		catch(NoSuchElementException e){
			System.out.println("Veuillez entrer quelque chose");
			throw ;//todo create exception
		}		
		
		return new Dot(inputX,inputY);
		//TODO !!!!!!!!!!
	}
	
}
