// TODO this class is very lightly specified, and seems to complex (ask for advice)
//TODO:ADD all the pipe types classes
/**
 * Describe general behavior of a pipe, it contain its position and can give the
 * coordinates of the two direction you can connect to
 * 
 * @author simon
 *
 */
public class Pipe
{
	/**
	 * A pipe is labeled by name There is 6 kind of pipes:
	 * P_S_E;P_O_E;P_N_S;P_S_O;P_N_O;P_N_E See the graph in the docs folder for
	 * details
	 */

	// TODO write comment
	protected int posPipeY;

	// TODO write comment
	protected int posPipeX;

	// TODO write comment
	protected int posIPipeY;

	// TODO write comment
	protected int posIPipeX;

	// TODO write comment
	protected int posOPipeY;

	// TODO write comment
	protected int posOPipeX;

	// TODO fix comment
	/**
	 * @return the line of the pipe
	 */
	public int getPosPipeY()
	{
		return posPipeY;
	}

	//TODO fix comment
	/**
	 * @return the column of the pipe
	 */
	public int getPosPipeX()
	{
		return posPipeX;
	}

	//TODO fix comment
	/**
	 * @return the Y position of one of the pipe's side
	 */
	public int getIPosPipeY()
	{
		return posIPipeY;
	}

	//TODO fix comment
	/**
	 * @return the X position of one of the pipe's side
	 */
	public int getIPosPipeX()
	{
		return posIPipeX;
	}

	//TODO fix comment
	/**
	 * @return the Y position of the other pipe's side
	 */
	public int getOPosPipeY()
	{
		return posOPipeY;
	}

	//TODO fix comment
	/**
	 * @return the X position of the other pipe's side
	 */
	public int getOPosPipeX()
	{
		return posOPipeX;
	}

	//TODO fix comment
	/**
	 * @return the position of the pipe and of the two I/O's in y,x form
	 */
	public String toString()
	{
		return "Position: " + posPipeY + "," + posPipeX + "\nTo " + posIPipeY + "," + posIPipeX + " and " + posOPipeY
				+ "," + posOPipeX;
	}
}
