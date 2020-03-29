public class Square extends Shape implements IColorable {
    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea(){
        return this.size * this.size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSize() +
                ", area= " + this.getArea();
    }
}
