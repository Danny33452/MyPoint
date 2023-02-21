public class MyPoint {
    /**
     * This class using represents a point in a Cartesian coordinate system.
     *
     * AP Computer Science A, Second Semester 2023
     * iDEA HS
     * @author: Instructor, Daniel, and AJ
     *
     */

    /** Member variables */
    private int x;
    private int y;

    /** Constructors */

    // Default constructor
    public MyPoint() {
            this.x = 0;
            this.y = 0;
            }

    // Constructor with parameters
    public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
            }

    /** Accessors and Mutators */
    public int getX() {
            return this.x;
            }

    public void setX(int x) {
            this.x = x;
            }

    public int getY() {
            return this.y;
            }

    public void setY(int y) {
            this.y = y;
            }

    /** Member Methods */

    // Method to find distance between two points
    public double distance(MyPoint point) {
            int xDiff = this.x - point.getX();
            int yDiff = this.y - point.getY();
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
            }

    // Method to find quadrant of a point
    public int quadrant() {
            if (this.x > 0 && this.y > 0) {
            return 1;
            } else if (this.x < 0 && this.y > 0) {
            return 2;
            } else if (this.x < 0 && this.y < 0) {
            return 3;
            } else if (this.x > 0 && this.y < 0) {
            return 4;
            } else {
            return 0;
            }
            }

    // Method to find inverse of a point
    public MyPoint inverse() {
            return new MyPoint(this.y, this.x);
            }

    // toString method override
    @Override
    public String toString() {
            return "(" + this.x + ", " + this.y + ")";
            }
    }
}