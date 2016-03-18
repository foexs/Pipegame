/**
	 *There are 6 kinds of pipes:
	 * P_S_E;P_O_E;P_N_S;P_S_O;P_N_O;P_N_E See the graph in the docs folder for
	 * details
	 */
public enum Pipe {
	/**
	 * Link south and west
	 */
	southWest,
	/**
	 * Link south and east
	 */
	southEast,
	/**
	 * Link south and west
	 */
	northWest,
	/**
	 * link north and east
	 */
	northEast,
	/**
	 * link north and south
	 */
	northSouth,
	/**
	 * link west and east
	 */
	westEast;
	
}
