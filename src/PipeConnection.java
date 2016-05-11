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
	SOUTH_WEST("╗", new Dot(-1,0),new Dot(0,1)),
	/**
	 * Link south and east
	 */
	SOUTH_EAST("╔", new Dot(1,0),new Dot(0,1)),
	/**
	 * Link north and west
	 */
	NORTH_WEST("╝", new Dot(-1,0),new Dot(0,-1)),
	/**
	 * link north and east
	 */
	NOTH_EAST("╚", new Dot(1,0),new Dot(0,-1)),
	/**
	 * link north and south
	 */
	NORTH_SOUTH("║", new Dot(0,1),new Dot(0,-1)),
	/**
	 * link west and east
	 */
	WEST_EAST("═", new Dot(-1,0),new Dot(1,0));
	
	/**
	 * The character representing the PipeConnection
	 */
	private String AsciiChar;
	
	private Dot output1;
	
	private Dot output2;
	
	/**
	 * @param Ascii the character representing the PipeConnection
	 */
	private PipeConnection(String Ascii, Dot output1, Dot output2){
		this.AsciiChar = Ascii;
		this.output1=output1;
		this.output2=output2;
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
	public Dot getOutput1() {
		return this.output1;
	}

	public Dot getOutput2() {
		return this.output2;
	}

	
}
