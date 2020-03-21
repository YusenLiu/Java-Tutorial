The primary javadoc tags are the following:
  • @author text: Identifies each author (one per line) for a class.
  • @exception exception-name description: Identifies an error condition that is signaled by this method.
  • @param parameter-name description: Identifies a parameter accepted by this method.
  • @return description: Describes the return type and its range of values for a method.

There are other tags as well.

/**
 * This class defines an immutable (x,y) point in the plane.
 *
 * @author ...
 */
public class XYPoint {
    private double x,y;

    /**
     * Construct an (x,y) point at a specified location.
     *
     * @param xCoor The x-coordinate of the point
     * @param yCoor The y-coordinate of the point
     */
    public XYPoint(double xCoor, double yCoor){
        this.x = xCoor;
        this.y = yCoor;
    }

    /**
     * Return x-coordinate value.
     *
     * @return x-coordinate
     */
    public double getX(){return this.x;}

    /**
     * Return y-coordinate value.
     *
     * @return y-coordinate
     */
    public double getY(){return this.y;}
}
