// TODO update README.md (what/who)

// TODO fix comment (ask for advice)
/**
 * Entry class
 * @author foexs
 *
 */
public class Main {

	// TODO fix comment (what the purpose of args?)
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
