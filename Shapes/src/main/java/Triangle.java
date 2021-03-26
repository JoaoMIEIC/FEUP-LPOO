public class Triangle implements AreaShape{
    double base,height;

    public Triangle(double base,double  height){
        this.height = height;
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
