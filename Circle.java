package edu.txst.assignment2;

/**
 * Class to create circles, implementing the Shape
 * interface. Contains the private attribute radius (double),
 * a constructor that is used to create the circle, and getArea(),
 * getClassName(), and toString() methods. The getArea() and
 * getClassName() methods are inherited from the Shape interface.
 *
 * @author Roland Price
 * @version 1.0
 */
public class Circle implements Shape {
  private double radius;  // Radius of the circle

  /**
   * Constructor for the circle object. Sets the
   * circle's radius to a user-inputted radius.
   *
   * @param radius radius of the circle
   */
  public Circle(double radius){
    this.radius = radius;
  }

  /**
   * Gets the area of the circle object through
   * the formula PI * r^2.
   *
   * @return area of the circle
   */
  public double getArea(){
    return Math.PI * radius * radius;
  }

  /**
   * Returns the name of the class (circle)
   *
   * @return the name of the class (circle)
   */
  public String getClassName(){
    return "Circle";
  }

  /**
   * Overridden version of the toString() method,
   * returning a string representation of the
   * circle object in the form of:
   * "Circle (r = radius)"
   *
   * @return string representation of a circle object
   */
  @Override
  public String toString(){
    return "Circle (r = " + radius + ")";
  }
}
