/**
 * A dot in a 2D referential
 * @author foexs
 *
 */
public class Dot {
/**
 * the column number
 */
int x;
/**
 * the line number
 */
int y;
/**
 * @param x the column number
 * @param y the line number
 */
public Dot(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
/**
 * @return the column number
 */
public int getX() {
	return this.x;
}
/**
 * @return the line number
 */
public int getY() {
	return this.y;
}
/**
 * @param secondDot another dot
 * @return sum of the dot's coordinates
 */
public Dot addDot(Dot secondDot){
	return new Dot(this.x+secondDot.x,this.y+secondDot.y);
}
public String toString(){
	return "x:"+this.x+" y:"+this.y;
}
}
