package edu.txst.assignment2;

/**
 * Class that creates Triangles. Has variables for base & height.
 * contains getArea, getClassName, and toString methods.
 * 
 * @author Ryan Stedman
 * @version 1.0
 */
public class Triangle implements Shape {
    private double base;
    private double height;

    /**
     * contstuctor for the Triangle class.
     * @param base
     * @param height
     */
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * computes area of triangle object with given base and height
     * @return area of the triangle 
     */
    public double getArea(){
        return (0.5 * base * height);
    }

    /**
     * returns the name of our shape (Triangle)
     * @return name of the triangle 
     */
    public String getClassName(){
        return "Triangle";
    }

    @Override
    /**    (non-Javadoc)
     *  
     *   Method to represent the triangle object as a string.
     */
    public String toString() {
        return "Triangle (b = " + base + ", h = " + height + ")";
    }
}
