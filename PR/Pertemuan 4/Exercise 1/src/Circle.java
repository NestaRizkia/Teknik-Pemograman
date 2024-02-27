/**
* The Circle class models a circle with a radius and color.
*/
public class Circle 
{ 
    // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    
    // Constructor 3rd task 1.1
    public Circle(double r,String c)
    {
        this.radius = r;
        this.color = c;
    }

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() 
    { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }
    
    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) 
    { // 2nd constructor
        radius = r;
        color = "red";
    }


    
    /** Returns the radius */
    public double getRadius() 
    {
        return radius; 
    }
    
    /** Returns the area of this Circle instance */
    public double getArea() 
    {
        return radius*radius*Math.PI;
    }
    /** Return a self-descriptive string of this instance in the form of 
    Circle[radius=?,color=?] */
    public String toString() 
    {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    // task 1.1
    public String getColor() 
    {
        return color;
    }

    // task 1.1
    public void setColor(String color)
    {
        this.color = color;
    }
}
