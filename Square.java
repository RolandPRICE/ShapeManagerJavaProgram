package edu.txst.assignment2;

/**
 * 
 * Class that creates Squares. only needs one variable for
 * square side length. contains getArea to return area, getClassName to return
 * square name, toString to represent the square as a string.
 * 
 * @author Ryan Stedman
 * @version 1.0
 * 
 */
public class Square implements Shape {
    private double side;

    /**
     * constructor for the Square class.
     * @param side the length of the side of the square
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * computes area of square object with given side length
     * @return area of the square 
     */
    public double getArea(){
        return (side * side);

    }
    /**
     * returns the name of our shape (Square)
     * @return name of the square 
     */
    public String getClassName(){
        return "Square";

    }


    @Override 
    /**    (non-Javadoc)
     *  Method to represent the square object as a string.
     */
    public String toString() {
        return "Square (side = " + side + ")";

  }
}
