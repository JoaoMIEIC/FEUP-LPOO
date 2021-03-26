public class Square implements AreaShape{
    double side;

    public Square(double side){
        this.side = side;
    }
    public double getSide() {
        return this.side;
    }

    @Override
    public double getArea() {
        return side *side;
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
