import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Humain implements Player {

	@Override
	public Dot AskForTile() {
		Scanner playerInput=new Scanner(System.in);
		int inputX=0;
		int inputY=0;
		System.out.println("Entrez X\n");
		try{
		inputX = playerInput.nextInt();
		System.out.println("\nEntrez Y\n");
		inputY = playerInput.nextInt();	
		}
		catch(InputMismatchException e){
			System.out.println("Entrée invalide");
			return new Dot(-1,-1);
			}		
		catch(NoSuchElementException e){
			System.out.println("Veuillez entrer quelque chose");
			return new Dot(-1,-1);
		}		
		
		return new Dot(inputX,inputY);
	}

}