package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Squares")
    class TestSquares {
        @Test
        void testAddFigure() {
            //Given
            Shape square = new Square(5);
            ShapeCollector shapeCollector = new ShapeCollector(null);

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(1, shapeCollector.getFigureListQuantity());
        }
        @Test
        public void testRemoveFigure(){
            //Given
            Shape square = new Square(4.5);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(square);

            //Then
            Assertions.assertEquals(0, shapeCollector.getFigureListQuantity());
        }
        @Test
        public void testGetFigure(){
            //Given
            Shape square = new Square(4.5);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(square);

            //When
            Shape getShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(getShape, square);
        }
        @Test
        public void testShowFigures(){
            //Given
            Shape square1 = new Square(4.5);
            Shape square2 = new Square(4.5);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(square1);
            shapeCollector.addFigure(square2);

            //When
            String theShapeName = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("SquareSquare", theShapeName);
        }

    }
    @Nested
    @DisplayName("Tests for Circles")
    class TestCircles {
        @Test
        void testAddFigure() {
            //Given
            Shape circle = new Circle(5);
            ShapeCollector shapeCollector = new ShapeCollector(null);

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getFigureListQuantity());
        }
        @Test
        public void testRemoveFigure(){
            //Given
            Shape circle = new Circle(4.5);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertEquals(0, shapeCollector.getFigureListQuantity());
        }
        @Test
        public void testGetFigure(){
            //Given
            Shape circle = new Circle(4.5);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(circle);

            //When
            Shape getShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(getShape, circle);
        }
        @Test
        public void testShowFigures(){
            //Given
            Shape circle1 = new Circle(4.5);
            Shape circle2 = new Circle(4.5);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(circle1);
            shapeCollector.addFigure(circle2);

            //When
            String theShapeName = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("CircleCircle", theShapeName);
        }
    }
    @Nested
    @DisplayName("Tests for Triangles")
    class TestTriangles {
        @Test
        void testAddFigure() {
            //Given
            Shape triangle = new Triangle(4.5,7.3);
            ShapeCollector shapeCollector = new ShapeCollector(null);

            //When
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getFigureListQuantity());
        }
        @Test
        public void testRemoveFigure(){
            //Given
            Shape triangle = new Triangle(4.5,7.3);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(triangle);

            //When
            shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertEquals(0, shapeCollector.getFigureListQuantity());
        }
        @Test
        public void testGetFigure(){
            //Given
            Shape triangle = new Triangle(4.5,7.3);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(triangle);

            //When
            Shape getShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(getShape, triangle);
        }
        @Test
        public void testShowFigures(){
            //Given
            Shape triangle1 = new Triangle(4.5,7.3);
            Shape triangle2 = new Triangle(8.4,3.6);
            ShapeCollector shapeCollector = new ShapeCollector(null);
            shapeCollector.addFigure(triangle1);
            shapeCollector.addFigure(triangle2);

            //When
            String theShapeName = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("TriangleTriangle", theShapeName);
        }
    }
}



