/**
 * Application that launches a pipeGame game
 * @author FOEX Simon, POPEK Nicolas
 *
 */
public class Main {
	/**
	 * Default number of lines
	 */
	public static final int DEFAULT_GRID_Y=7;
	/**
	 * Default number of columns
	 */
	public static final int DEFAULT_GRID_X=7;
	/**
	 * Application's  main
	 * @param args command-line arguments (unused)
	 */
	public static void main(String[] args) {
		if (new PipeGame(DEFAULT_GRID_Y,DEFAULT_GRID_X).play()){
			System.out.println("Victoire!");
		}
		else
			System.out.println("Ha! Perdu!");
	}

}
