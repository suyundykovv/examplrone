import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> points;

    public Shape(ArrayList<Point> points) {
        this.points = points;
}
    public double calculatePerimeter() {
        double perimeter = 0;
        int size = points.size();

        for (int i = 0; i < size; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % size);
            perimeter += currentPoint.distance(nextPoint);
        }

        return perimeter;
    }
    public double findLongestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size()); // Circular, connects last to first point

            double currentSide = currentPoint.distance(nextPoint);
            if (currentSide > longestSide) {
                longestSide = currentSide;
            }
        }

        return longestSide;
    }

    public double findAverageSide() {
        double totalSideLength = 0;

        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size()); // Circular, connects last to first point

            totalSideLength += currentPoint.distance(nextPoint);
        }

        return totalSideLength / points.size();
    }
}
