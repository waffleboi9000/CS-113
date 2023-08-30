public class Circle {

    private Point center;
    private int radius;
    public Circle(int x, int y, int newRadius){
        center = new Point(x,y);
        radius = newRadius;
    }

    public String toString(){
        return "Center: " + center + ", Radius:" + radius;
    }

    public Point getCenter(){
        return center;
    }
    public int getRadius(){
        return radius;
    }
    public void setCenter(int x, int y){
        center = new Point(x,y);
    }
    public void setRadius(int newRadius){
        radius = newRadius;
    }

    public boolean equals(Circle c1, Circle c2){
        if (c1.getRadius() == c2.getRadius())
            return true;
        else
            return false;
    }
}
