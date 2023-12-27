public class Point {
    private double x;
    private double y;

    public point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double distance (point destination){
        double dx = this.x - destination.x;
        double dy = this.y - destination.y;

        return math.sqrt(dx * dx + dy * dy);

    }

}
