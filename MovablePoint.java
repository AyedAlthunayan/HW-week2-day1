public class MovablePoint implements Moveble {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "(x,y), speed=("+x+","+y+")";
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
