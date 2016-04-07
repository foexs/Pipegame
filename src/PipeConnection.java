import java.lang.Math;

/**
	 *There are 6 kinds of pipes:
	 * P_S_E;P_O_E;P_N_S;P_S_O;P_N_O;P_N_E See the graph in the docs folder for
	 * details
	 */
public enum PipeConnection {
	/**
	 * Link south and west
	 */
	SOUTH_WEST("╗"),
	/**
	 * Link south and east
	 */
	SOUTH_EAST("╔"),
	/**
	 * Link north and west
	 */
	NORTH_WEST("╝"),
	/**
	 * link north and east
	 */
	NOTH_EAST("╚"),
	/**
	 * link north and south
	 */
	NORTH_SOUTH("║"),
	/**
	 * link west and east
	 */
	WEST_EAST("═");
	
	/**
	 * The character representing the PipeConnection
	 */
	private String AsciiChar;
	
	/**
	 * @param Ascii the character representing the PipeConnection
	 */
	private PipeConnection(String Ascii){
		this.AsciiChar = Ascii;
	}
	/**
	 * @return One of the PipeConnection randomly selected
	 */
	public static PipeConnection getRandomValue(){
		return values()[(int)(Math.random()*5)];
	}
	/**
	 * @return the ASCII representation of this pipe's kind
	 */
	public String toAscii() {
		return this.AsciiChar;
	}
	
}
