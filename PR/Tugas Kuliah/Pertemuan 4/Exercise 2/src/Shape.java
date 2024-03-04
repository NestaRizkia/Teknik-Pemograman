public class Shape 
{
    // private instance variable
    private String color;
    private Boolean filled;

    // 1st Constructs a shape instance with default value for color and filled 
    public Shape() 
    {
        color = "green";
        filled = true;
    }

    // 2nd Construct a shape instance with given values for color and filled
    public Shape(String color,boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor()
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled()
    {
        this.filled = filled;
    }

    public String toString()
    {
        return ("A shape with [color of = " + color + " and " + filled + "]");
    }
}
