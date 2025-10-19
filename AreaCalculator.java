public class AreaCalculator {

    public int calculateArea(int side) {
        return side * side;
    }

    public int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        int squareArea = obj.calculateArea(5);
        int rectangleArea = obj.calculateArea(4, 6);

        System.out.println("Area of square: " + squareArea);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}

