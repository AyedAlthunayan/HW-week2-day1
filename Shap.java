public abstract class Shap {
    protected String color = "red";
    protected boolean filled= true;
    public Shap (){

    }

    public Shap(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled (){
        return this.filled;

    }
    public void setFilled (boolean filled){
        this.filled=filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
      return "shape [ color="+getColor()+","+"filled ="+filled+"";
    }



}
