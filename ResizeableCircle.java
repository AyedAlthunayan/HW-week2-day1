public class ResizeableCircle extends Circle implements Resizable{
    public ResizeableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizeableCircle{" +
                "radius=" + radius +
                '}';
    }
    public void resize (int percent){
        radius*= percent/100.0;
    }
}
