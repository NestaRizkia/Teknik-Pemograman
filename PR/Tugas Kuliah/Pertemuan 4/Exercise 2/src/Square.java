class Square extends Rectangle
{
    public Square()
    {
     super();
    }

    public Square(double side)
    {
        super(side,side); // call superclass Rectangle (double,double)
    }

    public Square (double side, String color, boolean filled)
    {
        super(side,side,color,filled);
    }

    public double  getSide()
    {
        return super.getLength();
    }

    public void setSide(double side)
    {
        super.getLength();
    }

    @Override
    public void setLength(double side)
    {
        getSide();
    }

    @Override
    public void setWidth(double side)
    {
        getSide();
    }

    @Override
    public String toString()
    {
        return "A Square with side : " + getSide() + " ,which is a subclass of " + super.toString();
    }

    @Override
    public double getArea() 
    {
        return getSide()*getSide();
    }

    @Override
    public double getPerimeter() 
    {
        return 4*getSide();
    }

    

}
