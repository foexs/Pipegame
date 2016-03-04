
/**
 * Entry class
 * @author foexs
 *
 */
public class Main {

	/**
	 * Entry point
	 * @param args
	 */
	public static void main(String[] args) {
		if (new PipeGame().Start()){
			System.out.println("Victoire!");
		}
		else
			System.out.println("Ha! Perdu!");
			
	}

}
