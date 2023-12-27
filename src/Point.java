public class Point {
    private double x;
    private double y;

    public point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point destination) {
        double dX = destination.x - this.x;
        double dY = destination.y - this.y;
        return Math.sqrt(dX * dX + dY * dY);

    }

    @Override
    public String toString(){
        return "("+ x +"," + y + ")";


    }
}
