// TODO update README.md (what/who)

// TODO fix comment (ask for advice)
/**
 * Entry class
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
	// TODO fix comment (what the purpose of args?)
	/**
	 * Application's  mark
	 * @param args
	 */
	public static void main(String[] args) {
		if (new PipeGame(DEFAULT_GRID_Y,DEFAULT_GRID_X).Start()){
			System.out.println("Victoire!");
		}
		else
			System.out.println("Ha! Perdu!");
			
	}

}
