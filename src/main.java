public class main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        for (Object object : shapes){
            System.out.println(object.toString());
            if (object instanceof IColorable){
                ((IColorable) object).howToColor();
            } 
        }
    }
}
