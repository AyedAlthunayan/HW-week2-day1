public class MovbleCircle implements Moveble{
    private int radius;
    private MovablePoint center ;

    public MovbleCircle(int x,int y, int xSpeed,int ySpeed,int radiuse) {
        MovablePoint center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radiuse;

    }

    @Override
    public String toString() {
        return "(x,Y),Speed=radius=("+center.x+","+center.y+", radius"+radius;
    }

    public void moveUp (){

    }
    public void moveDown(){

    }
    public void moveLeft(){

    }

    public void moveRight() {

    }
}
