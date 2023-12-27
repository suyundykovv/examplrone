import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MyApplication {
    public static void main(String[] args)throws FileNotFoundException{
        ArrayList<Point> points = readCoordinatesFromFile("Coordinates");

    }
    Shape shape = new Shape();

    double perimeter = shape.calculatePerimeter();
    double longestSide = shape.findLongestSide();
    double averageSide = shape.findAverageSide();

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Longest Side: " + longestSide);
        System.out.println("Average Side: " + averageSide);

}
