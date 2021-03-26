public class Ellipse implements AreaShape {
    double x_radius;
    double y_radius;

    public Ellipse(double x_radius,double y_radius){
        this.x_radius = x_radius;
        this.y_radius = y_radius;
    }

    public double getx_Radius() {
        return this.x_radius;
    }

    public double gety_Radius() {
        return this.y_radius;
    }

    @Override
    public double getArea() {
        return Math.PI * x_radius * y_radius;
    }

    @Override
    public void draw() {
        System.out.println("Ellipse");
    }

}
