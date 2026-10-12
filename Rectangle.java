package edu.txst.assignment2;

/**
 * Class to create rectangles, implementing the Shape
 * interface. Contains the private attributes width and
 * length (both doubles), a constructor that is used to create
 * the rectangle, and getArea(), getClassName(), and toString()
 * methods. The getArea() and getClassName() methods are
 * inherited from the Shape interface.
 *
 * @author Roland Price
 * @version 1.0
 */
public class Rectangle implements Shape{
  private double width;   // Width of the rectangle
  private double length;  // Length of the rectangle

  /**
   * Constructor for the rectangle. Sets the rectangle's
   * width and length parameters to user-inputted values
   * for each.
   *
   * @param width width of the rectangle
   * @param length length of the rectangle
   */
  public Rectangle(double width, double length){
    this.width = width;
    this.length = length;
  }

  /**
   * Gets the area for the rectangle object, through
   * the formula width * length.
   *
   * @return area of the rectangle
   */
  public double getArea(){
    return width * length;
  }

  /**
   * Returns the name of the current class (rectangle)
   *
   * @return the name of the current class (rectangle)
   */
  public String getClassName(){
    return "Rectangle";
  }

  /**
   * Overridden version of the toString() method,
   * returning a string representation of the
   * rectangle object in the form of:
   * "Rectangle (w = width, l = length)"
   *
   * @return string representation of a rectangle object
   */
  @Override
  public String toString(){
    return "Rectangle (w = " +
        width +
        ", l = " +
        length +
        ")";
  }
}
