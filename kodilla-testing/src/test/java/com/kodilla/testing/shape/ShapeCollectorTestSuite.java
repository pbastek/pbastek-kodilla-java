package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {

    static private int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Testing has started for " + ShapeCollector.class);
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("Finished all tests "+ ShapeCollector.class);
    }

    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Test Number: "+testCounter);
    }

    @Test
    public void shouldAddFigure(){

        //Given
        Square square = new Square(3.0);
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(square);

        //Then
        Assert.assertEquals(1,collector.getFiguresNumber());
    }

    @Test
    public void shouldAddNullFigure(){

        //Given
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(null);

        //Then
        Assert.assertEquals(0,collector.getFiguresNumber());
    }

    @Test
    public void shouldRemoveFigure(){

        //Given
        Square square = new Square(6.0);
        Triangle triangle = new Triangle(6.0,3.0);
        Circle circle = new Circle(3.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);
        collector.addFigure(circle);
        Assert.assertEquals(3,collector.getFiguresNumber());

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void shouldRemoveNotExistingFigure(){

        //Given
        Square square = new Square(6.0);
        Triangle triangle = new Triangle(6.0,3.0);
        Circle circle = new Circle(3.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);

        //When
        boolean result = collector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void shouldRemoveNullFigure(){

        //Given
        Square square = new Square(6.0);
        Triangle triangle = new Triangle(6.0,3.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);

        //When
        boolean result = collector.removeFigure(null);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void shouldGetFigure(){

        //Given
        Square square = new Square(6.0);
        Triangle triangle = new Triangle(6.0,3.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);

        //When
        Shape shape = collector.getFigure(1);

        //Then
        Assert.assertTrue(shape instanceof Square);
    }

    @Test
    public void shouldGetFigureOutOfRange(){

        //Given
        ShapeCollector collector = new ShapeCollector();

        //When
        Shape shape = collector.getFigure(5);

        //Then
        Assert.assertEquals(null,shape);
    }

    @Test
    public void shouldShowFigures(){

        //Given
        Triangle triangle = new Triangle(6.0,3.0);
        Square square = new Square(6.0);
        Circle circle = new Circle(3.0);
        String expected = "Triangle, Square, Circle";
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);
        collector.addFigure(circle);

        //When
        String result = collector.showFigures();

        //Then
        Assert.assertEquals(expected,result);
    }
}
