public class TestShape 
{
    public static void main(String[] args) 
    {
        //Declare and allocate a new instance of shape with default color and filled
        Shape s1 = new Shape();     // it's identifier for the first output
        System.out.println(s1.toString());

        // Declare and allocate a new instance of shape with given values color and filled
        Shape s2 = new Shape("white",true); // it's identifier for the second output
        System.out.println(s2.toString() + "\n" );
        
        //Declare and allocate a new instance of Circle with default 
        Circle c1 = new Circle();     // it's identifier for the first output
        System.out.println(c1.toString());

        // Declare and allocate a new instance of Circle with given values 
        Circle c2 = new Circle(10.0); // it's identifier for the second output
        System.out.println(c2.toString());

        // Declare and allocate a new instance of Circle with given values color and filled
        Circle c3 = new Circle(100.0,"White", true); // it's identifier for the Third output
        System.out.println(c3.toString() + "\n" );

        //Declare and allocate a new instance of Rectangle with default 
        Rectangle R1 = new Rectangle();     // it's identifier for the first output
        System.out.println(R1.toString());

        // Declare and allocate a new instance of Rectangle with given values 
        Rectangle R2 = new Rectangle(10.0,15.0); // it's identifier for the second output
        System.out.println(R2.toString());

        // Declare and allocate a new instance of Rectangle with given values color and filled
        Rectangle R3 = new Rectangle(25.0,15.0,"black", true); // it's identifier for the third output
        System.out.println(R3.toString() + "\n" );

        //Declare and allocate a new instance of Square with default 
        Square Sq1 = new Square();     // it's identifier for the first output
        System.out.println(Sq1.toString());

        // Declare and allocate a new instance of Square with given values 
        Square Sq2 = new Square(25.0); // it's identifier for the second output
        System.out.println(Sq2.toString());

        // Declare and allocate a new instance of Square with given values color and filled
        Square Sq3 = new Square(30.0,"White", true); // it's identifier for the third output
        System.out.println(Sq3.toString() + "\n" );
    }
}
