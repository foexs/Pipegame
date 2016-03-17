/**
 * This is a pipe that have south and east inputs and can give the coordinates of the two direction you can connect to
 * @author simon
 */
public class P_S_E extends Pipe {
	

	/**
	 * define the two zones where the liquid can come from
	 * @param posY
	 * @param posX
	 */
	public P_S_E(int posY, int posX) {
		this.posPipeY=posY;
		this.posPipeX=posX;
		this.posIPipeY=posY+1;
		this.posIPipeX=posX;
		this.posOPipeY=posY;
		this.posOPipeX=posX+1;
	}

}
